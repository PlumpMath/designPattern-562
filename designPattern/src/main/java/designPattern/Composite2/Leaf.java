package designPattern.Composite2;

import java.util.List;

//抽象构件角色
public class Leaf implements Component {

	private String name;
	
	public Leaf(String name) {
		this.name = name;
	}

	public void printStruct() {
		// TODO Auto-generated method stub
		System.out.println("我是树叶");
	}

	public void addChild(Component child) {
		// TODO Auto-generated method stub
		throw new RuntimeException("不支持此操作");
	}

	public void removeChild(int index) {
		// TODO Auto-generated method stub
		throw new RuntimeException("不支持此操作");
	}

	public List<Component> getChild() {
		// TODO Auto-generated method stub
		throw new RuntimeException("不支持此操作");
	}

}
