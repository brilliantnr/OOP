package domain;

public class OwnerSalary extends StaffSalary {
	public static final String DEPT="이사"; 
	protected int share; //(sal +bonus)*10
	
	
	public OwnerSalary(String name,String dept,int sal) {
		super(name,dept,sal);
		this.sal =(int) (sal*1.1*10);
		setDept(DEPT);
	};
	public void setShare(int share) {
		this.share=share;
	}
}
