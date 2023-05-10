package com.sist.temp;
import java.util.*;
import com.sist.manager.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DetailPanel extends JPanel implements ActionListener{
	JLabel imgLa;
	JLabel la1, la2, la3, la4, la5;
	JButton b1, b2;
	JLabel titleLa, singerLa, albumLa, stateLa, crementLa, keyLa;
	ControlPanel cp;
	public DetailPanel(ControlPanel cp) {
		this.cp = cp;
		imgLa = new JLabel(); 
		la1 = new JLabel("제목");
		la2 = new JLabel("가수명");
		la3 = new JLabel("앨범명");
		la4 = new JLabel("상태");
		la5 = new JLabel("등폭");
		b1 = new JButton("동영상");
		b2 = new JButton("목록");
		titleLa = new JLabel("");
		singerLa = new JLabel("");
		albumLa = new JLabel("");
		stateLa = new JLabel("");
		crementLa = new JLabel("");
		keyLa = new JLabel("");
		
		// 배치
		setLayout(null);
		imgLa.setBounds(100, 15, 530, 350);
		la1.setBounds(100, 375, 60, 40);
		titleLa.setBounds(165, 375, 300, 40);
		
		la2.setBounds(100, 425, 60, 40);
		singerLa.setBounds(165, 425, 300, 40);
		
		la3.setBounds(100, 475, 60, 40);
		albumLa.setBounds(165, 475, 300, 40);
		
		la4.setBounds(100, 525, 60, 40);
		stateLa.setBounds(165, 525, 300, 40);
		
		la5.setBounds(100, 575, 60, 40);
		crementLa.setBounds(165, 575, 300, 40);
		
		keyLa.setBounds(100, 625, 300, 40);
		keyLa.setVisible(false);
		
		JPanel p = new JPanel();
		p.add(b1); p.add(b2);
		p.setBounds(100, 625, 365, 40);
		
		add(imgLa);
		add(keyLa);
		add(la1); add(titleLa);
		add(la2); add(singerLa);
		add(la3); add(albumLa);
		add(la4); add(stateLa);
		add(la5); add(crementLa);
		add(p);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			try {
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe " + 
											"http://youtube.com/embed/" + 
											keyLa.getText());
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		else if(e.getSource()==b2) {
			cp.card.show(cp, "home");
		}
	}
}
