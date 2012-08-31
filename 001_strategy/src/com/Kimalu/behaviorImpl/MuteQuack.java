package com.Kimalu.behaviorImpl;

import com.Kimalu.ibehavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
