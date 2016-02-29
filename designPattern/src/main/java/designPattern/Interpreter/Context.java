package designPattern.Interpreter;

import java.util.HashMap;
import java.util.Map;
//环境角色
public class Context {

	private Map<Variable, Boolean> map = new HashMap<Variable, Boolean>();
	
	public void assign(Variable var, boolean value) {
		map.put(var, new Boolean(value));
	}
	
	public boolean lookup(Variable var) {
		return map.get(var).booleanValue();
	}
}
