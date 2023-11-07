package br.com.fiap.sprint2.model.entity;

import jakarta.validation.constraints.NotBlank;

public class Bike {
	private long id;
	@NotBlank
	private String model;
	@NotBlank
	private String color;
	@NotBlank
	private String accident;
	@NotBlank
	private String brand;
	@NotBlank
	private String modification;
	@NotBlank
	private String nameBike;
	
	public Bike(long id, @NotBlank String model, @NotBlank String color, @NotBlank String accident, @NotBlank String brand, @NotBlank String modification,
			String nameBike) {
		super();
		this.id = id;
		this.model = model;
		this.color = color;
		this.accident = accident;
		this.brand = brand;
		this.modification = modification;
		this.nameBike = nameBike;
	}

	public Bike() {
		
	}

	public long getId() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAccident() {
		return accident;
	}

	public void setAccident(String accident) {
		this.accident = accident;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModification() {
		return modification;
	}

	public void setModification(String modification) {
		this.modification = modification;
	}

	public String getNameBike() {
		return nameBike;
	}

	public void setNameBike(String nameBike) {
		this.nameBike = nameBike;
	}
	
	
}
	
	
	