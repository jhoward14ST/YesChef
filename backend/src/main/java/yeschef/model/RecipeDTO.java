package yeschef.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import yeschef.entity.Recipe;
import yeschef.entity.Ingredient;

import java.util.Set;

@JsonSerialize
@JsonDeserialize
public class RecipeDTO {
    private Long id;
    private String Description;
    private String Instructions;
    private Set<Ingredient> Ingredients;

    /**
     * Recipes that the user has added
     */

    public RecipeDTO(Recipe recipe) {
        this.id = recipe.getID();
        this.Description = recipe.getDescription();
        this.Instructions = recipe.getInstructions();
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

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
