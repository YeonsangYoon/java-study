package com.sist.temp;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sist.common.ImageChange;
import com.sist.inter.HomeInterface;
import com.sist.manager.GenieMusicVO;
import com.sist.manager.MusicSystem;

public class HomePanel extends JPanel implements HomeInterface, MouseListener{
	JPanel pan;
	JPanel pageCon;
	JButton b1, b2;
	JLabel pageLa;
	ControlPanel cp;
	PosterCard[] pcs = new PosterCard[20];
	public HomePanel(ControlPanel cp) {
		this.cp = cp;
		setLayout(null);
		b1=new JButton("이전");
		b2=new JButton("다음");
		pageLa = new JLabel();
		
		pan = new JPanel();
		pan.setLayout(new GridLayout(4, 5, 5, 5));
		pan.setBounds(10, 15, 730, 700);
		add(pan);

		pageCon = new JPanel();
		pageCon.add(b1);
		pageCon.add(pageLa);
		pageCon.add(b2);
		pageCon.setBounds(10, 720, 730, 35);
		add(pageCon);
		
	}
	@Override
	public void cardPrint(int page) {
		pan.removeAll(); // 데이터 제거
		int idx = 0;
		for(int i=(page-1)*20;i<Math.min(page*20, MusicSystem.list.size());i++) {
			pcs[idx] = new PosterCard(MusicSystem.list.get(i));
			pcs[idx].addMouseListener(this);
			pan.add(pcs[idx++]);
		}
		
		
	}
	// 자동호출 => 콜백함수(시스템에 의해 호출되는 메소드)
	@Override
	public void mouseClicked(MouseEvent e) {
		for(int i =0;i<pcs.length;i++) {
			if(e.getSource()==pcs[i]) {
				GenieMusicVO vo = pcs[i].vo;
				try {
					URL url = new URL("http:"+vo.getPoster());
					Image img = ImageChange.getImage(new ImageIcon(url), 530, 350);
					cp.dp.imgLa.setIcon(new ImageIcon(img));
					cp.dp.titleLa.setText(vo.getTitle());
					cp.dp.singerLa.setText(vo.getSinger());
					cp.dp.albumLa.setText(vo.getAlbum());
					cp.dp.stateLa.setText(vo.getState());
					cp.dp.crementLa.setText(vo.getIncrement()==0?"":String.valueOf(vo.getIncrement()));
					cp.dp.keyLa.setText(vo.getKey());
					cp.card.show(cp, "detail");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				break;
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
}
