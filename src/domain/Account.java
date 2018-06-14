package domain;


public class Account {
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "기본통장";
	public final static String WITHDRAW_SUCCESS = "출금성공";
	public final static String WITHDRAW_FAIL = "잔액부족";
	public final static String DEPOSIT_SUCCESS = "입금성공";
	public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";
	protected int money;
	protected String accountNo, accountType, name, uid, pw, createDate;
	// 통장 123-345-678 의 형태가 되도록 코딩
	// createDate 블로그에서 오늘 날짜 뽑는 로직 가져다 쓰세요.
	// accountType = 기본 비트뱅크 or 마이너스통장
	// name 안에 타입,계좌번호넣어라.

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setCreateDate(String createDate) {
		createDate=new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());

		this.createDate = createDate;
		
		

		
		
	}
	public void setMoney(int money) {
		this.money = money;
	}

	
	public String setName() {
		return name;
	}
	public String setAccountType() {
		return accountType;
	}
	public String setAccountNo() {
		return accountNo;
	}
	public String setUid() {
		return uid;
	}
	public String setPw() {
		return pw;
	}
	public String setCreateDate() {
		return createDate;
	}
	public int setsetMoney() {
		return money;
	}

	
	public String toString() {
		return String.format("%s \n %s \n 계좌번호 : %s \n 이름 : %s \n 생성일 : %s \n 잔액 : %d", BANK_NAME, ACCOUNT_TYPE,
				accountNo, name, createDate, money);
	}
}
