package com.dal;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.pojo.Account;
import com.pojo.Type;
import com.util.DBUtil;

public class AccountDALImplementation implements BankDAL {
	
	private Connection con;
	private CallableStatement cstmt ;
	private Statement stmt;
	private ResultSet rset;
	private PreparedStatement pstmt1;
	
	
	public AccountDALImplementation() {
		con = DBUtil.getConnection();
	}

	@Override
	public List<Account> getAllAccounts() throws SQLException {
		stmt = con.createStatement();
		List<Account> allAccounts = new ArrayList<Account>();
		rset = stmt.executeQuery("SELECT * FROM Accounts");
		while(rset.next()) {
			allAccounts.add(new Account(rset.getInt("accountNo"),rset.getString("accholdername"),
					Type.valueOf((rset.getString("acctype")).toUpperCase()),rset.getString("address"),
					rset.getDouble("balance")));
		}
		return allAccounts;
	}

	@Override
	public int addNewAccount(Account account) throws SQLException {
		pstmt1 = con.prepareStatement("INSERT INTO Accounts VALUES(?,?,?,?,?)");
		pstmt1.setInt(1, account.getAccountNo());
		pstmt1.setString(2, account.getAccholderName());
		pstmt1.setString(3, (account.getAcctype()).name());
		pstmt1.setString(4, account.getAddress());
		pstmt1.setDouble(5, account.getBalance());
		int i = pstmt1.executeUpdate();
		return i;
	}

	@Override
	public int updateAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferMoney() {
		// TODO Auto-generated method stub

	}

}
