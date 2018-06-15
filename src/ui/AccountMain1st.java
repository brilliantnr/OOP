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

public class AccountMain1st {
	enum AccountButt {
		BASIC, MINUS, DEPOSIT, WITHDRAW, EXIT,
	};

	public static void main(String[] args) {
		AccountButt[] buttons = { 
				AccountButt.BASIC, AccountButt.MINUS, 
				AccountButt.DEPOSIT, AccountButt.WITHDRAW,
				AccountButt.EXIT };
		
		Account account = null;

		while (true) {
			AccountButt select = (AccountButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, buttons, null);

			switch (select) {
			case BASIC:
				account = new Account(
						JOptionPane.showInputDialog("이름?"),
						JOptionPane.showInputDialog("ID?"),
						JOptionPane.showInputDialog("비밀번호?"));

				JOptionPane.showMessageDialog(null, account.toString());
				break;
			case MINUS:
				
				account = new MinusAccount(
				  JOptionPane.showInputDialog("이름?"),
				  JOptionPane.showInputDialog("ID?"),
				  JOptionPane.showInputDialog("비밀번호?")
						  );
				Integer.parseInt(JOptionPane.showInputDialog(null, "한도금액?"));
				//limit> wd  한도초과
				//limit<=wd 대출가능
			/*	int minus =0;
				if(limit> wd) {
					result = account.getMoney()-wd;
					account.setMoney(result);
				}else {
					result =account.getMoney();
					JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
				}*/
				

				JOptionPane.showMessageDialog(null, account.toString());
				break;
			case DEPOSIT:
				account.setMoney(Integer.parseInt(JOptionPane.showInputDialog(null, "입금액?")));
				JOptionPane.showMessageDialog(null, account.toString());
				break;

			case WITHDRAW:
				int wd =0; 
				
				wd=Integer.parseInt(JOptionPane.showInputDialog(null, " 출금액?"));
				
				
				int result =0;
				if(account.getMoney()>=wd) {
					result = account.getMoney()-wd;
					account.setMoney(result);
				}else {
					result =account.getMoney();
					JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
				}

				JOptionPane.showMessageDialog(null, account.toString());
				break;
			case EXIT:
				return;
			default:
				break;
			}
		}

	}

}
