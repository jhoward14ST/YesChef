package yeschef.repository;

import yeschef.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
