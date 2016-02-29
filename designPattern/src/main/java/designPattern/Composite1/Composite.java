package designPattern.Composite1;

import java.util.ArrayList;
import java.util.List;
//树枝节点
public class Composite implements Component {

	private String name;
	
	private List<Component> childComponents = new ArrayList<Component>();
	
	public Composite(String name) {
		this.name = name;
	}
	
	public void addChild(Component child) {
		childComponents.add(child);
	}
	
	public void removeChild(int index) {
		childComponents.remove(index);
	}
	
	public List<Component> getChild() {
		return childComponents;
	}
	public void printStruct() {
		// TODO Auto-generated method stub
		System.out.println("树叶的name为" + this.name);
		if (childComponents != null) {
			for (Component c : childComponents) {
				c.printStruct();
			}
		}
	}

}
