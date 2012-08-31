package com.Kimalu.entity;


import com.Kimalu.abstractbean.Duck;
import com.Kimalu.behaviorImpl.FlyNoWay;
import com.Kimalu.behaviorImpl.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
