package main.java.com.jhoward14ST.repository;

import com.jhoward14ST.model.GroceryList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class GroceryListRepository extends JpaRepository<GroceryList, Integer> {
}
