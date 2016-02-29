package designPattern.Composite1;
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

}
