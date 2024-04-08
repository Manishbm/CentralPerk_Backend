package com.centralperk.menu.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class CentralPerkFood {

	private MyFoodService myFoodService;

	@Autowired
	public CentralPerkFood(MyFoodService myFoodService) {
		this.myFoodService = myFoodService;
	}

	@PostMapping("/add")
	public FoodEntity addFood(@RequestBody FoodEntity foodEntity) {
		return myFoodService.addFood(foodEntity);
	}

	@PostMapping("/addAll")
	public List<FoodEntity> addAllFood(@RequestBody List<FoodEntity> foodEntity) {
		return myFoodService.addAllFood(foodEntity);
	}

	@GetMapping("/findById/{id}")
	public FoodEntity findById(@PathVariable String id) {
		return myFoodService.findById(id);
	}
	@GetMapping("/findByName/{foodName}")
	public List<FoodEntity> findByName(@PathVariable String foodName) {
		return myFoodService.findByFoodName(foodName);
	}
	@GetMapping("/findByVeg/{vegeratian}")
	public List<FoodEntity> findByVegitarian(@PathVariable boolean vegeratian) {
		return myFoodService.findByVegetarian(vegeratian);
	}

	@GetMapping("/findAll")
	public List<FoodEntity> findAll() {
		return myFoodService.findAll();
	}

	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable String id) {
		return myFoodService.deleteById(id);
	}

	@PostMapping("/modifyById/{id}")
	public FoodEntity modifyById(@PathVariable String id, @RequestBody FoodEntity foodEntity) {
		return myFoodService.modifyFood(id, foodEntity);
	}
}
