package com.Kimalu.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.Kimalu.iobserver.Observer;
import com.Kimalu.iobserver.Observerable;

public class Subject implements Observerable {
	
	private ArgObject arg;		//增加一个参数的对象，这样参数发生改变时只需要修改一个POJO类
	
	private List<Observer> observerList=new ArrayList<Observer>();
	
	public ArgObject getArg() {
		return arg;
	}
	
	public void setArg(ArgObject arg) {
		this.arg = arg;
	}

	@Override
	public void addObserver(Observer o) {
		if(!this.observerList.contains(o)){
			this.observerList.add(o);
		}
	}

	@Override
	public void removeObserver(Observer o) {
		this.observerList.remove(o);
	}

	@Override
	public void statusChange() {
		for(Iterator<Observer> i=observerList.iterator();i.hasNext();){
			Observer o=(Observer)i.next();
			o.update(this);
		}
	}
	
}
