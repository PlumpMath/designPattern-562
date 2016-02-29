package designPattern.Decorator;

public class MainClass {

	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		Decorator decorator = new ConcreteDecorator(component);
		decorator.opetation();
	}
}
