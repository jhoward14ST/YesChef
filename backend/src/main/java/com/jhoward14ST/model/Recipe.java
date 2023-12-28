package main.java.com.jhoward14ST.model;

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
@Table(name = "recipes")
public class Recipe {

    /**
     * Recipes that the user has added
     * TODO: Change timeToMake to a time object/add functions for time
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Description;
    private String Instructions;
    private int TimeToMake;

    public Recipe(
            int id,
            String description,
            String instructions,
            int timeToMake) {
        this.id = id;
        this.Description = description;
        this.Instructions = instructions;
        this.TimeToMake = timeToMake;
    }

    // no-arg constructor
    public Recipe() {
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getInstructions() {
        return Instructions;
    }

    public void setInstructions(String instructions) {
        this.Instructions = instructions;
    }

    public int getTimeToMake() {
        return TimeToMake;
    }

    public void setTimeToMake(int timeToMake) {
        this.TimeToMake = timeToMake;
    }
}
