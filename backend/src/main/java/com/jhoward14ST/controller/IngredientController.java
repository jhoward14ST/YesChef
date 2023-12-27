package main.java.com.jhoward14ST.controller;

import com.jhoward14ST.model.Ingredient;
import com.jhoward14ST.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Ingredient getIngredientById(@PathVariable int id) {
        return ingredientRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @PutMapping("/{id}")
    public Ingredient updateIngredient(@PathVariable int id, @RequestBody Ingredient updatedIngredient) {
        Ingredient existingIngredient = ingredientRepository.findById(id).orElse(null);
        if (existingIngredient != null) {
            existingIngredient.setDescription(updatedIngredient.getDescription());
            existingIngredient.setQtyInInventory(updatedIngredient.getQtyInInventory());
            existingIngredient.setUnit(updatedIngredient.getUnit());
            return ingredientRepository.save(existingIngredient);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteIngredient(@PathVariable int id) {
        ingredientRepository.deleteById(id);
    }
}
