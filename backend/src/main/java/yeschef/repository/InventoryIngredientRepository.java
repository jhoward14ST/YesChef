package yeschef.repository;

import yeschef.entity.InventoryIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryIngredientRepository extends JpaRepository<InventoryIngredient, Long> {
}
