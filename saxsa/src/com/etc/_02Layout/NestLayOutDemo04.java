package com.etc._02Layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Ƕ�ײ���
 * @author Administrator
 *
 */

public class NestLayOutDemo04 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Ƕ�ײ���");
		frame.setBounds(100, 100, 400, 400);
		//���ò���   1.��߽粼��
		frame.setLayout(new BorderLayout());
		
		JPanel westPanel = new JPanel(); 
		westPanel.setBackground(Color.GREEN);//������ɫ
		frame.add(westPanel,BorderLayout.WEST);
		westPanel.setPreferredSize(new Dimension(60, 60));//���ô�С
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.BLACK);
		frame.add(southPanel,BorderLayout.SOUTH);
		southPanel.setPreferredSize(new Dimension(60, 60));
		
		JPanel centerPanel = new JPanel(); 
		centerPanel.setBackground(Color.ORANGE);
		frame.add(centerPanel,BorderLayout.CENTER);
		
		centerPanel.setLayout(new BorderLayout());//2..�м俴�ɱ߽粼��
		
		JButton btn = new JButton("�����м�ı���");
		centerPanel.add(btn, BorderLayout.NORTH);
		
		JPanel center_centerPanel = new JPanel();
		centerPanel.add(center_centerPanel, BorderLayout.CENTER);
		center_centerPanel.setBackground(Color.BLUE);
		
		center_centerPanel.setLayout(new FlowLayout());//3.�м���м���ʽ����
		
		for(int i = 0;i<6;i++){
			center_centerPanel.add(new JButton("���ǰ�ť"+i));
		}
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}