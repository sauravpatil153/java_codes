package com.pojo;

public class Account {
	private int accountNo;
	
	private String accholderName;
	
	private String address;
	
	private double balance;
	
	private Type acctype;

	public Account() {
		super();
	}

	public Account(int accountNo, String accholderName,Type acctype, String address, double balance) {
		super();
		this.accountNo = accountNo;
		this.accholderName = accholderName;
		this.address = address;
		this.balance = balance;
		this.acctype = acctype;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccholderName() {
		return accholderName;
	}

	public void setAccholderName(String accholderName) {
		this.accholderName = accholderName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Type getAcctype() {
		return acctype;
	}

	public void setAcctype(Type acctype) {
		this.acctype = acctype;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accholderName=" + accholderName + ", address=" + address
				+ ", balance=" + balance + ", acctype=" + acctype + "]";
	}

	
	
}

