package designPattern.Observer2;

public class MainClass {

	public static void main(String[] args) {
		MyObservable myObservable = new MyObservable();
		MyObserver myObserver = new MyObserver(myObservable);
		myObservable.setData("change 1");
		myObservable.setData("change 2");
	}
}
