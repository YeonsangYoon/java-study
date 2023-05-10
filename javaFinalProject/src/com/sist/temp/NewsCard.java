package com.sist.temp;

import java.awt.Color;

import javax.swing.*;
import javax.swing.border.LineBorder;

import com.sist.manager.NewsVO;

public class NewsCard extends JPanel{
	JLabel titleLa;
	JTextPane contentTp;
	JLabel dateLa;
	
	public NewsCard() {
		setLayout(null);
		titleLa = new JLabel();
		contentTp = new JTextPane();
		contentTp.setEditable(false);
		JScrollPane js = new JScrollPane(contentTp);
		dateLa = new JLabel();
		
		titleLa.setBounds(10, 15, 450, 30);
		js.setBounds(10, 50, 700, 70);
		dateLa.setBounds(500, 10, 200, 35);
		
		add(titleLa);
		add(js);
		add(dateLa);
	}
	public void setText(NewsVO vo) {
		titleLa.setText(vo.getTitle());
		contentTp.setText(vo.getContent());
		dateLa.setText(vo.getDate());
	}
}
