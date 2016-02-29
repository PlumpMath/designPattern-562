package designPattern.Decorator;
//装饰角色
public class Decorator implements Component {

	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	public void opetation() {
		// TODO Auto-generated method stub
		component.opetation();
	}

}
