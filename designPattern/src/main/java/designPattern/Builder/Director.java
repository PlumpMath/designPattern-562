package designPattern.Builder;
//导演者角色
public class Director {

	public void build(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
