package com.jhoward14ST.repository;

import com.jhoward14ST.model.GroceryList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface GroceryListRepository extends JpaRepository<GroceryList, Integer> {
}
