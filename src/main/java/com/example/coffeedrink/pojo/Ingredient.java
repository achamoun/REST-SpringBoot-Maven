package com.example.coffeedrink.pojo;

public enum Ingredient {

	HOT_WATER, ESPRESSO_SHOT, MILK_FOAM,NO_INGREDIENTS_FOUND;

	@Override
	public String toString() {

		switch (this) {
		case HOT_WATER:
			return "water";
		case ESPRESSO_SHOT:
			return "espresso";
		case MILK_FOAM:
			return "milk";
		default:
			return "no ingredients found";
		}
		

	}

}
