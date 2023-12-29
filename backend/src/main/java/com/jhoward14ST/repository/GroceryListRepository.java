package com.jhoward14ST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jhoward14ST.model.Ingredient;

@Repository
public interface GroceryListRepository extends JpaRepository<Ingredient, Integer> {
    
}
