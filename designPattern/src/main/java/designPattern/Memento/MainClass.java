package designPattern.Memento;

public class MainClass {

	public static void main(String[] args) {
		Originator originator = new Originator("lisi", "12345", "22");
		originator.show();
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.saveMemento());
		
		originator.setName("zhangsan");
		originator.setPhone("12344");
		originator.setBudget("344");
		
		originator.restoreMemento(caretaker.getMemento());
		
	}
}
