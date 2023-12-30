package com.jhoward14ST.model;

import com.jhoward14ST.model.ImperialUnit;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import jakarta.persistence.*;

@Entity
@Table(name = "recipe_ingredients")
@EntityListeners(AuditingEntityListener.class)
public class RecipeIngredient {

    /**
     * Ingredients that are needed for a recipe
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "recipe_id")
    private int recipeId;

    @Column(name = "ingredient_id")
    private int ingredientId;

    private Double quantity;

    @Enumerated(EnumType.STRING)
    private ImperialUnit unit;

    public RecipeIngredient(
            int recipeId,
            int ingredientId,
            Double quantity,
            ImperialUnit unit) {
        this.recipeId = recipeId;
        this.ingredientId = ingredientId;
        this.quantity = quantity;
        this.unit = unit;
    }

    // no-arg constructor
    public RecipeIngredient() {
    }

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
