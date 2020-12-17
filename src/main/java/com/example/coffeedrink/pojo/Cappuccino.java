package com.example.coffeedrink.pojo;

import java.util.ArrayList;

public class Cappuccino extends CoffeeDrink {

	private ArrayList<Ingredient> ingredientList;

	public Cappuccino() {

		ingredientList = new ArrayList<Ingredient>();
		ingredientList.add(Ingredient.ESPRESSO_SHOT);
		ingredientList.add(Ingredient.MILK_FOAM);
		setCoffeeDrink(Drink.CAPPUCCINO);
	}

	public ArrayList<Ingredient> getIngredientList() {
		return ingredientList;
	}

	private void setIngredientList(ArrayList<Ingredient> ingredientList) {
		this.ingredientList = ingredientList;
	}

}
