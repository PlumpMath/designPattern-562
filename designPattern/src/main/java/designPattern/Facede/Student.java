package designPattern.Facede;

public class Student {

	private int age;
	private char sex;
	public int getAge() {
		return age;
	}
	public Student(int age, char sex) {
		super();
		this.age = age;
		this.sex = sex;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
}
