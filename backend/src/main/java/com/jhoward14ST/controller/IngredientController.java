package com.jhoward14ST.controller;

import com.jhoward14ST.model.Ingredient;
import com.jhoward14ST.repository.IngredientRepository;
import com.jhoward14ST.dto.IngredientDTO;
import com.jhoward14ST.service.IngredientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.stream.Collectors;

@Api(value = "Ingredients Management")
@RestController
@RequestMapping("/api/ingredients")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private IngredientService ingredientService;

    /* STREAM: Check later */
    @ApiOperation(value = "View a list of all ingredients", response = List.class)
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<IngredientDTO> getAllIngredients() {
        List<Ingredient> ingredients = ingredientRepository.findAll();
        return ingredients.stream()
                .map(ingredientService::convertToDTO)
                .collect(Collectors.toList());
    }

    @ApiOperation(value = "Get an ingredient by its ID", response = IngredientDTO.class)
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public IngredientDTO getIngredientById(@PathVariable int id) {
        Ingredient ingredient = ingredientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ingredient not found with id: " + id));
        return ingredientService.convertToDTO(ingredient);
    }

    @ApiOperation(value = "Add a new ingredient", response = IngredientDTO.class)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public IngredientDTO createIngredient(@RequestBody IngredientDTO ingredientDto) {
        Ingredient ingredient = ingredientService.convertToEntity(ingredientDto);
        Ingredient savedIngredient = ingredientRepository.save(ingredient);
        return ingredientService.convertToDTO(savedIngredient);
    }

    @ApiOperation(value = "Update an existing ingredient", response = Ingredient.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
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

    @ApiOperation(value = "Delete an ingredient by its ID")
    // Spill the tea gurl. Delete it poor.
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    @DeleteMapping("/{id}")
    public void deleteIngredient(@PathVariable int id) {
        ingredientRepository.deleteById(id);
    }
}
