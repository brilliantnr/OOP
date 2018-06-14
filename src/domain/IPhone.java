package domain;

public class IPhone extends CellPhone{
	public static final String BRNAD = "애플", KIND = "아이폰";
	
	protected String data;
	public void setData(String data) {
		
		this.data = data+"이라고 문자했다";
	}
	public String getData() {
		return data;
	}

	public String toString() {
		//이름 에게 010 로 애플 제품 아이폰 사용해서 이동가능한 상태로 
		super.setPortable(true);
	/*	return String.format("%s 에게 %s 번호로 %s 제품  %s 를 사용해서 %s 상태로 %s",
				super.getName(),
				super.getPhoneNum(), BRNAD, KIND, super.getMove(), 
				data);*/
		return String.format("%s", data);
	}
}
