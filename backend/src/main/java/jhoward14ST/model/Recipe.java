package jhoward14ST.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jhoward14ST.entity.Recipe;
import jhoward14ST.entity.Ingredient;

import java.util.Set;

@JsonSerialize
@JsonDeserialize
public class Recipe {
    private Long id;
    private String Description;
    private String Instructions;
    private Set<Ingredient> Ingredients;
    private int TimeToMake;

    /**
     * Recipes that the user has added
     * TODO: Change timeToMake to a time object/add functions for time
     */

    public RecipeDTO(Recipe recipe) {
        this.id = recipe.getID();
        this.Description = recipe.getDescription();
        this.Instructions = recipe.getInstructions();
        this.TimeToMake = recipe.getTimeToMake();
    }

    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getInstructions() {
        return Instructions;
    }

    public void setInstructions(String instructions) {
        this.Instructions = instructions;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public int getTimeToMake() {
        return TimeToMake;
    }

    public void setTimeToMake(int timeToMake) {
        this.TimeToMake = timeToMake;
    }
}
