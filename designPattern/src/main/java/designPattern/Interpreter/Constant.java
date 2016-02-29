package designPattern.Interpreter;
//终结符角色
public class Constant extends Expression {

	private boolean value;
	
	public Constant(boolean value) {
		this.value = value;
	}
	@Override
	public boolean Interpret(Context ctx) {
		// TODO Auto-generated method stub
		return value;
	}

}
