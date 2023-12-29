package com.jhoward14ST.dto;

public class RecipeDTO {
    private int id;
    private String description;
    private String instructions;
    private int timeToMake;

    // No-args constructor for frameworks
    public RecipeDTO() {
    }

    // All-args constructor for convenience
    public RecipeDTO(
            int id,
            String description,
            String instructions,
            int timeToMake) {
        this.id = id;
        this.description = description;
        this.instructions = instructions;
        this.timeToMake = timeToMake;
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

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getTimeToMake() {
        return timeToMake;
    }

    public void setTimeToMake(int timeToMake) {
        this.timeToMake = timeToMake;
    }
}
