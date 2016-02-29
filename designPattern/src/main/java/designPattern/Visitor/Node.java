package designPattern.Visitor;
//抽象节点角色
public abstract class Node {

	public abstract void accept(Visitor visitor);
}
