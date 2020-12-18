package com.example.coffeedrink;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.coffeedrink.functions.CoffeeDrinkFinder;
import com.example.coffeedrink.functions.IngredientFinder;
import com.example.coffeedrink.pojo.Ingredient;
import com.example.coffeedrink.response.GetCoffeeDrinkIngredientsResponse;
import com.example.coffeedrink.response.GetCoffeeDrinkResponse;

@RestController
public class CoffeeDrinkController {

	IngredientFinder ingredientFinder = new IngredientFinder();
	CoffeeDrinkFinder coffeeDrinkFinder = new CoffeeDrinkFinder();

	@GetMapping("/webservices/getCoffeeDrinkIngredients")
	public GetCoffeeDrinkIngredientsResponse getCoffeeDrinkIngredients(@RequestParam String coffeeDrink) {

		GetCoffeeDrinkIngredientsResponse response = new GetCoffeeDrinkIngredientsResponse();
		for (Ingredient ingredient : ingredientFinder.findIngredients(coffeeDrink)) {
			response.getResponseIngredientList().add(ingredient.toString());
		}
		return response;
	}

	@GetMapping("/webservices/getCoffeeDrink")
	public GetCoffeeDrinkResponse getCoffeeDrink(@RequestParam String ingredient1, @RequestParam String ingredient2) {
		GetCoffeeDrinkResponse response = new GetCoffeeDrinkResponse();
		ArrayList<String> ingredientList = new ArrayList<String>();
		ingredientList.add(ingredient1);
		ingredientList.add(ingredient2);
		response.setResponseCoffeeDrink(coffeeDrinkFinder.getCoffeeDrink(ingredientList).getCoffeeDrink().toString());
		return response;
	}
}
