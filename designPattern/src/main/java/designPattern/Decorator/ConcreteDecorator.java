package designPattern.Decorator;
//具体装饰角色
public class ConcreteDecorator extends Decorator {

	@Override
	public void opetation() {
		// TODO Auto-generated method stub
		System.out.println("在前面装饰");
		super.opetation();
		System.out.println("在后面装饰");
	}

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	

}
