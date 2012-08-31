package com.Kimalu.seasoning;

import com.Kimalu.abstractbean.Beverage;
import com.Kimalu.abstractbean.Decorator;

public class SeasoningB extends Decorator {
	private Beverage beverage;
	
	public SeasoningB(Beverage beverage){
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+"+seasoningB";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.44;
	}

}
