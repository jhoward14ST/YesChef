package yeschef.repository;

import yeschef.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}
