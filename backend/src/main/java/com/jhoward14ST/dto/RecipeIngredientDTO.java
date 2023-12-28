package main.java.com.jhoward14ST.dto;

import main.java.com.jhoward14ST.model.ImperialUnit;

public class RecipeIngredientDTO {
    private int id;
    private int recipeId;
    private int ingredientId;
    private Double quantity;
    private ImperialUnit unit;

    // No-args constructor for frameworks
    public RecipeIngredientDTO() {
    }

    // All-args constructor for convenience
    public RecipeIngredientDTO(
            int id,
            int recipeId,
            int ingredientId,
            Double quantity,
            ImperialUnit unit) {
        this.id = id;
        this.recipeId = recipeId;
        this.ingredientId = ingredientId;
        this.quantity = quantity;
        this.unit = unit;
    }

    // Getters and setters
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getRecipeID() {
        return recipeId;
    }

    public void setRecipeID(int recipeId) {
        this.recipeId = recipeId;
    }

    public int getIngredientID() {
        return ingredientId;
    }

    public void setIngredientID(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public ImperialUnit getUnit() {
        return unit;
    }

    public void setUnit(ImperialUnit unit) {
        this.unit = unit;
    }
}
