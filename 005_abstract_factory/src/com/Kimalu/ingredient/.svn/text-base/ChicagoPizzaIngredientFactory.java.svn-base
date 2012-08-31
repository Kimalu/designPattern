package com.Kimalu.ingredient;

import com.Kimalu.chicagoIngredient.BlackOlives;
import com.Kimalu.chicagoIngredient.Eggplant;
import com.Kimalu.chicagoIngredient.FrozenClams;
import com.Kimalu.chicagoIngredient.MozzarellaCheese;
import com.Kimalu.chicagoIngredient.PlumTomatoSauce;
import com.Kimalu.chicagoIngredient.Spinach;
import com.Kimalu.chicagoIngredient.ThickCrustDough;
import com.Kimalu.itf.Cheese;
import com.Kimalu.itf.Clams;
import com.Kimalu.itf.Dough;
import com.Kimalu.itf.Pepperoni;
import com.Kimalu.itf.Sauce;
import com.Kimalu.itf.Veggies;
import com.Kimalu.nyIngredient.SlicedPepperoni;


public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
