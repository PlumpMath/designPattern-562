package designPattern.Observer1;

import java.util.ArrayList;
import java.util.List;
//抽象主题角色
public abstract class Subject {
	
	protected String state;
	
	private List<Observer> list = new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		list.add(observer);
	}
	
	public void detach(Observer observer) {
		list.remove(observer);
	}
	
	public void nodifyObservers(String newState) {
		for (Observer observer : list) {
			observer.update(newState);
		}
	}
	
	public String getState() {
		return state;
	}
	
	public abstract void change(String newState);
}
