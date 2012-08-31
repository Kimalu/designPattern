package com.Kimalu.entity;


import com.Kimalu.abstractbean.Duck;
import com.Kimalu.behaviorImpl.FlyWithWings;
import com.Kimalu.behaviorImpl.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
