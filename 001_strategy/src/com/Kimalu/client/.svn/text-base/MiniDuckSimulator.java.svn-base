package com.Kimalu.client;

import com.Kimalu.behaviorImpl.FlyRocketPowered;
import com.Kimalu.entity.DecoyDuck;
import com.Kimalu.entity.MallardDuck;
import com.Kimalu.entity.ModelDuck;
import com.Kimalu.entity.RubberDuck;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		ModelDuck	model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
