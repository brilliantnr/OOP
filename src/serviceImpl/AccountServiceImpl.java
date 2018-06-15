package serviceImpl;
import javax.swing.JOptionPane;

import domain.Account;
import service.AccountService;
public class AccountServiceImpl implements AccountService {
	
	Account[] list ;
	int count;
	public AccountServiceImpl() {
		 list = new Account[10];
		 count =0;
	}
	public void addList(Account account) {
		list[count++] = account;
		
	}
	public Account[] list() {
		return list;
	}
	
	@Override
	public Account createAccount(String name, String uid, String pass) {
		return new Account(name, uid, pass);
	}
	
	@Override
	public int deposit(int restmoney, String money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdraw(int restmoney, String money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String createAccountNo(String random) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createRandom(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showResult() {
		String result="";
		for(int i=0;i<count;i++) {
			result += list()[i].toString();
		}
		return result;
	}


}
