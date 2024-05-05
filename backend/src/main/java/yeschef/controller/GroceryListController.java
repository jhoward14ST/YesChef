package yeschef.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import yeschef.model.Ingredient;
import yeschef.repository.GroceryListRepository;
import yeschef.service.GroceryListService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

// @RestController
// @RequestMapping("/api")
public class GroceryListController {

    // @Autowired
    // private GroceryListRepository groceryListRepository;

    // @Autowired
    // private GroceryListService groceryListService;

    /*
     * TODO: Modify functionality within:
     * controller, service, and repo
     * for more tailored functionality
     */

    // @ResponseStatus(HttpStatus.OK)
    // @GetMapping("/groceryList")
    // public List<Ingredient> getAllIngredients() {
    //     return groceryListRepository.findAll();
    // }

    // @ResponseStatus(HttpStatus.OK)
    // @GetMapping("/groceryList/{id}")
    // public Ingredient getIngredientById(@PathVariable int id) {
    //     return groceryListRepository.findById(id).orElse(null);
    // }

    // @ResponseStatus(HttpStatus.CREATED)
    // @PostMapping("/groceryList")
    // public Ingredient addIngredientToList(@RequestBody Ingredient ingredient) {
    //     return groceryListRepository.save(ingredient);
    // }

    // Spill the tea gurl. Delete it poor.
    
    // @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    // @DeleteMapping("/groceryList/{id}")
    // public void removeIngredientFromList(@PathVariable int id) {
    //     groceryListRepository.deleteById(id);
    // }
}
