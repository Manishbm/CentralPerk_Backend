package com.centralperk.menu.drinks;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends MongoRepository<Entity, String> {

    List<Entity> findByNameOfDrink(String nameOfDrink); // Changed method name to match the property name
    List<Entity> findByTypeOfDrink(String typeOfDrink); 
    List<Entity> findByBrand(String brand);
    List<Entity> findByAlcohalic(boolean alcohalic);
}
