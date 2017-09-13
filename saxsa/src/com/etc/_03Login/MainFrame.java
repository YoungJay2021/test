package com.etc._03Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	public JFrame frame;
	private String userName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}
	
	public MainFrame(String userName) {
		initialize();
		this.userName = userName;
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		final JLabel lblNewLabel = new JLabel("��ӭ"+TempData.userName+"�쵼ݰ��ָ��");
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				//��������ʱ��
				lblNewLabel.setText("��ӭ"+TempData.userName+"�쵼ݰ��ָ��");
				
				
				//���췽��
				//lblNewLabel.setText("��ӭ"+userName+"�쵼ݰ��ָ��");
			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setLocationRelativeTo(null);//����
		
		//JLabel lblNewLabel = new JLabel("��ӭ"+this.userName+"�쵼ݰ��ָ��");
		
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 28));
		lblNewLabel.setBounds(23, 10, 293, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("��ʾ����");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ʹ�ñ���ͼ��ʾ����
				
				//���������
				Object[][] data = new Object[3][4];
				data[0][0] = "1";
				data[0][1] = "����";
				data[0][2] = "��";
				data[0][3] = "Ů";
				
				data[1][0] = "2";
				data[1][1] = "����";
				data[1][2] = "Ů";
				data[1][3] = "����";
				
				data[2][0] = "3";
				data[2][1] = "����";
				data[2][2] = "��";
				data[2][3] = "����";
				
	
				//��������  ��ͷ
				String[] columnNames = {"���","����","�Ա�","����"};
				
				//����TableModel �������
				DefaultTableModel model = new DefaultTableModel(data, columnNames);
				
				//���������
				JTable table = new JTable(model);
				
				
				JScrollPane scroll = new JScrollPane(table);
				scroll.setBounds(50, 50, 400, 400);
				table.setFillsViewportHeight(true);

				frame.getContentPane().add(scroll);
				
				
				
			}
		});
		button.setBounds(326, 23, 93, 23);
		frame.getContentPane().add(button);
	}

}
