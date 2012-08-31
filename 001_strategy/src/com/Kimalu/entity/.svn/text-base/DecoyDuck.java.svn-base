package com.Kimalu.entity;

import com.Kimalu.abstractbean.Duck;
import com.Kimalu.behaviorImpl.FlyNoWay;
import com.Kimalu.behaviorImpl.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
