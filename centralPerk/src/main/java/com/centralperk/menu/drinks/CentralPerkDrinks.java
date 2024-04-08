package com.centralperk.menu.drinks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drinks")
public class CentralPerkDrinks {

	private MyMenuService myMenu;

	@Autowired
	public CentralPerkDrinks(MyMenuService myMenu) {
		this.myMenu = myMenu;
	}

	@RequestMapping("/")
	public String welcome() {
		return "WELCOME TO CENTRAL PERK";
	}

	@PostMapping("/add")
	public ResponseEntity<Entity> addDrink(@RequestBody Entity entity) {
		Entity savedModel = myMenu.save(entity);
		return new ResponseEntity<>(savedModel, HttpStatus.CREATED);
	}
	@DeleteMapping("/remove/{id}")
	public String delete(@PathVariable String id){
		return myMenu.delete(id);
	}
	
	@GetMapping("/findAll")
	public List<Entity> getAllDrinks(){
		return myMenu.findAll();
	}
	@PostMapping("/addAll")
	public List<Entity> addAllDrink(@RequestBody List<Entity> Entity){
		return myMenu.saveAll(Entity);
	}
	
	@GetMapping("/findById/{id}")
	public Entity findById(@PathVariable String id) {
		return myMenu.findDrink(id);
	}
	@GetMapping("/findByName/{nameOfDrink}")
	public List<Entity> findByName(@PathVariable String nameOfDrink) {
		return myMenu.findDrinkByName(nameOfDrink);
	}
	@GetMapping("/findByType/{typeOfDrink}")
	public List<Entity> findByType(@PathVariable String typeOfDrink) {
		return myMenu.findDrinkByType(typeOfDrink);
	}
	@GetMapping("/findByBrand/{brand}")
	public List<Entity> findByBrand(@PathVariable String brand) {
		return myMenu.findDrinkByBrand(brand);
	}
	@GetMapping("/findByAlcohalic/{alcohalic}")
	public List<Entity> findByAlcohalic(@PathVariable boolean alcohalic) {
		return myMenu.findDrinkByAlcohalic(alcohalic);
	}
	@PostMapping("/modifyById/{id}")
	public Entity modifyById(@PathVariable String id , @RequestBody Entity entity) {
		 return myMenu.modifyDrink(id, entity);
	}
	
}
