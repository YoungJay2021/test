package com.etc._01CreateThreadDemo;

class BoilWater1 implements Runnable{//��ˮ��

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


class WashCup1 implements Runnable{//ϴ������
	
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


public class RunableDemo02 {
	
	public static void main(String[] args) {
		BoilWater1 bw1 = new BoilWater1();
		
		WashCup1 wc1 = new WashCup1();
		
		Thread t1 = new Thread(bw1);
		t1.start();
		
		Thread t2 = new Thread(wc1);
		t2.start();
		
		
	}

}
