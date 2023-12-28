package main.java.com.jhoward14ST.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipe_ingredients")
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public int getIngredientId() {
        return ingredientId;
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
