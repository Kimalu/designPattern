package com.Kimalu.client;

import com.Kimalu.eager.EagerSingleton;

public class Client {
	public static void main(String[] args){
		EagerSingleton es1=EagerSingleton.getInstance();
		EagerSingleton es2=EagerSingleton.getInstance();
		System.out.println(es1==es2);
	}
}