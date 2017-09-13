package com.etc._02txDemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class BankDemo {
	public static void main(String[] args) {
		   JDBCUtils util = new JDBCUtils();
		   Connection con =  util.getConnection();
		 try {
			 
			 //-----1�����ֶ��ύ����
			 con.setAutoCommit(false);
			 
			// 1����ѯ���Ź��˵��˺��Ƿ�����ת������ (���>=1000)
			   String sql = "SELECT * FROM t_account WHERE name=? AND balance>= ?";
			   ArrayList<Object> params = new ArrayList<Object>();
			   params.add(0, "���Ź���");
			   params.add(1,1000);
			  Account account = null;
			  account = util.findSimpleRefResult(sql, params, Account.class);
			  
			  if(account == null){
				  System.out.println("������ȥ");
			  }else{
				  System.out.println("����ȥ");
			  }
			  
			
//		     2�������Ź��˵�����п۳����1000
			  sql = "UPDATE t_account SET balance = balance-? WHERE name = ?";
			  params = new ArrayList<Object>();
			  params.add(0,1000);
			  params.add(1, "���Ź���");
			  util.updateByPreparedStatement(sql, params);
			  
			  
			 // System.out.println(1/0);//ͣ��
			  
//		     3���ѿ۳��Ľ��1000���뵽��������������
			sql = "UPDATE t_account SET balance = balance+? WHERE name = ?";
			params = new ArrayList<Object>();
			params.add(0, 1000);
			params.add(1, "��������");
			util.updateByPreparedStatement(sql, params);
			
			//------2.���û������,����ɹ� �ύ����
			con.commit();
			  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			//------3.��������쳣
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
