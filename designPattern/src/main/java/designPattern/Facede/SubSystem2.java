package designPattern.Facede;
//子系统角色
public class SubSystem2 {

	public boolean isSexValid(Student s) {
		if ('M' == s.getSex()) {
			return true;
		}
		return false;
	}
}
