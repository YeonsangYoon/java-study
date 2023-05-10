package com.sist.manager;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class MusicSystem {
	public static List<GenieMusicVO> list = new ArrayList<GenieMusicVO>();
	
	static {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\java_datas\\genie_music.txt");
			ois = new ObjectInputStream(fis);
			
			list = (List<GenieMusicVO>)ois.readObject();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ois.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public List<GenieMusicVO> musicCategoryData(int cno) {
		List<GenieMusicVO> ret = new ArrayList<GenieMusicVO>();
		for(GenieMusicVO vo : list) {
			if(vo.getCno()==cno) {
				ret.add(vo);
			}
		}
		return ret;
	}
	public static List<GenieMusicVO> FindMusic(String title){
		List<GenieMusicVO> ret = new ArrayList<GenieMusicVO>();
		for(GenieMusicVO vo : list) {
			if(vo.getTitle().contains(title)) {
				ret.add(vo);
			}
		}
		return ret;
	}
}
