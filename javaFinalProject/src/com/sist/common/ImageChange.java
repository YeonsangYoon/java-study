package com.sist.common;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ImageChange {
	public static Image getImage(ImageIcon iIcon, int w, int h) {
		return iIcon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
	}
}
