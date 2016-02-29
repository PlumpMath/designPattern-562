package designPattern.Visitor;

import java.util.ArrayList;
import java.util.List;
//结构对象角色
public class ObjectStructure {

	private List<Node> nodes = new ArrayList<Node>();
	
	public void add(Node node) {
		nodes.add(node);
	}
	
	public void action(Visitor visitor) {
		for (Node node : nodes) {
			node.accept(visitor);
		}
	}
}
