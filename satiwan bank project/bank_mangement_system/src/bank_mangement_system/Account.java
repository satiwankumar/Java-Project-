package bank_mangement_system;

import java.util.Scanner;

public class Account {
	
	String accounttype;
	double account_no;
	double balance;
	
	
	Account(){
	this.account_no = 0;
	this.accounttype = null;
	this.balance=0;
		
	}
	
	
	
	
	public Account(String accounttype, double account_no, double balance) {
		super();
		this.accounttype = accounttype;
		this.account_no = account_no;
		this.balance = balance;
	}
	public double getAccount_no() {
		return account_no;
	}
	public void setAccount_no(double account_no) {
		this.account_no = account_no;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	

}
