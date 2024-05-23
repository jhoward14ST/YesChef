package yeschef.service;

import yeschef.entity.InventoryIngredient;
import yeschef.repository.InventoryIngredientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryIngredientService {

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
    InventoryIngredientRepository repository;

    public List<InventoryIngredient> get() {
        return this.repository.findAll();
    }

    public InventoryIngredient get(Long id) {
        Optional<InventoryIngredient> inventoryIngredientOptional = this.repository.findById(id);
        if (inventoryIngredientOptional.isEmpty()) {
            throw new RuntimeException();
        }
        return inventoryIngredientOptional.get();
    }

    public InventoryIngredient add(InventoryIngredient inventoryIngredient) {
        return this.repository.save(inventoryIngredient);
    }

    public InventoryIngredient update(InventoryIngredient inventoryIngredient) {
        Optional<InventoryIngredient> optionalInventoryIngredient = this.repository.findById(inventoryIngredient.getID());
        if (optionalInventoryIngredient.isEmpty()) {
            throw new RuntimeException();
        }
        InventoryIngredient inventoryIngredientDb = optionalInventoryIngredient.get();
        inventoryIngredientDb.setDescription(inventoryIngredient.getDescription());
        inventoryIngredientDb.setQtyInInventory(inventoryIngredient.getQtyInInventory());
        inventoryIngredientDb.setUnit(inventoryIngredient.getUnit());
        return this.repository.save(inventoryIngredientDb);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
