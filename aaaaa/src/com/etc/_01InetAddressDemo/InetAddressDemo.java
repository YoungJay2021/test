package com.etc._01InetAddressDemo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IP����
 * @author Administrator
 *
 */
public class InetAddressDemo {
	public static void main(String[] args) throws IOException {
		InetAddress ip =  InetAddress.getByName("MNBAUV1MW3IICTF");
//		InetAddress ip =  InetAddress.getByName("www.4399.com");
		System.out.println(ip);
		
		//��ȡ��������
		System.out.println(ip.getHostName());
		
		//��ȡIP��ַ
		System.out.println(ip.getHostAddress());
		
	
		//boolean isReachable(int timeout)  �����Ƿ���Դﵽ�õ�ַ�� 
		System.out.println(ip.isReachable(5000));
		
		System.out.println(InetAddress.getLocalHost());
		
		
		
	}

}