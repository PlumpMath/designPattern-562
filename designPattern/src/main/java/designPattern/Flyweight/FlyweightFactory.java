package designPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;
//享元工厂角色
public class FlyweightFactory {

	private Map<Character, Flyweight> map = new HashMap<Character, Flyweight>();
	private static FlyweightFactory instance = new FlyweightFactory();
	
	private FlyweightFactory() {
		
	}
	public static FlyweightFactory getInstance() {
		return instance;
	}
	public Flyweight factory(Character state) {
		Flyweight flyweight = map.get(state);
		if (flyweight == null) {
			flyweight = new ConcreteFlyweight(state);
			map.put(state, flyweight);
		}
		return flyweight;
	}
}
