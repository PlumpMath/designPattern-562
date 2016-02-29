package designPattern.Builder;

import java.util.ArrayList;
import java.util.List;
//产品角色
public class Product {

	private List<String> list = new ArrayList<String>();
	
	public void add(String content) {
		list.add(content);
	}
	public void show() {
		for (String content : list) {
			System.out.println(content);
		}
	}
}
