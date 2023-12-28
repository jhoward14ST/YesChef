package main.java.com.jhoward14ST.repository;

import com.jhoward14ST.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
    List<Ingredient> findAll();
    Optional<Ingredient> findById(int id);
    Ingredient save(Ingredient ingredient);
    void deleteById(int id);
}
