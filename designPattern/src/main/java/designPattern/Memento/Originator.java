package designPattern.Memento;
//发起人角色
public class Originator {

	private String name;
	private String phone;
	private String budget;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public Originator(String name, String phone, String budget) {
		super();
		this.name = name;
		this.phone = phone;
		this.budget = budget;
	}
	
	public Memento saveMemento() {
		return new Memento(name, phone, budget);
	}
	
	public void restoreMemento(Memento memento) {
		name = memento.getName();
		phone = memento.getPhone();
		budget = memento.getBudget();
	}
	
	public void show() {
		System.out.println("name..." + name);
		System.out.println("phone..." + phone);
		System.out.println("budget..." + budget);
	}
	
}
