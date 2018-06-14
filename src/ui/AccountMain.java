package ui;
import domain.*;
import javax.swing.JOptionPane;

/**---------------------------
 *
 * (계쫘번호는랜덤생성)
 * 
 * 비트뱅크
 * 기본통장
 * 계좌번호 : 123-456-789
 * 이름 : ooo
 * 생성일: 2018년 6월 13일
 * 잔액 : 10000원
 * (입금하시겟습니까?)
 * -----------------------
 * 비트뱅크
 * 마이너스통장
 * 계좌번호 : 123-456-789
 * 이름 : ooo
 * 생성일: 2018년 6월 13일
 * 잔액 : -10000원* 
 * (대출받으시겠습니까?)
 * (출력물엔 id, 비번 안보임)
 * */

 
public class AccountMain {
	enum AccountButt {
		BASIC, MINUS, EXIT
	};

	public static void main(String[] args) {
		AccountButt[] buttons = { AccountButt.BASIC, AccountButt.MINUS, AccountButt.EXIT };
		Account account = null;
		MinusAccount minusAccount = null;
		
		while (true) {
			AccountButt select = (AccountButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, buttons, null);

			switch (select) {
			case BASIC:
				account = new Account();
				
				account.setName(JOptionPane.showInputDialog("이름?"));
				account.setUid(JOptionPane.showInputDialog("ID?"));
				account.setPw(JOptionPane.showInputDialog("비밀번호?"));
				
				JOptionPane.showMessageDialog(null, account.toString());
				break;
			case MINUS:
				minusAccount = new MinusAccount();
				minusAccount.setName(JOptionPane.showInputDialog("이름?"));
				minusAccount.setUid(JOptionPane.showInputDialog("ID?"));
				minusAccount.setPw(JOptionPane.showInputDialog("비밀번호?"));

				JOptionPane.showMessageDialog(null, minusAccount.toString());
				break;
			case EXIT:
				return;
			default:
				break;
			}
		}

	}

}
