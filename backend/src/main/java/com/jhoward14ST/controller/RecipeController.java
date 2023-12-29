package com.jhoward14ST.controller;

import com.jhoward14ST.model.Recipe;
import com.jhoward14ST.dto.RecipeDTO;
import com.jhoward14ST.service.RecipeService;
import com.jhoward14ST.repository.RecipeRepository;

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

@RestController
@Api(value = "Recipes Management")
@RequestMapping("/api/recipes")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private RecipeService recipeService;

    @ApiOperation(value = "View a list of all recipes", response = List.class)
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/")
    public List<RecipeDTO> getAllRecipes() {
        List<Recipe> recipes = recipeRepository.findAll();
        return recipes.stream()
                .map(recipeService::convertToDTO)
                .collect(Collectors.toList());
    }

    @ApiOperation(value = "Get a recipe by its ID", response = RecipeDTO.class)
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public RecipeDTO getRecipeById(@PathVariable int id) {
        Recipe recipe = recipeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Recipe not found with id: " + id));
        return recipeService.convertToDTO(recipe);
    }

    @ApiOperation(value = "Create a new recipe", response = RecipeDTO.class)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/")
    public RecipeDTO createRecipe(@RequestBody RecipeDTO recipeDto) {
        Recipe recipe = recipeService.convertToEntity(recipeDto);
        Recipe savedRecipe = recipeRepository.save(recipe);
        return recipeService.convertToDTO(savedRecipe); // Convert entity back to DTO to return
    }

    @ApiOperation(value = "Update an existing recipe", response = Recipe.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
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

    @ApiOperation(value = "Delete a recipe by its ID")
    // Spill the tea gurl. Delete it poor.
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable int id) {
        recipeRepository.deleteById(id);
    }
}
