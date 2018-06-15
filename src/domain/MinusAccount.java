package domain;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE="마이너스통장";
	public int debt, limit; // 대출금
	
	
	public MinusAccount(String name,String uid,String pw) {
		super(name,uid,pw);
		setAccountType(ACCOUNT_TYPE);
		setAccountNo();
		setCreateDate();
	}
 
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getLimit() {
		return limit;
	}
	
	
/*	public String toString() {
		return String.format("%s \n %s \n 계좌번호 : %s \n 이름 : %s \n 생성일 : %s \n 잔액 : %d",
		 BANK_NAME, ACCOUNT_TYPE,super.accountNo, super.name, super.createDate, super.money)};*/
	
}
