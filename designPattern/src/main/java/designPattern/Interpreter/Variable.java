package designPattern.Interpreter;
//终结符角色
public class Variable extends Expression {

	private String name;
	
	public Variable(String name) {
		this.name = name;
	}
	@Override
	public boolean Interpret(Context ctx) {
		// TODO Auto-generated method stub
		return ctx.lookup(this);
	}

}
