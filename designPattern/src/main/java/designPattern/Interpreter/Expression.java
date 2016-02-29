package designPattern.Interpreter;
//抽象表达式角色
public abstract class Expression {
	public abstract boolean Interpret(Context ctx);
}
