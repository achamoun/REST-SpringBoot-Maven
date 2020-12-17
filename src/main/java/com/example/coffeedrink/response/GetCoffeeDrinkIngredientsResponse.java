package com.example.coffeedrink.response;

import java.util.ArrayList;
import java.util.List;

import com.example.coffeedrink.pojo.Ingredient;

public class GetCoffeeDrinkIngredientsResponse {

	

	protected List<String> responseIngredientList;

	  public GetCoffeeDrinkIngredientsResponse() {
		responseIngredientList= new ArrayList<String>();	
		}
	
	public List<String> getResponseIngredientList() {
		return responseIngredientList;
	}

	public void setResponseIngredientList(List<String> responseIngredientList) {
		this.responseIngredientList = responseIngredientList;
	}
	
	

}
