package designPattern.abstractFactory;
//抽象工厂
public interface AbstractFactory {

	Cpu createCpu();
	
	Mainboard  createMainborad();
}
