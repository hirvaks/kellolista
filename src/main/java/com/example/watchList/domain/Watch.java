package com.example.watchList.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//table
public class Watch {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//columns
	private Long id;
	private String brand;
	private String name;
	private String movementType;
	private int caseDiameter;
	private double price;
	
	public Watch() {}
	
	public Watch(String brand, String name, String movementType, int caseDiameter, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.movementType = movementType;
		this.caseDiameter = caseDiameter;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovementType() {
		return movementType;
	}

	public void setMovementType(String movementType) {
		this.movementType = movementType;
	}

	public int getCaseDiameter() {
		return caseDiameter;
	}

	public void setCaseDiameter(int caseDiameter) {
		this.caseDiameter = caseDiameter;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Watch [id=" + id + ", brand=" + brand + ", name=" + name + ", movementType=" + movementType
				+ ", caseDiameter=" + caseDiameter + ", price=" + price + "]";
	}
}
