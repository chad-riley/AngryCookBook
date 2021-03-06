package com.libertymutual.goforcode.angrycb.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

@Entity

public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 75)
	private String title;

	@Column(nullable = true, length = 255)
	private String description;

	@Column(nullable = true)
	private double numberOfMinutes;

	@Column(nullable = true)
	private String ingredients;

	@Column(nullable = true, length = 255)
	private String instructions;

	private List<Recipe> recipess;

	public Recipe() {
	}

	public Recipe(String title, String description, double numberOfMinutes, String ingredients, String instructions) {
		this.title = title;
		this.description = description;
		this.numberOfMinutes = numberOfMinutes;
		this.ingredients = ingredients;
		this.instructions = instructions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
