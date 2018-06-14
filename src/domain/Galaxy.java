package domain;

public class Galaxy extends IPhone {
	public static final String BRNAD = "삼성", KIND = "GALAXY";
	private String size, kaTalk;
	// 홍길동에게 번호로 삼성 제품 5인치 갤럭시노트폰을 사용해서 이동간으한 상태로 안녕이라고 카톡한다.

	public void setSize(String size) {
		
		this.size = "6";
	}

	public void setData(String data) {
		super.data = data+"이라고 카톡했다";
	}

	public String getSize() {
		return size;
	}

	public String getKaTalk() {
		return kaTalk;
	}

	public String toString() {

		super.setPortable(true);
		return String.format("%s 에게 %s 번호로 %s 제품 %s 인치 %s 를 사용해서 %s 상태로 %s", super.getName(), super.getPhoneNum(),
				BRNAD,size, KIND, super.getMove(), super.data);
	}
}