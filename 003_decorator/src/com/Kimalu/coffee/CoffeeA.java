package com.Kimalu.coffee;

import com.Kimalu.abstractbean.Beverage;

public class CoffeeA extends Beverage {
	
	public CoffeeA(){
		description="coffeeB";
	}

	@Override
	public double cost() {
		return 1.00;
	}


}
