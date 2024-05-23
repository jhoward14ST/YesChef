package yeschef.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import yeschef.entity.Recipe;
import yeschef.entity.RecipeIngredient;

import java.util.Set;

@JsonSerialize
@JsonDeserialize
public class RecipeDTO {
    private Long id;
    private String description;
    private String instructions;
    private boolean isAvailable;
    private Set<RecipeIngredient> ingredients;

    /**
     * Recipes that the user has added
     */

    public RecipeDTO(Recipe recipe) {
        this.id = recipe.getID();
        this.description = recipe.getDescription();
        this.instructions = recipe.getInstructions();
        this.isAvailable = recipe.getIsAvailable();
        this.ingredients = recipe.getIngredients();
    }

    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Set<RecipeIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<RecipeIngredient> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
