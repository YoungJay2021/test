package com.etc._02ExceptionDemo;
/**
 * �쳣�ʹ���
 * @author Administrator
 *
 */

class TT{
	public int run() {
		return run();
	}
}


public class ExceptionAndErrorDemo {

	public static void main(String[] args) {
		//--------    һ.Error
//		new TT().run();
//		1.java.lang.StackOverflowError  
		//��Ӧ�ó���ݹ�̫���������ջ���ʱ���׳��ô���
		
		//-------     ��.Exception
		
//		int ret = 10/0;
//		System.out.println(ret);
		
//		2. java.lang.ArithmeticException
		//�������쳣����������ʱ���׳����쳣�����磬һ�������������㡱ʱ���׳������һ��ʵ��
		
		
//		int[] arr = {1,3,4};
//		int i = arr[5];
		
//		3.java.lang.ArrayIndexOutOfBoundsException
//		�÷Ƿ�������������ʱ�׳����쳣���������Ϊ������ڵ��������С���������Ϊ�Ƿ�������
		
		String str = null;
		System.out.println(str.length());
		
//		4.java.lang.NullPointerException
//		��Ӧ�ó�����ͼ����Ҫ����ĵط�ʹ�� null ʱ���׳����쳣
		
	}

}
