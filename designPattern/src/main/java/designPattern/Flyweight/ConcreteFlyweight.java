package designPattern.Flyweight;
//具体享元角色
public class ConcreteFlyweight implements Flyweight {

	private Character state = null;
	public void operation(String state) {
		// TODO Auto-generated method stub
		System.out.println("the state is" + state);
	}
	public ConcreteFlyweight(Character state) {
		super();
		this.state = state;
	}

}
