package com.example.coffeedrink.functions;

import java.util.List;

import com.example.coffeedrink.pojo.Americano;
import com.example.coffeedrink.pojo.Cappuccino;
import com.example.coffeedrink.pojo.CoffeeDrink;
import com.example.coffeedrink.pojo.Drink;
import com.example.coffeedrink.pojo.Ingredient;

/**
 * This class offers methods to find out a coffee drink according to some
 * ingredients.
 * 
 * @author aboud
 *
 */
public class CoffeeDrinkFinder {

	/**
	 * we will grant an access to the world to use this method. in another words we
	 * will make it a web service.
	 * 
	 * @param ingerdientList
	 * @return
	 */
	public CoffeeDrink getCoffeeDrink(List<String> ingerdientList) {

		if (isCappuccino(ingerdientList))
			return new Cappuccino();
		if (isAmericano(ingerdientList))
			return new Americano();

		CoffeeDrink drinkNotFound = new CoffeeDrink();
		drinkNotFound.setCoffeeDrink(Drink.NO_SUCH_DRINK);
		return drinkNotFound;
	}

	private boolean isCappuccino(List<String> ingerdientList) {

		if (ingerdientList.size() == 2 && ingerdientList.contains(Ingredient.ESPRESSO_SHOT.toString())
				&& ingerdientList.contains(Ingredient.MILK_FOAM.toString()))
			return true;
		return false;
	}

	private boolean isAmericano(List<String> ingerdientList) {

		if (ingerdientList.size() == 2 && ingerdientList.contains(Ingredient.ESPRESSO_SHOT.toString())
				&& ingerdientList.contains(Ingredient.HOT_WATER.toString()))
			return true;
		return false;
	}
}
