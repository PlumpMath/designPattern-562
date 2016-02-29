package designPattern.Facede;
//门面角色
public class Facede {

	public boolean isValid(Student s) {
		SubSystem1 subSystem1 = new SubSystem1();
		SubSystem2 subSystem2 = new SubSystem2();
		return subSystem1.isAgeValid(s) && subSystem2.isSexValid(s);
	}
}
