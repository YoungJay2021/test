package com.etc_03DateDemo;

import java.util.Calendar;

public class PrintCalendar {
	
	//打印指定年和月的日历
	
	public static void printCalendar(int year,int month){
		//创建日历对象
		Calendar c =  Calendar.getInstance();//当前时间
		//我们自己指定的时间
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month-1);//0---11
		c.set(Calendar.DAY_OF_MONTH, 1);//每个月的第一天
		//System.out.println("星期"+c.get(Calendar.DAY_OF_WEEK));
		
		//System.out.println("星期"+c.get(Calendar.DAY_OF_WEEK));
		//每个月1号是星期几
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		//一个月总共几天?
		int maxDays = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		//System.out.println(maxDays);
		
		System.out.println("日\t一\t二\t三\t四\t五\t六\t");
		
		//打印空格
		for(int i=1;i<week;i++){
			System.out.print("\t");
		}
		for(int j = 1;j<=maxDays;j++){
			System.out.print(j+"\t");
			
			c.set(Calendar.DAY_OF_MONTH,j);  
			week = c.get(Calendar.DAY_OF_WEEK);
			
			
			if(week == 7){//1----7
				System.out.println();
			}
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		printCalendar(2017, 7);
	}

}