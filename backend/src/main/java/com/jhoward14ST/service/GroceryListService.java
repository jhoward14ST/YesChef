package main.java.com.jhoward14ST.service;

import main.java.com.jhoward14ST.dto.GroceryListDTO;
import org.springframework.stereotype.Service;
import com.jhoward14ST.model.GroceryList;
import com.jhoward14ST.repository.GroceryListRepository;

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
     */

    public GroceryListDTO convertToDTO(GroceryList groceryList) {
        return new GroceryListDTO(
                groceryList.getId(),
                groceryList.getIngredients());
    }

    public GroceryList convertToEntity(GroceryListDTO groceryListDto) {
        GroceryList groceryList = new GroceryList();
        groceryList.setId(groceryListDto.getId());
        groceryList.setIngredients(groceryListDto.getIngredients());
        return groceryList;
    }
}
