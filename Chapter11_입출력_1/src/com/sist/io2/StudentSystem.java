package com.sist.io2;
import java.util.*;
import java.io.*;
public class StudentSystem {
	private static int idPtr;
	private static String filePath="C:\\java_datas\\school.txt";
	private static List<Student> stdList = new ArrayList<Student>();
	static {
		FileReader fr = null;
		try {
			fr = new FileReader(filePath);
			StringBuilder sb = new StringBuilder();
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			String[] stds=sb.toString().split("\n");
			idPtr=stds.length+1;
			for(String str : stds) {
				StringTokenizer st = new StringTokenizer(str, "|");
				Student s = new Student();
				s.setId(Integer.parseInt(st.nextToken()));
				s.setName(st.nextToken());
				s.setKor(Integer.parseInt(st.nextToken()));
				s.setEng(Integer.parseInt(st.nextToken()));
				s.setMath(Integer.parseInt(st.nextToken()));
				s.setTotal(s.getEng()+s.getKor()+s.getMath());
				s.setAvg(s.getTotal()/3.0);
				stdList.add(s);
			}
		}
		catch (Exception e) {e.printStackTrace();}
		finally {
			try {
				fr.close();
			}catch (Exception e) {e.printStackTrace();}
		}
	}
	public int menu() {
		System.out.println("============== 메뉴 =============");
		System.out.println("1. 학생 목록");
		System.out.println("2. 학생 등록");
		System.out.println("3. 학생 수정");
		System.out.println("4. 학생 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.println("================================");
		int no=0;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("메뉴 번호 입력:");
			no = Integer.parseInt(in.readLine());
		}catch (Exception e) {e.printStackTrace();}
		return no;
	}
	public void process() {
		while(true) {
			int no = menu();
			if(no == 5) {
				System.out.println("프로그램 종료");
				FileWriter fw = null;
				try {
					fw = new FileWriter(filePath);
					for(Student s : stdList) {
						fw.write(s.getId()+"|"+s.getName()+"|"+s.getKor()+"|"+s.getEng()+"|"+s.getMath()+"|\n");
					}
				}catch (Exception e) {}
				finally {
					try {
						fw.close();
					}catch(Exception e) {}
				}
				return;
			}
			else if(no == 1) {
				for(Student s : stdList) {
					System.out.println(s.toString());
				}
			}
			else if(no == 2) {
				BufferedReader br = null;
				try {
					Student s = new Student();
					s.setId(idPtr++);
					br = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("이름 입력:");
					s.setName(br.readLine());
					System.out.print("국어 점수:");
					s.setKor(Integer.parseInt(br.readLine()));
					System.out.print("영어 점수:");
					s.setEng(Integer.parseInt(br.readLine()));
					System.out.print("수학 점수:");
					s.setMath(Integer.parseInt(br.readLine()));
					s.setTotal(s.getEng()+s.getKor()+s.getMath());
					s.setAvg(s.getTotal()/3.0);
					stdList.add(s);
				}catch (Exception e) {e.printStackTrace();}
				finally {
					try {
						br.close();
					} catch (Exception e) {e.printStackTrace();}
				}
			}
			else if(no == 4) {
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("학번 입력:");
					int id = Integer.parseInt(br.readLine());
				}catch(Exception e) {e.printStackTrace();}
			}
		}
	}
}
