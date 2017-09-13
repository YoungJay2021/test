package com.etc._02IO_fileInOutPutDemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class hahaha {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hahaha window = new hahaha();
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
	public hahaha() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 444, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(32, 72, 54, 15);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(100, 53, 99, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.control);
		textPane.setBounds(54, 53, 36, 21);
		textPane.setText("\u59D3\u540D:");
		frame.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(SystemColor.menu);
		textPane_1.setText("\u5BC6\u7801:");
		textPane_1.setBounds(54, 97, 36, 21);
		frame.getContentPane().add(textPane_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 97, 99, 21);
		frame.getContentPane().add(passwordField);
		
		JRadioButton radioButton = new JRadioButton("\u7537");
		buttonGroup.add(radioButton);
		radioButton.setBounds(100, 141, 44, 23);
		frame.getContentPane().add(radioButton);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBackground(SystemColor.menu);
		textPane_2.setText("\u6027\u522B:");
		textPane_2.setBounds(54, 141, 44, 21);
		frame.getContentPane().add(textPane_2);
		
		JRadioButton radioButton_1 = new JRadioButton("\u5973");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(155, 141, 44, 23);
		frame.getContentPane().add(radioButton_1);
		
		JCheckBox checkBox = new JCheckBox("\u6E38\u6CF3");
		checkBox.setBounds(99, 181, 54, 23);
		frame.getContentPane().add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\u6253\u7403");
		checkBox_1.setBounds(155, 181, 54, 23);
		frame.getContentPane().add(checkBox_1);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBackground(SystemColor.menu);
		textPane_3.setText("\u7231\u597D:");
		textPane_3.setBounds(54, 181, 36, 21);
		frame.getContentPane().add(textPane_3);
		
		JButton button = new JButton("\u6CE8\u518C");
		button.setBounds(54, 323, 146, 45);
		frame.getContentPane().add(button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2000", "2001", "2002", "2003", "2004", "2005"}));
		comboBox.setBounds(99, 224, 54, 23);
		frame.getContentPane().add(comboBox);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBackground(SystemColor.menu);
		textPane_4.setText("\u751F\u65E5:");
		textPane_4.setBounds(54, 224, 36, 21);
		frame.getContentPane().add(textPane_4);
	}
}
