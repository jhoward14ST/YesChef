package main.java.com.jhoward14ST.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persitence.Enumerated;
import javax.persistence.EnumType;

@Entity
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private Double qtyInInventory;

    @Enumerated(EnumType.STRING)
    private ImperialUnit unit;

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