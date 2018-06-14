package ui;

import javax.swing.JOptionPane;
import domain.*;

enum PhoneButt {
	EXIT, TELEPHONE, CELLPHONE, IPHONE,GALAXY
};

public class PhoneMain {
	// 0.통화종료 1.집전화
	public static void main(String[] args) {
		PhoneButt[] buttons = { PhoneButt.EXIT, PhoneButt.TELEPHONE, PhoneButt.CELLPHONE,
				PhoneButt.IPHONE ,PhoneButt.GALAXY};
		Phone phone = null;
		CellPhone cp = null;
		IPhone ip = null;
		Galaxy gp = null;
 
		while (true) {
			PhoneButt select = (PhoneButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, buttons, null);
			switch (select) {
			case EXIT:
				return;
			case TELEPHONE:
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));

				JOptionPane.showMessageDialog(null, phone.toString());
				break;

			case CELLPHONE:
				cp = new CellPhone();
				cp.setName(JOptionPane.showInputDialog("이름"));
				cp.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				cp.setCall(JOptionPane.showInputDialog("통화내용"));
				cp.setPortable(true);
				JOptionPane.showMessageDialog(null, cp.toString());
				break;

			case IPHONE:
				ip = new IPhone();
				ip.setName(JOptionPane.showInputDialog("이름"));
				ip.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				ip.setCall(JOptionPane.showInputDialog("통화내용"));
				ip.setPortable(true);
				JOptionPane.showMessageDialog(null, ip.toString());
				break;
			case GALAXY:
				gp = new Galaxy();
				gp.setName(JOptionPane.showInputDialog("이름"));
				gp.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				gp.setCall(JOptionPane.showInputDialog("통화내용"));
				gp.setPortable(true);
				JOptionPane.showMessageDialog(null, gp.toString());
				break;
			default:
				break;
			}
		}
	}
}
