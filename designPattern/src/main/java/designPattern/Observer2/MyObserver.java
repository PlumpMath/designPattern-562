package designPattern.Observer2;

import java.util.Observable;
import java.util.Observer;


public class MyObserver implements Observer {

	public MyObserver(Observable o) {
		o.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		MyObservable myObservable = (MyObservable)o;
		System.out.println(myObservable.getData() + arg);
	}
}
