package designPattern.State;

public class Medium extends State {

	@Override
	public void pull(Car car) {
		// TODO Auto-generated method stub
		car.setState(new Off());
		System.out.println("空档");
	}

}
