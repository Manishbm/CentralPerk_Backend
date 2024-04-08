package com.centralperk.menu.drinks;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyMenuService {
	private MyRepository myRepository;

	@Autowired
	public MyMenuService(MyRepository myRepository) {
		this.myRepository = myRepository;
	}

	public Entity save(Entity entity) {
		return myRepository.save(entity);
	}

	public List<Entity> findAll() {
		return myRepository.findAll();
	}

	public String delete(String Id) {
		myRepository.deleteById(Id);
		return "Drink with the Id : " + Id + " is removed from the data base ";
	}

	public List<Entity> saveAll(List<Entity> Entity) {
		return myRepository.saveAll(Entity);
	}

	public Entity findDrink(String id) {
		Entity result = myRepository.findById(id).orElse(null);
		return result;
	}
	public List<Entity> findDrinkByName(String name) {
		return myRepository.findByNameOfDrink(name);
	}
	public List<Entity> findDrinkByType(String type) {
		return myRepository.findByTypeOfDrink(type);
	}
	public List<Entity> findDrinkByBrand(String brand) {
		return myRepository.findByBrand(brand);
	}
	public List<Entity> findDrinkByAlcohalic(boolean alcohalic) {
		return myRepository.findByAlcohalic(alcohalic);
	}
	public Entity modifyDrink(String id, Entity entity) {
		Entity existingDrink = myRepository.findById(id).orElse(null);
		existingDrink.setBrand(entity.getBrand());
		existingDrink.setNameOfDrink(entity.getNameOfDrink());
		existingDrink.setPrice(entity.getPrice());
		existingDrink.setTypeOfDrink(entity.getTypeOfDrink());
		existingDrink.setAlcohalic(entity.isAlcohalic());

		return myRepository.save(existingDrink);

	}
}
