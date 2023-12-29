package com.jhoward14ST.service;

import com.jhoward14ST.model.Recipe;
import com.jhoward14ST.dto.RecipeDTO;
import com.jhoward14ST.repository.RecipeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    /**
     * "A service class is typically used to handle business logic and complex
     * calculations.
     * It acts as a layer between the controller and the repository.
     * The controller handles HTTP requests and responses, while the repository
     * interacts with the database.
     * The service class can take some load off the controller and repository by
     * handling complex operations."
     */

    @Autowired
    private RecipeRepository recipeRepository;

    public RecipeDTO convertToDTO(Recipe recipe) {
        return new RecipeDTO(
                recipe.getID(),
                recipe.getDescription(),
                recipe.getInstructions(),
                recipe.getTimeToMake());
    }

    public Recipe convertToEntity(RecipeDTO recipeDto) {
        Recipe recipe = new Recipe();
        recipe.setID(recipeDto.getID());
        recipe.setDescription(recipeDto.getDescription());
        recipe.setInstructions(recipeDto.getInstructions());
        recipe.setTimeToMake(recipeDto.getTimeToMake());
        return recipe;
    }
}