package com.jhoward14ST.model;

import com.jhoward14ST.model.ImperialUnit;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import jakarta.persistence.*;

@Entity
@Table(name = "grocery_list")
@EntityListeners(AuditingEntityListener.class)
public class GroceryList {

    /**
     * List of recipe ingredients that are needed to be purchased
     */
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ingredient_id")
    private int ingredientId;

    private Double quantity;

    @Enumerated(EnumType.STRING)
    private ImperialUnit unit;

    public GroceryList(
            int ingredientId,
            Double quantity,
            ImperialUnit unit) {
        this.ingredientId = ingredientId;
        this.quantity = quantity;
        this.unit = unit;
    }

    // no-arg constructor
    public GroceryList() {
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
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
}
