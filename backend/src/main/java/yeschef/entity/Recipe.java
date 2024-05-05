package yeschef.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Set;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "instructions", nullable = false)
    private String instructions;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Recipe_Ingredient", 
        joinColumns = @JoinColumn(name = "recipe_id"), 
        inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    Set<Ingredient> ingredients;

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

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
