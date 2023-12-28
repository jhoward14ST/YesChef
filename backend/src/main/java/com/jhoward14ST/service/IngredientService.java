package main.java.com.jhoward14ST.service;

import main.java.com.jhoward14ST.dto.IngredientDTO;
import org.springframework.stereotype.Service;
import com.jhoward14ST.model.Ingredient;
import com.jhoward14ST.repository.IngredientRepository;

@Service
public class IngredientService {

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
    private IngredientRepository ingredientRepository;

    public IngredientDTO convertToDTO(Ingredient ingredient) {
        return new IngredientDTO(
                ingredient.getId(),
                ingredient.getDescription(),
                ingredient.getQtyInInventory(),
                ingredient.getUnit());
    }

    public Ingredient convertToEntity(main.java.com.jhoward14ST.dto.IngredientDTO ingredientDto) {
        Ingredient ingredient = new Ingredient();
        ingredient.setId(ingredientDto.getId());
        ingredient.setName(ingredientDto.getDescription());
        ingredient.setQuantity(ingredientDto.getQtyInInventory());
        ingredient.setUnit(ingredientDto.getUnit());
        return ingredient;
    }
}
