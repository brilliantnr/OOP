package ui;
// 인턴십 : 
import javax.swing.JOptionPane;
import domain.*;

enum SalaryButt {
	EXIT, INTURN, STAFF, OWNER
};

public class SalaryMain {
public static void main(String[] args) {
	SalaryButt[] buttons = { 
			SalaryButt.EXIT, 
			SalaryButt.INTURN, 
			SalaryButt.STAFF, 
			SalaryButt.OWNER,
			};
	Salary salary = null;
	
	while (true) {
		SalaryButt select = (SalaryButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU",
				JOptionPane.QUESTION_MESSAGE, null, buttons, null);
		switch (select) {
			case EXIT:
				return;

			case INTURN:
				salary = new Salary(
						JOptionPane.showInputDialog("이름"), 
						JOptionPane.showInputDialog("부서"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급")));

				JOptionPane.showMessageDialog(null, salary.toString());
			case STAFF:
				salary = new StaffSalary(
						JOptionPane.showInputDialog("이름"), 
						JOptionPane.showInputDialog("부서"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급")));

				JOptionPane.showMessageDialog(null, salary.toString());

				break;

			case OWNER:
				salary = new OwnerSalary(
						JOptionPane.showInputDialog("이름"), 
						JOptionPane.showInputDialog("부서"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급")));

				JOptionPane.showMessageDialog(null, salary.toString());
				break;

			default:
				break;
			}
		}
	
	}
}
