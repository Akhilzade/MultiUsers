package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pojo.Login;
import com.pojo.Register;


public class LoginDao {

	public String authenticateUser(Login login)
	{
	    String userName = login.getUsername();
	    String password = login.getPassword();
	 
	    Connection con = null;
	    Statement statement = null;
	    ResultSet resultSet = null;
	 
	    String userNameDB = "";
	    String passwordDB = "";
	    String roleDB = "";
	 
	    try
	    {

	    	Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersmultiple","root", "root");
	    	statement = con.createStatement();
	        resultSet = statement.executeQuery("select username,password,status from register");
	 
	        while(resultSet.next())
	        {
	            userNameDB = resultSet.getString("username");
	            passwordDB = resultSet.getString("password");
	            roleDB = resultSet.getString("status");
	 
	            if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Admin"))
	            return "Admin_Role";
	            else if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Student"))
	            return "Student_Role";
	            else if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("User"))
	            return "User_Role";
	        }
	    }
	    catch(SQLException e)
	    {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return "Invalid user credentials";
	}
}
