package ui;

import javax.swing.JOptionPane;
import domain.BMI;
import domain.BMISalary;
import domain.Grade;
import domain.Lotto;

enum Butt{
	EXIT,
	INPUT_BMI,OUTPUT_BMI,
	INPUT_GRADE,OUTPUT_GRADE,
	INPUT_SALARY,OUTPUT_SALARY, 
	INPUT_LOTTOMONEY,OUTPUT_LOTTO;
}
public class Main {
	public static void main(String[] args) {
		Butt[] buttons = { Butt.EXIT, Butt.INPUT_BMI, Butt.OUTPUT_BMI,
							Butt.INPUT_GRADE, Butt.OUTPUT_GRADE,
							Butt.INPUT_SALARY,Butt.OUTPUT_SALARY,
							Butt.INPUT_LOTTOMONEY,Butt.OUTPUT_LOTTO};
		BMI[]  arr = new BMI[2];
		BMI bmi = null;
		int count = 0;
		Grade[] arrs = new Grade[2];
		Grade grade = null;
		BMISalary[] ar = new BMISalary[2];
		BMISalary salary = null;
		Lotto[] loarr = new Lotto[2];
		Lotto lotto = null;
		
		
		while (true) {
			Butt select = (Butt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, buttons, null);
			switch (select) {
			case EXIT:
				return; 
			case INPUT_BMI:
				bmi=new BMI();
				bmi.setName(JOptionPane.showInputDialog("이름?"));
				bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키(cm)를 입력")));
				bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게(kg)를 입력")));
				bmi.setResult();
				
				arr[count]=bmi;
				count++;
				break;
				
			case OUTPUT_BMI:
				String output="";
				for(int i = 0; i<arr.length;i++) {
					output += arr[i].toString()+"\n" ;
				}
				JOptionPane.showMessageDialog(null, output);
				break;
			case INPUT_GRADE:
				grade=new Grade();
				grade.setName(JOptionPane.showInputDialog("이름?"));
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수?")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어점수?")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학점수?")));
				grade.setTotal();
				grade.setAvg();
				grade.setGrade();
				arrs[count]=grade;
				count++;
				break;
				
			case OUTPUT_GRADE:
				output="";
				for(int i = 0; i<arrs.length;i++) {
					output += arrs[i].toString()+"\n" ;
				}
				JOptionPane.showMessageDialog(null, output);
				break;
				
			case INPUT_SALARY:
				salary = new BMISalary();
				salary.setDept(JOptionPane.showInputDialog("부서명"));
				salary.setName(JOptionPane.showInputDialog("이름"));
				salary.setSal(Integer.parseInt(JOptionPane.showInputDialog("본봉?")));
				salary.setBonus(Integer.parseInt(JOptionPane.showInputDialog("수당?")));
				
				
				ar[count]=salary;
				count++;
				break;
				
			case OUTPUT_SALARY:
				output="";
				for(int i = 0; i<ar.length;i++) {
					output += ar[i].toString()+"\n" ;
				}
				JOptionPane.showMessageDialog(null, output);
				break;
				
			case INPUT_LOTTOMONEY:
				lotto = new Lotto();
				lotto.setTime(Integer.parseInt(JOptionPane.showInputDialog("금액을 입력하시오")));
				lotto.setBall1();
				lotto.setBall2();
				lotto.setBall3();
				lotto.setBall4();
				lotto.setBall5();
				lotto.setBall6();
				
				loarr[count]=lotto;
				count++;
				break;
				
			case OUTPUT_LOTTO:
				output="";
				for(int i = 0; i<loarr.length;i++) {
					output += loarr[i].toString()+"\n" ;
				}
				JOptionPane.showMessageDialog(null, output);
				break;
				
				
			}
		}
	}
}
