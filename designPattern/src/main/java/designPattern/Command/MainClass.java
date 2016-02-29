package designPattern.Command;

public class MainClass {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command concreteCommand = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker(concreteCommand);
		invoker.action();
	}
}
