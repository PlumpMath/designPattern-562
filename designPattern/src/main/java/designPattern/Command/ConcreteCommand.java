package designPattern.Command;
//具体命令角色
public class ConcreteCommand implements Command  {

	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
