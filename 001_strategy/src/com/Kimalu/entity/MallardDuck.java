package com.Kimalu.entity;


import com.Kimalu.abstractbean.Duck;
import com.Kimalu.behaviorImpl.FlyWithWings;
import com.Kimalu.behaviorImpl.Quack;

public class MallardDuck extends Duck {
 
	public MallardDuck() {
 
		quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
 

	}
 
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
