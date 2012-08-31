package com.Kimalu.client;

import com.Kimalu.abstractbean.Duck;
import com.Kimalu.behaviorImpl.FlyRocketPowered;
import com.Kimalu.entity.MallardDuck;
import com.Kimalu.entity.ModelDuck;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
