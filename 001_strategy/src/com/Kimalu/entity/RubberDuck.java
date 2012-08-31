package com.Kimalu.entity;


import com.Kimalu.abstractbean.Duck;
import com.Kimalu.behaviorImpl.FlyNoWay;
import com.Kimalu.behaviorImpl.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
