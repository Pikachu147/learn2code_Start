package com.luigicoctails.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CocktailIngredientId implements Serializable {
	@Column(name="cocktail_id")
	private Long cocktailId;
	@Column(name="ingredient_id")
	private Long ingredientId;
	
	
	
	public CocktailIngredientId() {
		super();
	}


	public CocktailIngredientId(Long cocktailId, Long ingredientId) {
		super();
		this.cocktailId = cocktailId;
		this.ingredientId = ingredientId;
	}
	
	

}
