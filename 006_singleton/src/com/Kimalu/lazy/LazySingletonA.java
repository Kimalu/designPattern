package com.Kimalu.lazy;

public class LazySingletonA {
	
	private static  LazySingletonA instance;
	
	private LazySingletonA(){
		
	}
	//如果该单例不是使用频率很频繁那么可以使用 synchronized 来防止多线程问题
	public static LazySingletonA getInstance(){
		if(instance==null){
			instance=new LazySingletonA();
		}
		return instance;
	}
}
