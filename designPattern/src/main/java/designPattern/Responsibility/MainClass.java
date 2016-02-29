package designPattern.Responsibility;

public class MainClass {

	public static void main(String[] args) {
		ConcreteHandler concreteHandler1 = new ConcreteHandler();
		ConcreteHandler concreteHandler2 = new ConcreteHandler();
		
		concreteHandler1.setNext(concreteHandler2);
		concreteHandler1.handlerRequest();
	}
}