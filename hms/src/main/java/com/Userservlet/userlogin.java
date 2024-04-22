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
@WebServlet("/userlogin")
public class userlogin extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email=req.getParameter("email");
	String pass=req.getParameter("password");
	
	HttpSession session=req.getSession();
	
	Userdao dao=new Userdao(DBConnect.getConnect());
	User user=dao.login(email, pass);

if(user!=null) {
session.setAttribute("userObj",user);
resp.sendRedirect("index.jsp");
}
else {
session.setAttribute("failmsg","invalid user");
resp.sendRedirect("userlogin.jsp");
}

	
}
}
