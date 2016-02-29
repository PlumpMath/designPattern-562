package designPattern.Visitor;
//具体节点角色
public class NodeB extends Node {

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void operationB() {
		System.out.println("NodeB");
	}
}
