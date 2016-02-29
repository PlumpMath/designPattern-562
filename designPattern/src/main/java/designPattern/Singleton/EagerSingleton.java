package designPattern.Singleton;
//饿汉式
public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
		
	}
	private static EagerSingleton getInstance() {
		return instance;
	}
}
