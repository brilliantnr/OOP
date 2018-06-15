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
				phone = new CellPhone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				((CellPhone) phone).setPortable(true);
				JOptionPane.showMessageDialog(null, phone.toString());
				break;

			case IPHONE:
				phone = new IPhone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				((CellPhone) phone).setPortable(true);
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
				
			case GALAXY:
				phone = new Galaxy();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				((CellPhone) phone).setPortable(true);
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
				
			default:
				break;
			}
		}
	}
}
