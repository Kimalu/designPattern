package com.Kimalu.seasoning;

import com.Kimalu.abstractbean.Beverage;
import com.Kimalu.abstractbean.Decorator;

public class SeasoningA extends Decorator {
	private Beverage beverage;
	
	public SeasoningA(Beverage beverage){
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+"+seasoningA";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.22;
	}

}
