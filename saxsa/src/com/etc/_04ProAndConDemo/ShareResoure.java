package com.etc._04ProAndConDemo;
/**
 * 共享资源
 * @author Administrator
 *
 */

public class ShareResoure {
	private String name;
	private String gender;
	
	//生产者给共享资源数据
	public void push(String name,String gender){
		this.name = name;
		this.gender = gender;
	}
	
	//共享资源把数据给消费者
	public void pop(){
		System.out.println(this.name+"-------"+this.gender);
	}
	

}
