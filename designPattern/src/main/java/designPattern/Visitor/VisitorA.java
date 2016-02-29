package designPattern.Visitor;
//具体访问者角色
public class VisitorA implements Visitor {

	public void visit(NodeA node) {
		// TODO Auto-generated method stub
		node.operationA();
	}

	public void visit(NodeB node) {
		// TODO Auto-generated method stub
		node.operationB();
	}

}
