package com.Kimalu.client;

import com.Kimalu.abstractbean.Beverage;
import com.Kimalu.coffee.CoffeeA;
import com.Kimalu.seasoning.SeasoningA;
import com.Kimalu.seasoning.SeasoningB;
import com.Kimalu.seasoning.SeasoningC;

public class Client {

	public static void main(String[] args) {
		Beverage b=new CoffeeA();
		b=new SeasoningA(b);
		b=new SeasoningB(b);
		b=new SeasoningC(b);
		System.out.println(b.getDescription());
		System.out.println(b.cost());
	}
}
