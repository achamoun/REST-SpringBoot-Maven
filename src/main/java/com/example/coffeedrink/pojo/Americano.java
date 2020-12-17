package com.example.coffeedrink.pojo;

import java.util.ArrayList;

public class Americano extends CoffeeDrink {

	private ArrayList<Ingredient> ingredientList;

	public Americano() {

		ingredientList = new ArrayList<Ingredient>();
		ingredientList.add(Ingredient.ESPRESSO_SHOT);
		ingredientList.add(Ingredient.HOT_WATER);
		setCoffeeDrink(Drink.AMERICANO);
	}

	public ArrayList<Ingredient> getIngredientList() {
		return ingredientList;
	}

	private void setIngredientList(ArrayList<Ingredient> ingredientList) {
		this.ingredientList = ingredientList;
	}

}
