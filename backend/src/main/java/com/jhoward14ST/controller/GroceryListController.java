package main.java.com.jhoward14ST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import main.java.com.jhoward14ST.model.Ingredient;
import main.java.com.jhoward14ST.repository.GroceryListRepository;
import main.java.com.jhoward14ST.service.GroceryListService;

import java.util.List;

@RestController
@RequestMapping("/grocery_list")
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

    @GetMapping
    public List<Ingredient> getAllIngredients() {
        return groceryListRepository.findAll();
    }

    @GetMapping("/{id}")
    public Ingredient getIngredientById(@PathVariable int id) {
        return groceryListRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Ingredient addIngredientToList(@RequestBody Ingredient ingredient) {
        return groceryListRepository.save(ingredient);
    }

    @DeleteMapping("/{id}")
    public void removeIngredientFromList(@PathVariable int id) {
        groceryListRepository.deleteById(id);
    }
}
