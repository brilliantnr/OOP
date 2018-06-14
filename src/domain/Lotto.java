package domain;
/**
 * 로또를 추첨
 * 1~45 까지 랜덤숫자
 * 볼 갯수는 총 6개
 * 중복 불허
 * 출력은 [5,22,23,40,19,30]
 * */
public class Lotto {
	int ball1,ball2,ball3,ball4,ball5,ball6,time;
	String result;
	
	public void setTime(int time) {
		this.time=time/1000;
	}
	public void setBall1() {
		this.ball1=(int)(Math.random()*45+1);
	}
	public void setBall2() {
		this.ball2=(int)(Math.random()*45+1);
	}
	public void setBall3() {
		this.ball3=(int)(Math.random()*45+1);
	}
	public void setBall4() {
		this.ball4=(int)(Math.random()*45+1);
	}
	public void setBall5() {
		this.ball5=(int)(Math.random()*45+1);
	}
	public void setBall6() {
		this.ball6=(int)(Math.random()*45+1);
	}
	public void setResult() {
		this.result=result;
	}
	
	
	
	public int time() {
		return time;
	}
	public int getball1() {
		return ball1;
	}
	public int getball2() {
		return ball2;
	}
	public int getbal3() {
		return ball3;
	}
	public int getball4() {
		return ball4;
	}
	public int getball5() {
		return ball5;
	}
	public int getball6() {
		return ball6;
	}
	public String toString() {
		return String.format("%d, %d, %d, %d, %d, %d, ", ball1,ball2,ball3,ball4,ball5,ball5,ball6);
	}
}
