package yeschef.controller;

import yeschef.entity.Recipe;
import yeschef.model.RecipeDTO;
import yeschef.entity.RecipeIngredient;
import yeschef.service.RecipeIngredientService;
import yeschef.service.RecipeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;

@RestController
@RequestMapping("/api/recipeIngredient")
public class RecipeIngredientController {
    @Autowired
    RecipeIngredientService service;

    @CrossOrigin
    @GetMapping
    public List<RecipeIngredient> get() {
        return service.get();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public RecipeIngredient getIngredient(@PathVariable Long id) {
        return this.service.getIngredient(id);
    }

    @CrossOrigin
    @PostMapping
    public RecipeIngredient add(@RequestBody RecipeIngredient recipeIngredient) {
        return this.service.add(recipeIngredient);
    }

    @CrossOrigin
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public RecipeIngredient update(@RequestBody RecipeIngredient recipeIngredient) {
        return this.service.update(recipeIngredient);
    }

    @CrossOrigin
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }
}
