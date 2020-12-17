package com.example.coffeedrink.functions;

import java.util.ArrayList;
import java.util.List;

import com.example.coffeedrink.pojo.Americano;
import com.example.coffeedrink.pojo.Cappuccino;
import com.example.coffeedrink.pojo.CoffeeDrink;
import com.example.coffeedrink.pojo.Drink;
import com.example.coffeedrink.pojo.Ingredient;

/**
 * this class offers a method to find out the ingredients of a coffee drink
 * 
 * @author aboud
 *
 */
public class IngredientFinder {

	/**
	 * we will grant the world access to use this method. in another words we will
	 * make it a web service.
	 * 
	 * @param coffeeDrink
	 * @return
	 */
	public List<Ingredient> findIngredients(String coffeeDrink) {

		switch (coffeeDrink) {
		case "cappuccino":
			return new Cappuccino().getIngredientList();

		case "americano":
			return new Americano().getIngredientList();

		default:
			List<Ingredient> noIngredientsFound = new ArrayList<Ingredient>();
			noIngredientsFound.add(Ingredient.NO_INGREDIENTS_FOUND);
			return noIngredientsFound;
		}

	}

}
