package com.jhoward14ST.model;

import com.jhoward14ST.model.ImperialUnit;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import jakarta.persistence.*;

@Entity
@Table(name = "ingredients")
@EntityListeners(AuditingEntityListener.class)
public class Ingredient {

    /**
     * Ingredients that the user has added and has in their inventory
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private Double qtyInInventory;

    @Enumerated(EnumType.STRING)
    private ImperialUnit unit;

    // All-args constructor
    public Ingredient(
            int id,
            String description,
            Double qtyInInventory,
            ImperialUnit unit) {
        this.id = id;
        this.description = description;
        this.qtyInInventory = qtyInInventory;
        this.unit = unit;
    }

    // no-arg constructor
    public Ingredient() {
    }

    // Getters and setters
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public Double getQtyInInventory() {
        return qtyInInventory;
    }

    public void setQtyInInventory(Double qtyInInventory) {
        this.qtyInInventory = qtyInInventory;
    }

    public ImperialUnit getUnit() {
        return unit;
    }

    public void setUnit(ImperialUnit Unit) {
        this.unit = Unit;
    }
}