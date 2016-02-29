package designPattern.Proxy;

public class ProxySubject implements Subject {

	private RealSubject realSubject;
	public void Request() {
		this.PreRequest();
		// TODO Auto-generated method stub
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.Request();
		this.PostRequest();
	}

	private void PreRequest() {
		System.out.println("PreRequest");
	}
	private void PostRequest() {
		System.out.println("PostRequest");
	}
}
