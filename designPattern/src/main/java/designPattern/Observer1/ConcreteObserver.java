package designPattern.Observer1;
//具体观察者
public class ConcreteObserver implements Observer {

	private String observerState;
	
	public void update(String state) {
		// TODO Auto-generated method stub
		observerState = state;
		System.out.println("状态为："+ observerState);
	}

}
