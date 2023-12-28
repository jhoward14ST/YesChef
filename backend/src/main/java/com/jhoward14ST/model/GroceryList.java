import java.lang.annotation.Inherited;

import main.java.com.jhoward14ST.enums.ImperialUnit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

@Entity
@Table(name = "grocery_list")
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
