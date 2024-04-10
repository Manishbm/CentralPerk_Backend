package com.centralperk.menu.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFoodService {
	private MyFoodRepository myFoodRepository;

	@Autowired
	public MyFoodService(MyFoodRepository myFoodRepository) {
		this.myFoodRepository = myFoodRepository;
	}

	public FoodEntity addFood(FoodEntity foodEntity) {
		return myFoodRepository.save(foodEntity);
	}

	public List<FoodEntity> addAllFood(List<FoodEntity> foodEntity) {
		return myFoodRepository.saveAll(foodEntity);
	}

	public List<FoodEntity> findAll() {
		return myFoodRepository.findAll();
	}

	public FoodEntity findById(String id) {
		return myFoodRepository.findById(id).orElseThrow();
	}
	public List<FoodEntity> findByFoodName(String foodName) {
		return myFoodRepository.findFoodByFoodName(foodName);
	}
	public List<FoodEntity> findByVegetarian(boolean vegetarian) {
		return myFoodRepository.findFoodByVegetarian(vegetarian);
	}

	public String deleteById(String id) {
		myFoodRepository.deleteById(id);
		return "Drink with the Id : " + id + " is removed from the data base ";
	}

	public FoodEntity modifyFood(String id, FoodEntity foodEntity) {
		FoodEntity existingFood = myFoodRepository.findById(id).orElse(null);
		existingFood.setFoodName(foodEntity.getFoodName());
		existingFood.setVegetarian(foodEntity.isVegetarian());
		existingFood.setPrice(foodEntity.getPrice());
		existingFood.setImage(foodEntity.getImage());
		existingFood.setDescription(foodEntity.getDescription());

		return myFoodRepository.save(existingFood);

	}
}
