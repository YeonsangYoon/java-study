package com.sist.temp;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.net.*;

import com.sist.common.ImageChange;
import com.sist.manager.GenieMusicVO;
public class PosterCard extends JPanel{
	JLabel poLa = new JLabel(); // 이미지 출력
	JLabel tLa = new JLabel(); // 제목 출력
	GenieMusicVO vo;
	
	public PosterCard() {}
	public PosterCard(GenieMusicVO vo) {
		this.vo=vo;
		setLayout(null);
		
		poLa.setBounds(5, 5, 130, 130);
		tLa.setBounds(5, 140, 150, 30);
		
		add(poLa);
		add(tLa);
		
		try {
			URL url = new URL("http:"+vo.getPoster());
			Image img = ImageChange.getImage(new ImageIcon(url), 130, 130);
			poLa.setIcon(new ImageIcon(img));
			tLa.setText(vo.getTitle());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
