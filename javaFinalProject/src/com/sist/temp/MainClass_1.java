package com.sist.temp;
/*
 *    Window => javax.swing
 *    ---------------------
 *      Container : 윈도우
 *          |
 *       JFrame : 일반 윈도우
 *       JDialog : 정보창, 입력창
 *       Jwindow
 *       JPanel : 독립적으로 사용이 불가능 => JFrame위에 설정
 *                화면 분할 => Component를 모아서 사용
 *       
 *      Component
 *          |
 *        Button : JButton, Menu, JCheckBox, JRadioButton
 *        한줄 입력창 : JTextField, JPasswordField
 *        여러줄 입력창 : JTextArea
 *        목록 출력 : JComboBox, JTable, JTree
 *        Labe : 정보/이미지
 *        스크롤 : JScrollPane
 *    ----------------------------------------
 *        배치
 *         => BorderLayout : 위/아래/좌/우/가운데
 *         => FlowLayout 
 *         => GridLayout
 *         => CardLayout
 *         => 사용자 정의 (위치를 잡아서 처리)
 *            x, y, width, height
 *         ==> 윈도우
 *            1) 크기 결정
 *               setSize(width, height)
 *            2) 윈도우를 보여준다
 *               setVisiable(true)
 *            3) 상속 => 이미 만들어져 있는 기능을 재사용(변경 가능)
 */
import java.awt.*; // Layout
import javax.swing.*; // window
import java.awt.event.*;

public class MainClass_1 extends JFrame {
	JButton b1, b2, b3, b4, b5;
	JMenuItem home, find, chat, news, board;
	JTabbedPane pane;
	public MainClass_1() {
		home = new JMenuItem("홈");
		find = new JMenuItem("검색");
		chat = new JMenuItem("채팅");
		news = new JMenuItem("뉴스");
		board = new JMenuItem("커뮤니티");
		JMenu menu = new JMenu("메뉴");
		menu.add(home);
		menu.add(find);
		menu.add(chat);
		menu.add(news);
		menu.add(board);
		JMenuBar bar = new JMenuBar();
		bar.add(menu);
		setJMenuBar(bar);
		
		pane = new JTabbedPane();
		pane.addTab("홈", new JPanel());
		pane.addTab("검색", new JPanel());
		pane.addTab("채팅", new JPanel());
		pane.addTab("뉴스", new JPanel());
		pane.addTab("커뮤니티", new JPanel());
		add("Center", pane);
		
		b1 = new JButton("홈");
		b2 = new JButton("검색");
		b3 = new JButton("채팅");
		b4 = new JButton("뉴스");
		b5 = new JButton("커뮤니티");
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(5, 10, 10, 10));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		
		add("West", p1);
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
		new Login();
	}
}
