package designPattern.Facede;
//子系统角色
public class SubSystem1 {

	public boolean isAgeValid(Student s) {
		if (s.getAge() > 18) {
			return true;
		}
		return false;
	}
}
