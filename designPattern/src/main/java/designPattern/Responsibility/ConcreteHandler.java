package designPattern.Responsibility;
//具体处理者角色
public class ConcreteHandler extends Handler {

	@Override
	public void handlerRequest() {
		// TODO Auto-generated method stub
		if (getNext() != null) {
			getNext().handlerRequest();
			System.out.println("下一个处理");
		} else {
			System.out.println("自己处理");
		}
	}

}
