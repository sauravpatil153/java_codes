package com.dal;
import java.sql.SQLException;
import java.util.List;

import com.pojo.Account;

public interface BankDAL {
	List<Account> getAllAccounts() throws SQLException;
	
	int addNewAccount(Account account) throws SQLException;
	
	int updateAccount();
	
	int deleteAccount();
	
	void deposit();
	
	void withdraw();
	
	void transferMoney();
}
