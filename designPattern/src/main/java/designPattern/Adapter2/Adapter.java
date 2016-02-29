package designPattern.Adapter2;
//适配器角色
public class Adapter {

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public void operate1() {
		this.adaptee.operate1();
	}
	public void operate2() {
		// TODO Auto-generated method stub
		
	}


}
