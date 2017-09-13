package com.etc._03Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame {

	private JFrame frame;
	private JTextField userNametextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame window = new LoginFrame();
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
	public LoginFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);//���ڲ�������
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setLocationRelativeTo(null);//����
		
		JLabel userNamelabel = new JLabel("�û���");
		userNamelabel.setFont(new Font("����", Font.PLAIN, 14));
		userNamelabel.setBounds(58, 53, 54, 15);
		frame.getContentPane().add(userNamelabel);
		
		JLabel passWordlabel = new JLabel("����");
		passWordlabel.setFont(new Font("����", Font.PLAIN, 14));
		passWordlabel.setBounds(58, 93, 54, 15);
		frame.getContentPane().add(passWordlabel);
		
		userNametextField = new JTextField();
		userNametextField.setBounds(122, 46, 156, 29);
		frame.getContentPane().add(userNametextField);
		userNametextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 86, 156, 29);
		frame.getContentPane().add(passwordField);
		
		JButton LoginBtn = new JButton("��¼");
		LoginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//---------��¼���¼�
				//1.��ȡ�û���������
				String userName = userNametextField.getText();
				char[] pw = passwordField.getPassword();
				String passWord = String.valueOf(pw);
				System.out.println(userName +"======"+passWord);
				//2.�ж��Ƿ�Ϊ��
				if(StringUtil.hasLength(userName) && 
						StringUtil.hasLength(passWord)){
					//3.�û����������Ƿ���ȷ   �û���:admin ����:123456
					if(userName.equals("admin") && passWord.equals("123456")){
						//JOptionPane.showMessageDialog(null, "��¼�ɹ�");
						
//						4.��ת��������
//						����1:���췽��
						MainFrame window = new MainFrame(userName);
						window.frame.setVisible(true);
						
						//����2:ʹ�õ�������ʱ��
						
//						MainFrame window = new MainFrame();
//						TempData.userName = userName;
//						window.frame.setVisible(true);
						
						//���ص�¼����
						frame.setVisible(false);
					}else{
						JOptionPane.showMessageDialog(null, "�û������������");
					}
					
				}else{
					JOptionPane.showMessageDialog(null, "���벻��Ϊ��");
				}
			}
		});
		LoginBtn.setBounds(99, 164, 150, 35);
		frame.getContentPane().add(LoginBtn);
	}
}
