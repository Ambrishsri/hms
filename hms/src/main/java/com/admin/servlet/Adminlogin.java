package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Entity.User;
@WebServlet("/login")
public class Adminlogin extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String email=req.getParameter("email");
			String pass=req.getParameter("password");
			HttpSession session=req.getSession();
	if("admin@gmail.com".equals(email)&& "admin".equals(pass)) {
		session.setAttribute("adminObj",new User());
		resp.sendRedirect("admin/index.jsp");
	}else {
		session.setAttribute("failmsg","invalid user");
		resp.sendRedirect("adminlogin.jsp");
	}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
