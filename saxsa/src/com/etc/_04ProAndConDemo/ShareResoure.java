package com.etc._04ProAndConDemo;
/**
 * ������Դ
 * @author Administrator
 *
 */

public class ShareResoure {
	private String name;
	private String gender;
	
	//�����߸�������Դ����
	public void push(String name,String gender){
		this.name = name;
		this.gender = gender;
	}
	
	//������Դ�����ݸ�������
	public void pop(){
		System.out.println(this.name+"-------"+this.gender);
	}
	

}
