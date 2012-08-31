package com.Kimalu.observer;

import com.Kimalu.iobserver.Display;
import com.Kimalu.iobserver.Observer;
import com.Kimalu.iobserver.Observerable;

public class ObserverC implements Observer,Display  {

	@Override
	public void update(Observerable observerable) {
		if(observerable instanceof Subject){
			Subject s=(Subject)observerable;
			display(s);
		}
	}

	@Override
	public void display(Subject s) {
		System.out.println(s.getArg().getArg3());
	}

}
