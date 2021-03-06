package designPattern.Singleton;
//饿汉式
public class Singleton2 {

	private Singleton2() {
		
	}
	
	private static class SingletonHolder {
		private volatile static Singleton2 instance = new Singleton2();
	}
	private static Singleton2 getInstance() {
		return SingletonHolder.instance;
	}
}
