package yeschef.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "InventoryIngredient")
public class RecipeIngredient extends Ingredient {
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
