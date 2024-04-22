package com.DAO;
//this class is used to perform all the crud operation with the database

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Entity.User;

public class Userdao {
private Connection connect;

public Userdao(Connection connect) {
	super();
	this.connect = connect;
}
public boolean register(User u) {
	boolean f=false;
	try {
		
		String sql="insert into user(fullname,email,password) values(?,?,?)";
		PreparedStatement ps=connect.prepareStatement(sql);
		ps.setString(1, u.getFullname());
		ps.setString(2, u.getEmail());
		ps.setString(3, u.getPassword());
		
		int i=ps.executeUpdate();
		
		if(i==1) {
			f=true;
		}
		
	} catch (Exception e) {
	e.printStackTrace();
	}
	return f;
}

public User login(String em,String psw) {
	User u=null;
	try {
		String sql ="select * from user where email=? and password=?";
		PreparedStatement ps=connect.prepareStatement(sql);
		ps.setString(1, em);
		ps.setString(2, psw);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			u=new User();
			u.setId(rs.getInt(1));
			u.setFullname(rs.getString(2));
			u.setEmail(rs.getString(3));
			u.setPassword(rs.getString(4));
			
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return u;
}


}
