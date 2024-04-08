package com.centralperk.menu.food;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyFoodRepository extends MongoRepository<FoodEntity, String>{
List<FoodEntity> findFoodByFoodName(String foodName);
List<FoodEntity> findFoodByVegetarian(boolean vegetarian);
}
