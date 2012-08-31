package com.Kimalu.ingredient;

import com.Kimalu.itf.Cheese;
import com.Kimalu.itf.Clams;
import com.Kimalu.itf.Dough;
import com.Kimalu.itf.Pepperoni;
import com.Kimalu.itf.Sauce;
import com.Kimalu.itf.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
