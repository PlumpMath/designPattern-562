package designPattern.Singleton;
//饿汉式
public class Singleton1 {

	private volatile static Singleton1 instance = new Singleton1();
	
	private Singleton1() {
		
	}
	private static Singleton1 getInstance() {
		if (instance == null) {
			synchronized (Singleton1.class) {
				if (instance == null) {
					instance = new Singleton1();
				}
			}
		}
		return instance;
	}
}
