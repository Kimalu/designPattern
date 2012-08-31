package com.Kimalu.store;

import com.Kimalu.abstractfactory.Pizza;
import com.Kimalu.abstractfactory.PizzaStore;
import com.Kimalu.pizza.NYStyleCheesePizza;
import com.Kimalu.pizza.NYStyleClamPizza;
import com.Kimalu.pizza.NYStylePepperoniPizza;
import com.Kimalu.pizza.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if(type.equals("veggie")){
			return new NYStyleVeggiePizza();
		}else if(type.equals("clam")){
			return new NYStyleClamPizza();
		}else if(type.equals("pepperoni")){
			return new NYStylePepperoniPizza();
		}else{
			return null;
		}
	}

}
