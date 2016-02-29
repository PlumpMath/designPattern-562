package designPattern.abstractFactory;

public class IntelFactory implements AbstractFactory {

	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new AmdCpu();
	}

	public Mainboard createMainborad() {
		// TODO Auto-generated method stub
		return new AmdMainboard();
	}

}
