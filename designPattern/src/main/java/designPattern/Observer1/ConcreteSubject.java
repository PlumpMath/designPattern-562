package designPattern.Observer1;
//具体主题角色
public class ConcreteSubject extends Subject {

	@Override
	public void change(String newState) {
		// TODO Auto-generated method stub
		this.state = newState;
		this.nodifyObservers(newState);
	}

}
