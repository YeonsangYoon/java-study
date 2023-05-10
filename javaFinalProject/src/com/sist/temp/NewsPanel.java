package com.sist.temp;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sist.manager.*;

public class NewsPanel extends JPanel implements ActionListener{
	NewsCard[] cards = new NewsCard[5];
	JTextField tf;
	JButton b;
	JPanel pan;
	public NewsPanel() {
		tf = new JTextField();
		b = new JButton("검색");
		pan = new JPanel();
		pan.setLayout(new GridLayout(5, 1, 5, 5));
		
		for(int i=0;i<cards.length;i++) {
			cards[i]=new NewsCard();
			pan.add(cards[i]);
		}
		setLayout(null);
		
		tf.setBounds(10, 15, 250, 30);
		b.setBounds(265, 15, 100, 30);
		pan.setBounds(10, 55, 720, 650);
		add(tf);
		add(b);
		add(pan);
		pan.setVisible(false);
		tf.addActionListener(this);
		b.addActionListener(this);
	}
	public void printNews(String fd) {
		List<NewsVO> list = NaverNewsManager.newsSearchData(fd);
		int i=0;
		for(NewsVO vo : list) {
			cards[i].setText(vo);
			i++;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf || e.getSource() == b) {
			String fd = tf.getText();
			if(fd.length()<1) {	// 유효성 검사
				JOptionPane.showMessageDialog(this, "검색어 입력");
				tf.requestFocus();
				return;
			}
			printNews(fd);
			pan.setVisible(true);
		}
	}
}
