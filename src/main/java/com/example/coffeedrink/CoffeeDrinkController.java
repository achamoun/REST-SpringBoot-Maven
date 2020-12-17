package com.example.coffeedrink;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.coffeedrink.response.GetCoffeeDrinkIngredientsResponse;
import com.example.coffeedrink.functions.IngredientFinder;
import com.example.coffeedrink.pojo.Ingredient;

@RestController
public class CoffeeDrinkController {

	IngredientFinder ingredientFinder = new IngredientFinder();

	@GetMapping("/webservices/getCoffeeDrinkIngredients")
	public GetCoffeeDrinkIngredientsResponse getCoffeeDrinkIngredients(@RequestParam String coffeeDrink) {

		GetCoffeeDrinkIngredientsResponse response = new GetCoffeeDrinkIngredientsResponse();
		for (Ingredient ingredient : ingredientFinder.findIngredients(coffeeDrink)) {
			response.getResponseIngredientList().add(ingredient.toString());
		}
		return response;
	}
}
