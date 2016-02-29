package designPattern.Visitor;
//抽象访问者角色
public interface Visitor {

	void visit(NodeA node);
	
	void visit(NodeB node);
}
