package com.sist.exception;
/*
 *    예외처리 방법 
 *    ----------
 *    1. 예외 복구 : try~catch~finally (가장 많이 사용되는 예외처리)
 *    2. 예외 회피 : throws (주로 라이브러리에 많이 사용됨)
 *    3. 임의 발생 : throw
 *    4. 사용자 정의 : 지원하지 않는 경우에 직접 제작(사용빈도는 거의 없다)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class 예외처리_예외복구_7 extends JFrame implements ActionListener{
	private JTextField tf;
	private JButton b1, b2;
	private int com;
	
	public 예외처리_예외복구_7() {
		tf = new JTextField(20);
		b1 = new JButton("시작");
		b2 = new JButton("종료");
		tf.setEnabled(false);
		JPanel p = new JPanel();
		p.add(tf); p.add(b1); p.add(b2);
		add("Center", p);
		setSize(390, 150);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this);
	}
	
	// 버튼 처리하는 메소드 : 정의 (용도가 여러개이기 때문에 구현을 하지 못한다
	// 호출은 해준다(자동 호출) => 구현은 사용자에게 맡긴다
	
	
	public static void main(String[] args) {
		new 예외처리_예외복구_7();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source==b2) {
			System.exit(0);
		}
		else if(source==b1) {
			com = (int)(Math.random()*100)+1;
			JOptionPane.showMessageDialog(this, "게임을 시작합니다");
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);
		}
		else if(source==tf) {
			String strNum = tf.getText();
			if(strNum.trim().length()<1) { // 입력이 안된 경우
				JOptionPane.showMessageDialog(this, "1~100까지 사이의 정수 입력");
				tf.requestFocus();
				return;
			}
			
			int num=0;
			try {
				num = Integer.parseInt(strNum); //문자열을 정수형으로 변경
				
			} catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(this, "정수만 입력이 가능합니다");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
			if(com > num) {
				JOptionPane.showMessageDialog(this, "입력한 정수보다 큰 정수를 입력하세요");
				tf.setText("");
				tf.requestFocus();
			}
			else if(com < num) {
				JOptionPane.showMessageDialog(this, "입력한 정수보다 작은 정수를 입력하세요");
				tf.setText("");
				tf.requestFocus();
			}
			else {
				JOptionPane.showMessageDialog(this, "정답입니다!!\nGame Over!!");
				tf.setEnabled(false);
				b1.setEnabled(true);
				return;
			}
		}
	}

}
