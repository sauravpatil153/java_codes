package com.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.util.DBUtil.*;
import com.mysql.cj.util.Util;
import com.pojo.User;

public class UserDALImp implements UserDAL {

	private Connection con;
	private PreparedStatement pstmt;

	public UserDALImp() throws SQLException {
		con = getConnection();
		pstmt = con.prepareStatement("select * from users where email=? and password=?");
	}

	@Override
	public User authenticateUser(String email, String pwd) throws SQLException {
		pstmt.setString(1, email);
		pstmt.setString(2, pwd);

		try (ResultSet rset = pstmt.executeQuery()) {
			if(rset.next()) {
				return new User(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), 
						rset.getDouble(5), rset.getDate(6), rset.getString(7));
			}
		} 
		return null;
	}

}
