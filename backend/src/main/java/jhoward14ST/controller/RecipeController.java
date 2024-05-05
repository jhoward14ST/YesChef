package jhoward14ST.controller;

import jhoward14ST.entity.Recipe;
import jhoward14ST.model.RecipeDTO;
import jhoward14ST.service.RecipeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController {
    @Autowired
    RecipeService service;

    @CrossOrigin
    @GetMapping
    public List<Recipe> get() {
        return service.get();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Recipe getRecipe(@PathVariable Long id) {
        return this.service.getRecipe(id);
    }

    @CrossOrigin
    @PostMapping
    public Recipe add(@RequestBody Recipe recipe) {
        return this.service.add(recipe);
    }

    @CrossOrigin
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Recipe update(@RequestBody Recipe recipe) {
        return this.service.update(recipe);
    }

    @CrossOrigin
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }

    @CrossOrigin
    @DeleteMapping(value = "/recipesAvailable")
    public List<RecipeDTO> recipesAvailable() {
        return this.service.recipesAvailable();
    }

    @CrossOrigin
    @GetMapping(value = "/recipesAvailableAsync")
    public List<RecipeDTO> recipesAvailableAsync() {
        return this.service.recipesAvailableAsync();
    }
}
