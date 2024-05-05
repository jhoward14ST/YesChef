package jhoward14ST.controller;

import jhoward14ST.model.Recipe;
import jhoward14ST.dto.RecipeDTO;
import jhoward14ST.service.RecipeService;
import jhoward14ST.repository.RecipeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/api")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private RecipeService recipeService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/recipes")
    public List<RecipeDTO> getAllRecipes() {
        List<Recipe> recipes = StreamSupport.stream(recipeRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return recipes.stream()
                .map(recipeService::convertToDTO)
                .collect(Collectors.toList());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/recipes/{id}")
    public RecipeDTO getRecipeById(@PathVariable int id) {
        Recipe recipe = recipeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Recipe not found with id: " + id));
        return recipeService.convertToDTO(recipe);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/recipes")
    public RecipeDTO createRecipe(@RequestBody RecipeDTO recipeDto) {
        Recipe recipe = recipeService.convertToEntity(recipeDto);
        Recipe savedRecipe = recipeRepository.save(recipe);
        return recipeService.convertToDTO(savedRecipe); // Convert entity back to DTO to return
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/recipes/{id}")
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

    // Spill the tea gurl. Delete it poor.
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    @DeleteMapping("/recipes/{id}")
    public void deleteRecipe(@PathVariable int id) {
        recipeRepository.deleteById(id);
    }
}
