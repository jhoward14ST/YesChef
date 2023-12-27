package main.java.com.jhoward14ST.controller;

import com.jhoward14ST.model.Recipe;
import com.jhoward14ST.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import main.java.com.jhoward14ST.dto.RecipeDTO;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping("/")
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    @GetMapping("/{id}")
    public RecipeDTO getRecipeById(@PathVariable int id) {
        Recipe recipe = recipeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Recipe not found with id: " + id));
        return convertToDTO(recipe);
    }

    @PostMapping("/")
    public RecipeDTO createRecipe(@RequestBody RecipeDTO recipeDto) {
        Recipe recipe = convertToEntity(recipeDto);
        Recipe savedRecipe = recipeRepository.save(recipe);
        return convertToDTO(savedRecipe); // Convert entity back to DTO to return
    }

    @PutMapping("/{id}")
    public Recipe updateRecipe(@PathVariable int id, @RequestBody Recipe updatedRecipe) {
        Optional<Recipe> recipeOptional = recipeRepository.findById(id);
        if (recipeOptional.isPresent()) {
            Recipe recipe = recipeOptional.get();
            recipe.setDescription(updatedRecipe.getDescription());
            recipe.setInstructions(updatedRecipe.getInstructions());
            recipe.setTimeToMake(updatedRecipe.getTimeToMake());
            return recipeRepository.save(recipe);
        } else {
            throw new RuntimeException("Recipe not found with id: " + id);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable int id) {
        recipeRepository.deleteById(id);
    }

    // Utility method to convert Entity to DTO
    private RecipeDTO convertToDTO(Recipe recipe) {
        return new RecipeDTO(recipe.getId(), recipe.getDescription(), recipe.getInstructions(), recipe.getTimeToMake());
    }

    // Utility method to convert DTO to Entity
    private Recipe convertToEntity(RecipeDTO recipeDto) {
        Recipe recipe = new Recipe();
        recipe.setId(recipeDto.getId());
        recipe.setDescription(recipeDto.getDescription());
        recipe.setInstructions(recipeDto.getInstructions());
        recipe.setTimeToMake(recipeDto.getTimeToMake());
        return recipe;
    }
}
