package com.etc._03Login.dao;


import java.sql.SQLException;
import java.util.ArrayList;

import com.etc._03Login.entity.User;
import com.etc._03Login.utils.JDBCUtils;



public class UserDao {
	//创建一个JDBC工具对象
	private JDBCUtils jdbc = new JDBCUtils();
	public UserDao(){
		jdbc.getConnection();
	}
	
	//插入数据
	public boolean addUser(User user) throws Exception{
		
		String sql = "INSERT INTO t_User (id,username,password,sex,birthday,hobby)" +
				" VALUES(null,?,?,?,?,?)";
		ArrayList<Object> params = new ArrayList<Object>();
		params.add(user.getUsername());
		params.add(user.getPassword());
		params.add(user.getSex());
		params.add(user.getBirthday());
		params.add(user.getHobby());
		boolean flag = jdbc.updateByPreparedStatement(sql, params);
		jdbc.releaseConn();
		return flag;
	}

}
