package designPattern.Builder;
//具体构件者
public class ConcreteBuilderB implements Builder {

	private Product product = new Product();
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("B  part a");
	}

	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("B  part b");
	}

	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
