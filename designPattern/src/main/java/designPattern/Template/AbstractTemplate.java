package designPattern.Template;
//抽象模板
public abstract class AbstractTemplate {

	public void templateMethod() {
		abstractMethod();
		hookMethod();
		concreteMethod();
	}
	
	protected abstract void abstractMethod();
	
	protected void hookMethod() {
		
	}
	
	private final void concreteMethod() {
		
	}
}
