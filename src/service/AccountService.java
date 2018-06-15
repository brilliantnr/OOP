package service;

import domain.Account;

public interface AccountService {
	public Account createAccount(String name, String uid, String pass); 
	public Account[] list();
	public int deposit(int restmoney,String money);
	public int withdraw(int restmoney,String money);
	public String createAccountNo(String random);
	public String createRandom(int start,int end);
	public String createDate();
	public String showResult();
	
}
