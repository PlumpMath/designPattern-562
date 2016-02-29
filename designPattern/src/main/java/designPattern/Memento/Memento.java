package designPattern.Memento;
//备忘录角色
public class Memento {
  
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
	public Memento(String name, String phone, String budget) {
		super();
		this.name = name;
		this.phone = phone;
		this.budget = budget;
	}
	
	
}
