package com.jhoward14ST.repository;

import com.jhoward14ST.model.Recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    // Custom method to find a recipe by description
    Recipe findByDescription(String description);
    
    // Custom method to find recipes by timeToMake less than a given value
    List<Recipe> findByTimeToMakeLessThan(int timeToMake);
    
    // Custom method to find recipes by instructions containing a specific keyword
    List<Recipe> findByInstructionsContaining(String keyword);
    
    // Custom method to find recipes by description and timeToMake
    List<Recipe> findByDescriptionAndTimeToMake(String description, int timeToMake);
    
    // Custom method to find recipes by description or instructions
    List<Recipe> findByDescriptionOrInstructions(String description, String instructions);
}
