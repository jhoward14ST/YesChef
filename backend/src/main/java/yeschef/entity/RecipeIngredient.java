package yeschef.entity;

import jakarta.persistence.*;

import yeschef.entity.ImperialUnit;

@Entity
@Table(name = "RecipeIngredient")
public class RecipeIngredient extends Ingredient {
    @Column(name = "qty_in_recipe")
    private Double qtyInRecipe;

    @ManyToOne(fetch = FetchType.EAGER)
    private ImperialUnit unit;

    public Double getQtyInRecipe() {
        return qtyInRecipe;
    }

    public void setQtyInRecipe(Double qtyInRecipe) {
        this.qtyInRecipe = qtyInRecipe;
    }

    public ImperialUnit getUnit() {
        return unit;
    }

    public void setUnit(ImperialUnit Unit) {
        this.unit = Unit;
    }
}
