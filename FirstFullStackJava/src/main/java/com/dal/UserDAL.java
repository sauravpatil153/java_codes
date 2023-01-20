package com.dal;

import java.sql.SQLException;
import com.pojo.User;

public interface UserDAL {
	User authenticateUser(String email,String pwd) throws SQLException;
}
