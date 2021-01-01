package com.luigicoctails.app.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="cocktails_ingredients")
public class CocktailXIngredient implements Serializable {
	
	@EmbeddedId
	private CocktailIngredientId id;
	
	@ManyToOne
	@MapsId("cocktail_id")
	@JoinColumn(name="cocktail_id", nullable = false)
	private Cocktail cocktail;
	
	@ManyToOne
	@MapsId("ingredient_id")
	@JoinColumn(name="ingredient_id", nullable = false)
	private Ingredient ingredient;

	public CocktailXIngredient() {
		super();
	}
	

}
