package com.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dal.UserDALImp;
import com.pojo.User;
import com.util.DBUtil;

@WebServlet(value = "/Login", loadOnStartup = 1)
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDALImp userdal;

	@Override
	public void init() throws ServletException {
		try {
			DBUtil.getConnection();
			userdal = new UserDALImp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		try (PrintWriter pw = resp.getWriter()) {
			pw.write("<h1>Welcome to Login Page</h1>");
			User userobj = userdal.authenticateUser(req.getParameter("txtuser"), req.getParameter("txtpwd"));
			if (userobj == null) {
				System.out.println("------invalid login----");
				pw.write("<h3>Invalid Login<a href='login.html'>Retry</a></h3>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}
