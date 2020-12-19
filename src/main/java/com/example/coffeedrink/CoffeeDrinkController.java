package com.example.coffeedrink;

import java.util.ArrayList;
import java.util.List;

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
	public GetCoffeeDrinkResponse getCoffeeDrink(@RequestParam List<String> ingredients) {
		
		GetCoffeeDrinkResponse response = new GetCoffeeDrinkResponse();
		response.setResponseCoffeeDrink(coffeeDrinkFinder.getCoffeeDrink(ingredients).getCoffeeDrink().toString());
		return response;
	}
}
