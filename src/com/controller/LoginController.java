package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.LoginDao;
import com.Dao.RegisterDao;
import com.pojo.Login;
import com.pojo.Register;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String username = req.getParameter("username");
		    String password = req.getParameter("password");
		 
		    Login login = new Login();
		 
		    login.setUsername(username);
		    login.setPassword(password);
		 
		    LoginDao loginDao = new LoginDao();
		 
		    try
		    {
		        String userValidate = loginDao.authenticateUser(login);
		 
		        if(userValidate.equals("Admin_Role"))
		        {
		            System.out.println("Admin's Home");
		 
		            HttpSession session = req.getSession(); 
		            session.setAttribute("Admin", username); 
		            req.setAttribute("username", username);
		 
		            req.getRequestDispatcher("Admin.jsp").forward(req, resp);
		        }
		        else if(userValidate.equals("Student_Role"))
		        {
		            System.out.println("Editor's Home");
		 
		            HttpSession session = req.getSession();
		            session.setAttribute("Student", username);
		            req.setAttribute("username", username);
		 
		            req.getRequestDispatcher("Student.jsp").forward(req, resp);
		        }
		        else if(userValidate.equals("User_Role"))
		        {
		            System.out.println("User's Home");
		 
		            HttpSession session = req.getSession();
		            session.setMaxInactiveInterval(10*60);
		            session.setAttribute("User", username);
		            req.setAttribute("username", username);
		 
		            req.getRequestDispatcher("User.jsp").forward(req, resp);
		        }
		        else
		        {
		            System.out.println("Error message = "+userValidate);
		            req.setAttribute("errMessage", userValidate);
		 
		            req.getRequestDispatcher("login.jsp").forward(req, resp);
		        }
		    }
		    catch (IOException e1)
		    {
		        e1.printStackTrace();
		    }
		    catch (Exception e2)
		    {
		        e2.printStackTrace();
		    }
		}
}
