package main.java.com.jhoward14ST.dto;

import main.java.com.jhoward14ST.model.ImperialUnit;

public class IngredientDTO {
    private int id;
    private String description;
    private Double qtyInInventory;
    private ImperialUnit unit;

    // No-args constructor for frameworks
    public IngredientDTO() {
    }

    // All-args constructor for convenience
    public IngredientDTO(
            int id,
            String description,
            Double qtyInInventory,
            ImperialUnit unit) {
        this.id = id;
        this.description = description;
        this.qtyInInventory = qtyInInventory;
        this.unit = unit;
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

    public void setDescription(String description) {
        this.description = description;
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