package com.etc._09HashMapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	HashMap<String, String>
	public static void main(String[] args) {
		// HashMap   ---key-value----  �ֵ�
//		key:z   value:zhang3
//		key:w   value:wang5
//		key:l   value:li4
		
		//��������
		HashMap<String, String> map = new HashMap<String, String>();
		
		
		//key��Ψһ��
		
		//1.���key������    �������
		//2.���key����  �����޸�value
		map.put("z", "zhang3");
		map.put("l", "li4");
		map.put("w", "wang5");
		
		
	//	map.put("a", "wang5");
		
		System.out.println(map);
		System.out.println(map.size());
		
		
		//��ȡԪ��  ͨ��key��ȡValue
		String string = map.get("z");
		System.out.println(string);
		
		
		//����Map
		Set<String> s = map.keySet();//��ȡ���е�key
		for (String key : s) {
			System.out.println("key = "+key+"  value = "+map.get(key));
		}
		
		System.out.println("----------------");
		
		Collection<String> values = map.values();//��ȡ���е�value
		for (String value : values) {
			System.out.println(value);
		}
		
//		����:
//		ʹ��hashMap ������ϵİ༶����ϵͳ
		
		
	}

}
