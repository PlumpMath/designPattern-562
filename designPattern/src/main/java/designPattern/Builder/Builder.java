package designPattern.Builder;
//抽象构件者
public interface Builder {

	void buildPartA();
	void buildPartB();
	Product getResult();
}
