package com.Kimalu.lazy;

public class LazySingletonB {
	
	private volatile static LazySingletonB instance;
	
	private LazySingletonB(){
		
	}
	public static LazySingletonB getInstance(){
		if(instance==null){
			synchronized(LazySingletonB.class){
				//因为加锁的瞬间可能出现另一个线程已将单例对象实例化出来，所以还要再检查一遍
				if(instance==null){
					instance=new LazySingletonB();
				}
			}
		}
		return instance;
	}
}
