package yeschef.entity;

import jakarta.persistence.*;

import yeschef.entity.ImperialUnit;

@Entity
@Table(name = "InventoryIngredient")
public class InventoryIngredient extends Ingredient {
    @Column(name = "qty_in_inventory")
    private Double qtyInInventory;

    @ManyToOne(fetch = FetchType.EAGER)
    private ImperialUnit unit;
    
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
