package designPattern.Interpreter;
//非终结符角色
public class And extends Expression {

	private Expression left;
	private Expression right;
	
	public And(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	@Override
	public boolean Interpret(Context ctx) {
		// TODO Auto-generated method stub
		return left.Interpret(ctx) && right.Interpret(ctx);
	}

}
