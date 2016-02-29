package designPattern.Visitor;
//具体节点角色
public class NodeA extends Node {

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void operationA() {
		System.out.println("NodeA");
	}
}
