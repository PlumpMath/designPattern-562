package designPattern.Strategy;
//环境角色
public class Context {

	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void contextStrategy() {
		strategy.strategyInterface();
	}
	
}
