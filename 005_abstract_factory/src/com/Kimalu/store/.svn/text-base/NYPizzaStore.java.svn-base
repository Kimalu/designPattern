package com.Kimalu.store;

import com.Kimalu.abstractfactory.Pizza;
import com.Kimalu.abstractfactory.PizzaStore;
import com.Kimalu.ingredient.NYPizzaIngredientFactory;
import com.Kimalu.ingredient.PizzaIngredientFactory;
import com.Kimalu.pizza.CheesePizza;
import com.Kimalu.pizza.ClamPizza;
import com.Kimalu.pizza.PepperoniPizza;
import com.Kimalu.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
