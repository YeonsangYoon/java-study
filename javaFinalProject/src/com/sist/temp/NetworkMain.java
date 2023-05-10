package com.sist.temp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.net.*;
import java.io.*;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.GenieMusicVO;
import com.sist.manager.MusicSystem;
public class NetworkMain extends JFrame implements ActionListener, Runnable, MouseListener{
		MenuPanel mp;
		ControlPanel cp;
		TopPanel tp;
		JButton b1,b2,b3,b4,b5;
		JLabel logo;
		Login login=new Login();
		int curpage = 1;
		final int totalpage = MusicSystem.list.size()/20;
		
		//네크워크 관련 클래스
		Socket s;
		BufferedReader in;
		OutputStream out;
		
		// id저장
		String myID;
		
		// 쪽지
		SendMessage sm = new SendMessage();
		RecvMessage rm = new RecvMessage();
		
		public NetworkMain() {
			logo=new JLabel();
			Image img=ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo1.png"), 200, 60);
			logo.setIcon(new ImageIcon(img));
			
			mp=new MenuPanel();
			cp=new ControlPanel();
			tp=new TopPanel();
			
			setLayout(null); // Layout없이 직접 배치
			logo.setBounds(10, 15, 200, 130);
			mp.setBounds(10, 150, 200, 300);
			cp.setBounds(220, 15, 750, 780);
			tp.setBounds(980, 15, 200, 780);
			
			// 메뉴 배치
			b1=new JButton("홈");
			b2=new JButton("뮤직검색");
			b3=new JButton("채팅");
			b4=new JButton("뉴스검색");
			b5=new JButton("뮤직추천");
			mp.setLayout(new GridLayout(5,1,10,10));
			mp.add(b1);
			mp.add(b2);
			mp.add(b3);
			mp.add(b4);
			mp.add(b5);
			
			// 추가
			add(mp);
			add(cp);
			add(tp);
			add(logo);
			
			// 윈도우 크기
			setSize(1200, 850);
			
			// 종료
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setTitle("네트워크 뮤직 프로그램");
			
			// 이벤트 등록
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			
			// 로그인
			login.b1.addActionListener(this);
			login.b2.addActionListener(this);
			
			// 채팅
			cp.cp.tf.addActionListener(this);
			cp.cp.b1.addActionListener(this);
			cp.cp.b2.addActionListener(this);
			cp.cp.table.addMouseListener(this);
			
			// 홈화면
			cp.hp.b1.addActionListener(this);
			cp.hp.b2.addActionListener(this);
			
			// 쪽지
			sm.b1.addActionListener(this);
			sm.b2.addActionListener(this);
			rm.b1.addActionListener(this);
			rm.b2.addActionListener(this);
		}
	public void musicDisPlay() {
		cp.hp.cardPrint(curpage);
		cp.hp.pageLa.setText(curpage+" page / "+totalpage+" pages");
	}
	// 버튼 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			curpage=1;
			musicDisPlay();
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==b2) {
			cp.card.show(cp, "find");
		}
		else if(e.getSource()==b3) {
			cp.card.show(cp, "chat");
		}
		else if(e.getSource()==b4) {
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==b5) {
			cp.card.show(cp, "recomm");
		}
		else if(e.getSource()==login.b1) {
			String id = login.tf1.getText();
			if(id.length()<1) {
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			String name = login.tf2.getText();
			if(name.length()<1) {
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			String sex = login.rb1.isSelected()?"남자":"여자";
			
			//서버로 전송
			try {
				s = new Socket("localhost", 10000);
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				out = s.getOutputStream();
				
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch (Exception ex) {
				ex.printStackTrace();
			}
			new Thread(this).start();
		}
		else if(e.getSource()==login.b2) {
			System.exit(0); // 프로그램 종료
		}
		else if(e.getSource()==cp.cp.tf) {
			String msg=cp.cp.tf.getText();
			String color=cp.cp.box.getSelectedItem().toString();
			if(msg.length()<1)
				return;
			
			try {
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			
			cp.cp.tf.setText("");
		}
		else if(e.getSource() == cp.hp.b1) { // 이전
			if(curpage>1) {
				curpage--;
				musicDisPlay();
			}
		}
		else if(e.getSource() == cp.hp.b2) { // 다음
			if(curpage<totalpage) {
				curpage++;
				musicDisPlay();
			}
		}
		else if(e.getSource() == cp.cp.b1) { // 쪽지보내기
			int row = cp.cp.table.getSelectedRow();
			sm.ta.setText("");
			String youId = cp.cp.table.getValueAt(row, 0).toString();
			sm.tf.setText(youId);
			sm.setVisible(true);
		}
		else if(e.getSource() == cp.cp.b2) { // 정보보기
			int row = cp.cp.table.getSelectedRow();
			String youId = cp.cp.table.getValueAt(row, 0).toString();
			
			try {
				out.write((Function.INFO+"|"+youId+"\n").getBytes()); // 개행문자있어야 서버에서 readline 가능
			}catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		else if(e.getSource() == sm.b1) { // 쪽지 보내기
			String youId = sm.tf.getText();
			sm.tf.setText("");
			String msg = sm.ta.getText();
			if(msg.length()<1) {
				JOptionPane.showMessageDialog(sm, "본문 입력");
				sm.ta.requestFocus();
				return;
			}
			try {
				out.write((Function.MSGSEND+"|"+youId+"|"+msg+"\n").getBytes());
			}catch (Exception ex) {
				ex.printStackTrace();
			}
			sm.setVisible(false);
		}
		else if(e.getSource() == sm.b2) { // 쪽지 보내기 취소
			sm.setVisible(false);
		}
		else if(e.getSource() == rm.b1) { // 쪽지 답장
			sm.tf.setText(rm.tf.getText());
			sm.ta.setText("");
			sm.setVisible(true);
			rm.setVisible(false);
		}
		else if(e.getSource() == rm.b2) { // 쪽지 답장 취소
			rm.setVisible(false);
		}
		
	}

	@Override
	public void run() {
		try {
			while(true) {
				String msg = in.readLine();
				StringTokenizer st = new StringTokenizer(msg,"|");
				int protocol = Integer.parseInt(st.nextToken());
				
				switch(protocol) {
				case Function.LOGIN:{
					String[] data = {st.nextToken(), st.nextToken(), st.nextToken()};
					cp.cp.model.addRow(data);
					break;
				}
				case Function.MYLOG:{
					setTitle(st.nextToken());
					myID = st.nextToken();
					login.setVisible(false);
					setVisible(true);
					musicDisPlay();
					break;
				}
				case Function.CHAT:{
					cp.cp.initStyle();
					cp.cp.append(st.nextToken(), st.nextToken());
					break;
				}
				case Function.INFO:{
					String data = "아이디"+st.nextToken()+"\n"
								+ "이름"+st.nextToken()+"\n"
								+ "성별"+st.nextToken();
					JOptionPane.showMessageDialog(this, data);
					break;
				}
				case Function.MSGSEND:{
					String id = st.nextToken();
					String strMsg = st.nextToken();
					rm.tf.setText(id);
					rm.tf.setText(strMsg);
					rm.setVisible(true);
				}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try 
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
		}catch(Exception ex){}
		new NetworkMain();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==cp.cp.table) {
			int row = cp.cp.table.getSelectedRow();
			String id = cp.cp.table.getValueAt(row, 0).toString();
			
			if(id.equals(myID)) {
				cp.cp.b1.setEnabled(false);
				cp.cp.b2.setEnabled(false);
			}
			else {
				cp.cp.b1.setEnabled(true);
				cp.cp.b2.setEnabled(true);
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	
	@Override
	public void mouseReleased(MouseEvent e) {}
	
	@Override
	public void mouseEntered(MouseEvent e) {}
	
	@Override
	public void mouseExited(MouseEvent e) {}
	
}