package yeschef.service;

import yeschef.model.Recipe;
import yeschef.dto.RecipeDTO;
import yeschef.repository.RecipeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

/**
 * "A service class is typically used to handle business logic and complex
 * calculations.
 * It acts as a layer between the controller and the repository.
 * The controller handles HTTP requests and responses, while the repository
 * interacts with the database.
 * The service class can take some load off the controller and repository by
 * handling complex operations."
 */

@Service
public class RecipeService {
    @Autowired
    RecipeRepository recipeRepository;

    private final RestTemplate RestTemplate;

    public RecipeService(RestTemplateBuilder restTemplateBuilder) {
        this.RestTemplate = restTemplateBuilder.build();
    }

    public List<Recipe> get() {
        return recipeRepository.findAll();
    }

    public Recipe get(Long id) {
        Optional<Recipt> recipeOptional = this.recipeRepository.findById(id);
        if (recipeOptional.isEmpty()) {
            throw new RuntimeException();
        }
        return recipeOptional.get();
    }

    public Recipe add(Recipe recipe) {
        return this.repository.save(recipe);
    }

    public Recipe update(Recipe recipe) {
        Optional<Recipe> recipeOptional = this.repository.findById(recipe.getID());
        if (recipeOptional.isEmpty()) {
            throw new RuntimeException();
        }
        Recipe recipeDb = recipeOptional.get();
        recipeDb.setDescription(recipe.getName());
        recipeDb.setInstructions(recipe.getInstructions());
        recipeDb.setIngredients(recipe.getIngredients());
        return this.repository.save(recipe);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    public List<RecipeDTO> recipesAvailable() {
        List<RecipeDTO> recipeDtos = new ArrayList<>();
        String url = "http://localhost:8080/api/inventory/isAvailable";
        List<Recipe> recipes = this.get();

        recipes.forEach(recipe -> {
            Boolean isAvailable = this.RestTemplate.postForObject(url, recipe, Boolean.class);
            if (isAvailable == null) {
                throw new RuntimeException();
            }
            recipeDtos.add(new RecipeDto(recipe, isAvailable));
        });
        return recipeDtos;
    }

    public List<RecipeDTO> recipesAvailableAsync() {
        List<RecipeDTO> recipeDtos = new ArrayList<>();
        String url = "http://localhost:8080/api/inventory/isAvailable";
        List<Recipe> recipes = this.get();

        List<CompletableFuture<Void>> futures = new ArrayList<>();
        for (Recipe recipe : recipes) {
            futures.add(CompletableFuture.runAsync(() -> {
                Boolean isAvailable = this.RestTemplate.postForObject(url, recipe, Boolean.class);
                if (isAvailable == null) {
                    throw new RuntimeException();
                }
                recipeDtos.add(new RecipeDto(recipe, isAvailable));
            }));
        }
        futures.forEach(CompletableFuture::join);
        return recipeDtos;
    }
}
