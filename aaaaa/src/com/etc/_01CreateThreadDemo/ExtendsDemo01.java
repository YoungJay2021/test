package com.etc._01CreateThreadDemo;


class BoilWater extends Thread{//��ˮ��
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("������ˮ....");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("��ˮ����....");
	}
}


class WashCup extends Thread{//ϴ������
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<5;i++){
			System.out.println("ϴ���ӵ�"+(i+1)+"��");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}



public class ExtendsDemo01 {
	
	//���߳�
	public static void main(String[] args) {
		BoilWater bw = new BoilWater();
		bw.start();
		WashCup wc = new WashCup();
		wc.start();
		
		//һ��Ҫ����start����
		
	}

}
