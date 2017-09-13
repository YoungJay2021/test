package com.etc._07ObjectDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	//文件-------->Person对象     反序列化
	public static void main(String[] args) {
		try {
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("D:/my123.ini"));
			
			Object object = ois.readObject();
			if(object instanceof Person){
				Person p = (Person)object;
				System.out.println(p);
			}
			
			
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
