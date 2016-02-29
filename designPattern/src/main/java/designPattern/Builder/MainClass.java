package designPattern.Builder;

public class MainClass {

	public static void main(String[] args) {
		Director director = new Director();
		ConcreteBuilderA concreteBuilderA = new ConcreteBuilderA();
		ConcreteBuilderB concreteBuilderB = new ConcreteBuilderB();
		director.build(concreteBuilderA);
		director.build(concreteBuilderB);
		concreteBuilderA.getResult().show();
		concreteBuilderB.getResult().show();
	}
}
