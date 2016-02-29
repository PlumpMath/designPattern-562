package designPattern.Bridge;
//修正抽象化角色B
public class RefinedAbstractionB extends Abstraction {

	public RefinedAbstractionB(Implementor impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		impl.operationImpl();
		System.out.println("修正抽象化角色B");
	}

}
