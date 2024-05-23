package yeschef.service;

import yeschef.entity.RecipeIngredient;
import yeschef.repository.RecipeIngredientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeIngredientService {

    /**
     * "A service class is typically used to handle business logic and complex
     * calculations.
     * It acts as a layer between the controller and the repository.
     * The controller handles HTTP requests and responses, while the repository
     * interacts with the database.
     * The service class can take some load off the controller and repository by
     * handling complex operations."
     */

    @Autowired
    RecipeIngredientRepository repository;

    public List<RecipeIngredient> get() {
        return this.repository.findAll();
    }

    public RecipeIngredient getIngredient(Long id) {
        Optional<RecipeIngredient> optionalIngredient = this.repository.findById(id);
        if (optionalIngredient.isEmpty()) {
            throw new RuntimeException();
        }
        return optionalIngredient.get();
    }

    public RecipeIngredient add(RecipeIngredient ingredient) {
        return this.repository.save(ingredient);
    }

    public RecipeIngredient update(RecipeIngredient ingredient) {
        Optional<RecipeIngredient> optionalIngredient = this.repository.findById(ingredient.getID());
        if (optionalIngredient.isEmpty()) {
            throw new RuntimeException();
        }
        RecipeIngredient ingredientDb = optionalIngredient.get();
        ingredientDb.setDescription(ingredient.getDescription());
        ingredientDb.setQtyInRecipe(ingredient.getQtyInRecipe());
        ingredientDb.setUnit(ingredient.getUnit());
        return this.repository.save(ingredientDb);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
