package com.jhoward14ST.controller;

import com.jhoward14ST.model.Ingredient;
import com.jhoward14ST.repository.IngredientRepository;
import com.jhoward14ST.dto.IngredientDTO;
import com.jhoward14ST.service.IngredientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private IngredientService ingredientService;

    /* STREAM: Check later */
    @GetMapping
    public List<IngredientDTO> getAllIngredients() {
        List<Ingredient> ingredients = ingredientRepository.findAll();
        return ingredients.stream()
                .map(ingredientService::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public IngredientDTO getIngredientById(@PathVariable int id) {
        Ingredient ingredient = ingredientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ingredient not found with id: " + id));
        return ingredientService.convertToDTO(ingredient);
    }

    @PostMapping
    public IngredientDTO createIngredient(@RequestBody IngredientDTO ingredientDto) {
        Ingredient ingredient = ingredientService.convertToEntity(ingredientDto);
        Ingredient savedIngredient = ingredientRepository.save(ingredient);
        return ingredientService.convertToDTO(savedIngredient);
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
