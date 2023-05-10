package com.sist.temp;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControlPanel extends JPanel {
	NewsPanel np=new NewsPanel();
	ChatPanel cp=new ChatPanel();
	FindPanel fp=new FindPanel();
	RecommendPanel rp=new RecommendPanel();
	HomePanel hp=new HomePanel(this);
	CardLayout card=new CardLayout();
	DetailPanel dp;
	public ControlPanel() {
		dp = new DetailPanel(this);
		setLayout(card);
		add("home",hp);
		add("news",np);
		add("chat",cp);
		add("find",fp);
		add("recomm",rp);
		add("detail",dp);
	}
}