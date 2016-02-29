package designPattern.State;

public class Off extends State {

	@Override
	public void pull(Car car) {
		// TODO Auto-generated method stub
		car.setState(new Low());
		System.out.println("抵挡");
	}

}
