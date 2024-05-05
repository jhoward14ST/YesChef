package yeschef.service;

import yeschef.model.GroceryList;
import yeschef.dto.GroceryListDTO;
import yeschef.repository.GroceryListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroceryListService {

    /**
     * "A service class is typically used to handle business logic and complex
     * calculations.
     * It acts as a layer between the controller and the repository.
     * The controller handles HTTP requests and responses, while the repository
     * interacts with the database.
     * The service class can take some load off the controller and repository by
     * handling complex operations."
     */

    @Autowired
    private GroceryListRepository groceryListRepository;

    /*
     * TODO: Modify functionality within:
     * controller, service, and repo
     * for more tailored functionality
     * TODO: Fix issues with DTO, add function for getIngredients();
     */

    // public GroceryListDTO convertToDTO(GroceryList groceryList) {
    //     return new GroceryListDTO(
    //             groceryList.getID(),
    //             groceryList.getIngredientID(),
    //             groceryList.getQuantity(),
    //             groceryList.getUnit());
    // }

    // public GroceryList convertToEntity(GroceryListDTO groceryListDto) {
    //     GroceryList groceryList = new GroceryList();
    //     groceryList.setID(groceryListDto.getID());
    //     groceryList.setIngredients(groceryListDto.getIngredients());
    //     return groceryList;
    // }
}
