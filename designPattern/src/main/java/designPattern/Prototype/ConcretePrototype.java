package designPattern.Prototype;

//具体原型角色
public class ConcretePrototype implements Prototype {

	public Prototype clone() {
		ConcretePrototype concretePrototype = new ConcretePrototype();
		return concretePrototype;
	}
}
