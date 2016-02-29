package designPattern.abstractFactory;
//具体工厂角色
public class AmdFactory implements AbstractFactory {

	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new IntelCpu();
	}

	public Mainboard createMainborad() {
		// TODO Auto-generated method stub
		return new IntelMainboard();
	}

}
