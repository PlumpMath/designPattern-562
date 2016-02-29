package designPattern.Facede;

public class MainClass {

	public static void main(String[] args) {
		Student student = new Student(17, 'M');
		Facede facede = new Facede();
		boolean flag = facede.isValid(student);
		System.out.println(flag);
	}
}
