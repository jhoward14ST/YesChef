package jhoward14ST.controller;

import jhoward14ST.model.Ingredient;
import jhoward14ST.repository.IngredientRepository;
import jhoward14ST.dto.IngredientDTO;
import jhoward14ST.service.IngredientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/api")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private IngredientService ingredientService;

    /* STREAM: Check later */
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/ingredients")
    public List<IngredientDTO> getAllIngredients() {
        List<Ingredient> ingredients = StreamSupport.stream(ingredientRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return ingredients.stream()
                .map(ingredientService::convertToDTO)
                .collect(Collectors.toList());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/ingredients/{id}")
    public IngredientDTO getIngredientById(@PathVariable int id) {
        Ingredient ingredient = ingredientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ingredient not found with id: " + id));
        return ingredientService.convertToDTO(ingredient);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/ingredients")
    public IngredientDTO createIngredient(@RequestBody IngredientDTO ingredientDto) {
        Ingredient ingredient = ingredientService.convertToEntity(ingredientDto);
        Ingredient savedIngredient = ingredientRepository.save(ingredient);
        return ingredientService.convertToDTO(savedIngredient);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/ingredients/{id}")
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

    // Spill the tea gurl. Delete it poor.
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    @DeleteMapping("/ingredients/{id}")
    public void deleteIngredient(@PathVariable int id) {
        ingredientRepository.deleteById(id);
    }
}
