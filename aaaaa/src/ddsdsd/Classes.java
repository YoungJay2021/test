package com.etc._03ClassesStudent_ArrayList;

import java.util.ArrayList;

/**
 * 班级类
 * @author Administrator
 *
 */
public class Classes {
	//动态数组  存放学生
	private ArrayList stus = new ArrayList();
	//1.添加学生
	public void add(Student stu){
		if(stu==null){
			System.out.println("该学生对象是空的,不能添加");
		}else{
			stus.add(stu);
			System.out.println("添加成功");
		}
	}
	//查询学生  指定查询
	
	
	//删除学生
	
	
	//4.全部查询
	public void showAllStudents(){
		//普通for
//		for(int i=0;i<stus.size();i++){
//			Object obj = stus.get(i);
//			if(obj instanceof Student){
//				Student s1 = (Student)obj;
//				System.out.println(s1);
//			}
//		}
		
		
		//System.out.println(stus);
		
		//foreach
		for (Object obj : stus) {
			if(obj instanceof Student){
				Student s1 = (Student)obj;
				System.out.println(s1);
			}
		}
		
	}
	 

}
