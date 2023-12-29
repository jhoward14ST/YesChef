package com.jhoward14ST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jhoward14ST.model.Ingredient;
import com.jhoward14ST.repository.GroceryListRepository;
import com.jhoward14ST.service.GroceryListService;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Grocery List Management")
@RestController
@RequestMapping("/api/grocery_list")
public class GroceryListController {

    @Autowired
    private GroceryListRepository groceryListRepository;

    @Autowired
    private GroceryListService groceryListService;

    /*
     * TODO: Modify functionality within:
     * controller, service, and repo
     * for more tailored functionality
     */

    @ApiOperation(value = "View a list of all ingredients", response = List.class)
    @GetMapping
    public List<Ingredient> getAllIngredients() {
        return groceryListRepository.findAll();
    }

    @ApiOperation(value = "Get an ingredient by its ID", response = Ingredient.class)
    @GetMapping("/{id}")
    public Ingredient getIngredientById(@PathVariable int id) {
        return groceryListRepository.findById(id).orElse(null);
    }

    @ApiOperation(value = "Add an ingredient to the list", response = Ingredient.class)
    @PostMapping
    public Ingredient addIngredientToList(@RequestBody Ingredient ingredient) {
        return groceryListRepository.save(ingredient);
    }

    @ApiOperation(value = "Remove an ingredient from the list")
    @DeleteMapping("/{id}")
    public void removeIngredientFromList(@PathVariable int id) {
        groceryListRepository.deleteById(id);
    }
}
