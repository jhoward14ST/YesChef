package yeschef.controller;

import yeschef.entity.Recipe;
import yeschef.model.RecipeDTO;
import yeschef.service.IngredientService;
import yeschef.service.RecipeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;

@RestController
@RequestMapping("/api/ingredient")
public class IngredientController {
    @Autowired
    IngredientService service;

    @CrossOrigin
    @GetMapping
    public List<Ingredient> get() {
        return service.get();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Ingredient getIngredient(@PathVariable Long id) {
        return this.service.getIngredient(id);
    }

    @CrossOrigin
    @PostMapping
    public Ingredient add(@RequestBody Ingredient ingredient) {
        return this.service.add(ingredient);
    }

    @CrossOrigin
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Ingredient update(@RequestBody Ingredient ingredient) {
        return this.service.update(ingredient);
    }

    @CrossOrigin
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }
}
