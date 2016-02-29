package designPattern.Composite2;

import java.util.List;

//抽象构架角色
public interface Component {

	public void printStruct();
	
	public void addChild(Component child);
	
	public void removeChild(int index);
	
	public List<Component> getChild();
}
