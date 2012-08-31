package com.Kimalu.client;

import com.Kimalu.abstractfactory.Pizza;
import com.Kimalu.abstractfactory.PizzaStore;
import com.Kimalu.store.ChicagoPizzaStore;
import com.Kimalu.store.NYPizzaStore;

public class PizzaClientA {
	public static void main(String[] args){
		PizzaStore nyStory=new NYPizzaStore();
		PizzaStore chicagoStore=new ChicagoPizzaStore();
		
		Pizza pizza=nyStory.orderPizza("cheese");
		System.out.println("Kimalu ordered a "+pizza.getName()+"\n");
		pizza=chicagoStore.orderPizza("cheese");
		System.out.println("Zoie ordered a "+pizza.getName()+"\n");
		
	}
}
