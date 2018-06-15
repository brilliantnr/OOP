package domain;

public class Salary {
	public static final String DEPT = "인턴";
	protected String dept, name;
	protected int sal;

	public Salary(String name, String dept, int sal) {

		this.name = name.substring(0, 1);
		this.sal = sal;
		setDept(DEPT);
		
	};
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String getDept() {
		return dept;
	}

	public String toString() {
		return String.format("%s %s  %d원 지급", name, dept, sal);
	}

}
