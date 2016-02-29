package designPattern.Builder;
//具体构件者
public class ConcreteBuilderA implements Builder {

	private Product product = new Product();
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("A  part a");
	}

	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("A  part b");
	}

	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
