package com.centralperk.menu.drinks;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "centralperk")
public class Entity {

	@Id
	private String id;
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private String typeOfDrink;
	private String nameOfDrink;
	private String brand;
	private boolean alcohalic;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTypeOfDrink() {
		return typeOfDrink;
	}

	public void setTypeOfDrink(String typeOfDrink) {
		this.typeOfDrink = typeOfDrink;
	}

	public String getNameOfDrink() {
		return nameOfDrink;
	}

	public void setNameOfDrink(String nameOfDrink) {
		this.nameOfDrink = nameOfDrink;
	}

	

	public boolean isAlcohalic() {
		return alcohalic;
	}

	

	@Override
	public String toString() {
		return "Entity [id=" + id + ", price=" + price + ", typeOfDrink=" + typeOfDrink + ", nameOfDrink=" + nameOfDrink
				+ ", brand=" + brand + ", alcohalic=" + alcohalic + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setAlcohalic(boolean alcohalic) {
		this.alcohalic = alcohalic;
	}

	



}
