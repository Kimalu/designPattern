package com.Kimalu.ingredient;

import com.Kimalu.itf.Cheese;
import com.Kimalu.itf.Clams;
import com.Kimalu.itf.Dough;
import com.Kimalu.itf.Pepperoni;
import com.Kimalu.itf.Sauce;
import com.Kimalu.itf.Veggies;
import com.Kimalu.nyIngredient.FreshClams;
import com.Kimalu.nyIngredient.Garlic;
import com.Kimalu.nyIngredient.MarinaraSauce;
import com.Kimalu.nyIngredient.Mushroom;
import com.Kimalu.nyIngredient.Onion;
import com.Kimalu.nyIngredient.RedPepper;
import com.Kimalu.nyIngredient.ReggianoCheese;
import com.Kimalu.nyIngredient.SlicedPepperoni;
import com.Kimalu.nyIngredient.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
