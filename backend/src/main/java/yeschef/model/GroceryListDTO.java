package yeschef.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import yeschef.entity.RecipeIngredient;

import java.util.Set;

@JsonSerialize
@JsonDeserialize
public class GroceryListDTO {
    private Long id;
    private Set<RecipeIngredient> RecipeIngredients;

    public GroceryListDTO(Long id, Set<RecipeIngredient> RecipeIngredients) {
        this.id = id;
        this.RecipeIngredients = RecipeIngredients;
    }

    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public Set<RecipeIngredient> getRecipeIngredients() {
        return RecipeIngredients;
    }

    public void setRecipeIngredients(Set<RecipeIngredient> RecipeIngredients) {
        this.RecipeIngredients = RecipeIngredients;
    }
}
