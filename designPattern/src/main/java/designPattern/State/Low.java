package designPattern.State;

public class Low extends State {

	@Override
	public void pull(Car car) {
		// TODO Auto-generated method stub
		car.setState(new Medium());
		System.out.println("中挡");
	}

}
