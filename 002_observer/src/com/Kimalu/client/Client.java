package com.Kimalu.client;

import com.Kimalu.observer.ArgObject;
import com.Kimalu.observer.ObserverA;
import com.Kimalu.observer.ObserverB;
import com.Kimalu.observer.ObserverC;
import com.Kimalu.observer.Subject;

public class Client {
	public static void main(String[] args){
		ObserverA oa=new ObserverA();
		ObserverB ob=new ObserverB();
		ObserverC oc=new ObserverC();
		
		ArgObject ao=new ArgObject();
		ao.setArg1("arg1");
		ao.setArg2("arg2");
		ao.setArg3("arg3");
		Subject s=new Subject();
		s.addObserver(oa);
		s.addObserver(ob);
		s.addObserver(oc);
		s.setArg(ao);
		s.statusChange();
		
		
		s.removeObserver(oa);
		s.statusChange();
	
	}
}
