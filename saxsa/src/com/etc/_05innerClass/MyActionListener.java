package com.etc._05innerClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MyActionListener  implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("����һ��ʵ����ActionListener����");
		JOptionPane.showMessageDialog(null, "����һ��ʵ����ActionListener����");
	}

}


