package domain;

public class StaffSalary extends Salary {
	public static final String DEPT = "직원";
	// 기본급의 10퍼
	protected int bonus;
	
	public StaffSalary(String name, String dept, int sal) {
		super(name, dept, sal);
		setDept(DEPT);
		this.sal = (int) (sal * 1.1);
		
	};
	public void setBonus(int bonus) {		
		this.bonus=bonus;
	}
	
	
	
}
