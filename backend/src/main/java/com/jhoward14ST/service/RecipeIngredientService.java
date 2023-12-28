package main.java.com.jhoward14ST.service;

import org.springframework.stereotype.Service;
import com.jhoward14ST.dto.RecipeIngredientDTO;
import com.jhoward14ST.model.RecipeIngredient;
import com.jhoward14ST.repository.RecipeIngredientRepository;

@Service
public class RecipeIngredientService {

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
    private RecipeIngredientRepository recipeIngredientRepository;

    public RecipeIngredientDTO convertToDTO(RecipeIngredient recipeIngredient) {
        return new RecipeIngredientDTO(
                recipeIngredient.getId(),
                recipeIngredient.getRecipeId(),
                recipeIngredient.getIngredientId(),
                recipeIngredient.getQuantity());
    }

    public RecipeIngredient convertToEntity(RecipeIngredientDTO recipeIngredientDto) {
        RecipeIngredient recipeIngredient = new RecipeIngredient();
        recipeIngredient.setId(recipeIngredientDto.getId());
        recipeIngredient.setRecipeId(recipeIngredientDto.getRecipeId());
        recipeIngredient.setIngredientId(recipeIngredientDto.getIngredientId());
        recipeIngredient.setQuantity(recipeIngredientDto.getQuantity());
        return recipeIngredient;
    }
}
