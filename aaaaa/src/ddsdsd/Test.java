package com.etc._03ClassesStudent_ArrayList;

public class Test {
	public static void main(String[] args) {
		Classes c = new Classes();
		
		Student s1 = new Student("jack","1");
		Student s2 = new Student("jook","2");
		Student s3 = new Student("will","3");
		
		//调用添加的方法
		c.add(s1);
		c.add(s2);
		c.add(s3);
		
		//调用查询全部的方法
		c.showAllStudents();
		
	}

}
