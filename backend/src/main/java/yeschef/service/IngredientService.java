package yeschef.service;

import yeschef.entity.Ingredient;
import yeschef.repository.IngredientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

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
    IngredientRepository ingredientRepository;

    public List<Ingredient> get() {
        return this.repository.findAll();
    }

    public Ingredient add(Ingredient ingredient) {
        return this.repository.save(ingredient);
    }

    public Ingredient update(Ingredient ingredient) {
        Optional<Ingredient> optionalIngredient = this.repository.findById(ingredient.getID());
        if (optionalIngredient.isEmpty()) {
            throw new RuntimeException();
        }
        Ingredient ingredientDb = optionalIngredient.get();
        ingredientDb.setDescription(ingredient.getDescription());
        ingredientDb.setQtyInInventory(ingredient.getQtyInInventory());
        ingredientDb.setUnit(ingredient.getUnit());
        return this.repository.save(ingredientDb);
    }

    public voi delete(Long id) {
        this.repository.deleteById(id);
    }
}
