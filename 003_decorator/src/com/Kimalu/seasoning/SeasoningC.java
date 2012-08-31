package com.Kimalu.seasoning;

import com.Kimalu.abstractbean.Beverage;
import com.Kimalu.abstractbean.Decorator;

public class SeasoningC extends Decorator {
	private Beverage beverage;
	
	public SeasoningC(Beverage beverage){
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+"+seasoningC";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.66;
	}

}
