package com.etc._04ProAndConDemo;

/**
 * ������
 * @author Administrator
 *
 */

public class Producer implements Runnable {
	//������Դ�Ķ���
	private ShareResoure share = null;
	public Producer(ShareResoure share){
		this.share = share;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++){
			if(i%2 == 0){
				share.push("����", "��");
			}else{
				share.push("���", "Ů");
			}
		}
		
	}

}
