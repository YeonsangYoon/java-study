package com.sist.main2;
// 포함

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyWindow2 {
	JFrame jf = new JFrame();
	JLabel la1, la2;
	JTextField  tf;
	JPasswordField pf;
	JButton b1, b2;
	
	
	public MyWindow2() {
		la1 = new JLabel("아이디");
		la2 = new JLabel("비밀번호");
		tf = new JTextField();
		pf = new JPasswordField();
		b1 = new JButton("로그인");
		b2 = new JButton("회원가입");
		jf.setLayout(null);
		la1.setBounds(10, 15, 55 ,30);
		la2.setBounds(10, 50, 55 ,30);
		tf.setBounds(60, 15, 150 ,30);
		pf.setBounds(60, 50, 150 ,30);
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(10, 90, 210, 35);
		jf.add(p);
		jf.add(la1);jf.add(la2);
		jf.add(tf);jf.add(pf);
		jf.setSize(640, 480);
		jf.setVisible(true);
		jf.setSize(640, 480);
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow2 m = new MyWindow2();
	}
}
