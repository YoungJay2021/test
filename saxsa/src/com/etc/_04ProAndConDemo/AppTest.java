package com.etc._04ProAndConDemo;
/**
 * �����ߺ�������
 * @author Administrator
 *
 */

public class AppTest {
	public static void main(String[] args) {
		//������Դ����
		ShareResoure share = new ShareResoure();
		
		//������ ----share
		Producer pro = new Producer(share);
		new Thread(pro).start();
		
		//������-----share
		Consumer con = new Consumer(share);
		new Thread(con).start();
		
	}

}
