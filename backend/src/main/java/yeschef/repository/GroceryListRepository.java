package yeschef.repository;

import yeschef.entity.GroceryList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface GroceryListRepository extends JpaRepository<GroceryList, Long> {
}
