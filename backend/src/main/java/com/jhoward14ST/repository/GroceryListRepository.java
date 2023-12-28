package main.java.com.jhoward14ST.repository;

import com.jhoward14ST.model.GroceryList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryListRepository extends JpaRepository<GroceryList, Integer> {
    /*
     * TODO: Modify functionality within:
     * controller, service, and repo
     * for more tailored functionality
     */

}
