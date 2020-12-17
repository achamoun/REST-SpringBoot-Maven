package com.example.coffeedrink.pojo;

public enum Drink {

	CAPPUCCINO, AMERICANO,NO_SUCH_DRINK;

	@Override
	public String toString() {

		switch (this) {
		case CAPPUCCINO:
			return "cappuccino";
		case AMERICANO:
			return "americano";
		default:
			return "no such drink";
		}
	}

}
