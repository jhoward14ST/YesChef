package yeschef.entity;

import jakarta.persistence.*;
import main.java.com.yeschef.model.Ingredient;

import java.util.Set;

import javax.annotation.processing.Generated;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import yeschef.model.ImperialUnit;

@Entity
@Table(name = "grocery_list")
public class GroceryList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "grocery_list_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private GroceryList groceryList;

    // Getters and setters
    public Long getID() {
        return id;
    }

    public GroceryList getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(GroceryList groceryList) {
        this.groceryList = groceryList;
    }
}
