package com.jhoward14ST.entity;

import com.jhoward14ST.model.ImperialUnit;

@Entity
@Table(name = "Ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "qty_in_inventory")
    private Double qtyInInventory;

    @ManyToOne(fetch = FetchType.EAGER)
    private ImperialUnit unit;

    // Getters and setters
    public Long getID() {
        return id;
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