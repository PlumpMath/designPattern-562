package designPattern.Observer2;

import java.util.Observable;

public class MyObservable extends Observable {

	private String data = "";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		if (!this.data.equals(data)) {
			this.data = data;
			setChanged();
		}
		notifyObservers("状态发生改变了");
	}
	
	
}
