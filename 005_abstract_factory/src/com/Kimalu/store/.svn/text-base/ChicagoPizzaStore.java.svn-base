package com.Kimalu.store;

import com.Kimalu.abstractfactory.Pizza;
import com.Kimalu.abstractfactory.PizzaStore;
import com.Kimalu.ingredient.ChicagoPizzaIngredientFactory;
import com.Kimalu.ingredient.PizzaIngredientFactory;
import com.Kimalu.pizza.CheesePizza;
import com.Kimalu.pizza.ClamPizza;
import com.Kimalu.pizza.PepperoniPizza;
import com.Kimalu.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
