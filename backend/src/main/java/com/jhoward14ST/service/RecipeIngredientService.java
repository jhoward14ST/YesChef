package com.jhoward14ST.service;

import com.jhoward14ST.dto.RecipeIngredientDTO;
import com.jhoward14ST.model.RecipeIngredient;

import org.springframework.stereotype.Service;

import com.jhoward14ST.model.RecipeIngredient;
import com.jhoward14ST.dto.RecipeIngredientDTO;
// TODO: Fix later/see if this is needed
// import com.jhoward14ST.repository.RecipeIngredientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeIngredientService {

    /**
     * "A service class is typically used to handle business logic and complex
     * calculations.
     * It acts as a layer between the controller and the repository.
     * The controller handles HTTP requests and responses, while the repository
     * interacts with the database.
     * The service class can take some load off the controller and repository by
     * handling complex operations."
     */

    // TODO: See above import
    // @Autowired
    // private RecipeIngredientRepository recipeIngredientRepository;

    public RecipeIngredientDTO convertToDTO(RecipeIngredient recipeIngredient) {
        return new RecipeIngredientDTO(
                recipeIngredient.getID(),
                recipeIngredient.getRecipeID(),
                recipeIngredient.getIngredientID(),
                recipeIngredient.getQuantity(),
                recipeIngredient.getUnit());
    }

    public RecipeIngredient convertToEntity(RecipeIngredientDTO recipeIngredientDto) {
        RecipeIngredient recipeIngredient = new RecipeIngredient();
        recipeIngredient.setID(recipeIngredientDto.getID());
        recipeIngredient.setRecipeID(recipeIngredientDto.getRecipeID());
        recipeIngredient.setIngredientID(recipeIngredientDto.getIngredientID());
        recipeIngredient.setQuantity(recipeIngredientDto.getQuantity());
        recipeIngredient.setUnit(recipeIngredientDto.getUnit());
        return recipeIngredient;
    }
}
