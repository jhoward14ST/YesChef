package yeschef.controller;

import yeschef.entity.Recipe;
import yeschef.model.RecipeDTO;
import yeschef.entity.InventoryIngredient;
import yeschef.service.InventoryIngredientService;
import yeschef.service.RecipeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;

@RestController
@RequestMapping("/api/inventoryIngredient")
public class InventoryIngredientController {
    @Autowired
    InventoryIngredientService service;

    @CrossOrigin
    @GetMapping
    public List<InventoryIngredient> get() {
        return service.get();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public InventoryIngredient get(@PathVariable Long id) {
        return this.service.get(id);
    }

    @CrossOrigin
    @PostMapping
    public InventoryIngredient add(@RequestBody InventoryIngredient inventoryIngredient) {
        return this.service.add(inventoryIngredient);
    }

    @CrossOrigin
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public InventoryIngredient update(@RequestBody InventoryIngredient inventoryIngredient) {
        return this.service.update(inventoryIngredient);
    }

    @CrossOrigin
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }
}
