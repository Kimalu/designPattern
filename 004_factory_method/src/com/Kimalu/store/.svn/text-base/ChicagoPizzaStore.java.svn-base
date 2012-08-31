package com.Kimalu.store;

import com.Kimalu.abstractfactory.Pizza;
import com.Kimalu.abstractfactory.PizzaStore;
import com.Kimalu.pizza.ChicagoStyleCheesePizza;
import com.Kimalu.pizza.ChicagoStyleClamPizza;
import com.Kimalu.pizza.ChicagoStylePepperoniPizza;
import com.Kimalu.pizza.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		}else if(type.equals("veggie")){
			return new ChicagoStyleVeggiePizza();
		}else if(type.equals("clam")){
			return new ChicagoStyleClamPizza();
		}else if(type.equals("pepperoni")){
			return new ChicagoStylePepperoniPizza();
		}else{
			return null;
		}
	}

}
