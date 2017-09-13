package com.etc_03DateDemo;

import java.util.Calendar;

public class PrintCalendar {
	
	//��ӡָ������µ�����
	
	public static void printCalendar(int year,int month){
		//������������
		Calendar c =  Calendar.getInstance();//��ǰʱ��
		//�����Լ�ָ����ʱ��
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month-1);//0---11
		c.set(Calendar.DAY_OF_MONTH, 1);//ÿ���µĵ�һ��
		//System.out.println("����"+c.get(Calendar.DAY_OF_WEEK));
		
		//System.out.println("����"+c.get(Calendar.DAY_OF_WEEK));
		//ÿ����1�������ڼ�
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		//һ�����ܹ�����?
		int maxDays = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		//System.out.println(maxDays);
		
		System.out.println("��\tһ\t��\t��\t��\t��\t��\t");
		
		//��ӡ�ո�
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