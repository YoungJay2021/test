package com.etc._04ProAndConDemo;
/**
 * ������
 * @author Administrator
 *
 */
public class Consumer  implements Runnable {
	//������Դ�Ķ���
	private ShareResoure share = null;
	public Consumer(ShareResoure share){
		this.share = share;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++){
			share.pop();
		}
	}

}
