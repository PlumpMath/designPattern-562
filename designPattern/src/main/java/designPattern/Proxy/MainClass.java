package designPattern.Proxy;

public class MainClass {

	public static void main(String[] args) {
		Subject subject = new ProxySubject();
		subject.Request();
	}
}
