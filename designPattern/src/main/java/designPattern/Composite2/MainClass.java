package designPattern.Composite2;

public class MainClass {

	public static void main(String[] args) {
		Composite root = new Composite("根目录");
		Composite child1 = new Composite("子文件夹1");
		Composite child2 = new Composite("子文件夹2");
		
		Leaf leaf1 = new Leaf("文件1");
		Leaf leaf2 = new Leaf("文件2");
		
		root.addChild(child1);
		root.addChild(child2);
		
		child1.addChild(leaf1);
		child1.addChild(leaf2);
		
		root.printStruct();
	}
}
