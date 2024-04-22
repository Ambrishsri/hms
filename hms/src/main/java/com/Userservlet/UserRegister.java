package com.Userservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.Userdao;
import com.DB.DBConnect;
import com.Entity.User;
@WebServlet("/register")
public class UserRegister  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	try {
		
		HttpSession session=req.getSession();
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		
		User u=new User(name,email,pass);
		Userdao dao=new Userdao(DBConnect.getConnect());
		
		boolean f=dao.register(u);
		
		if(f) {
		session.setAttribute("succMsg","Register successfully");
		resp.sendRedirect("register.jsp");
		}
		else {
			session.setAttribute("failMsg","Something went wrong");
			resp.sendRedirect("register.jsp");
		}
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	
}
