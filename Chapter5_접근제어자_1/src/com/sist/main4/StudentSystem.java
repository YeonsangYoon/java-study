package com.sist.main4;
import com.sist.main3.Student;
import java.util.Scanner;

public class StudentSystem {
	private Student[] std = new Student[3];
	// 1. 학생 초기화
	public void init() {
		Scanner Sc = new Scanner(System.in);
		for(int i=0;i<std.length;i++) {
			std[i]=new Student();
			
			System.out.print("학번 입력:");
			std[i].setId(Sc.nextInt());
			System.out.print("이름 입력:");
			std[i].name = Sc.next();
			System.out.print("국어 영어 수학 입력:");
			std[i].setKor(Sc.nextInt());
			std[i].setEng(Sc.nextInt());
			std[i].setMath(Sc.nextInt());
			System.out.print("성별 입력:");
			std[i].setGender(Sc.next());
			
		}
	}
	// 1-1 출력
	public void display() {
		for(Student s : std) {
			System.out.printf("%2d ", s.getId());
			System.out.printf("%5s ", s.name);
			System.out.printf("%3d ", s.getKor());
			System.out.printf("%3d ", s.getEng());
			System.out.printf("%3d ", s.getMath());
			System.out.printf("%s ", s.getGender());
			System.out.printf("%3d ", s.getTotal());
			System.out.printf("%.2f ", s.getAvg());
			System.out.printf("%c ", s.getScore());
			System.out.println(s.getRank());
		}
	}
	// 2. 총점 구하기
	public void stdTotal() {
		for(int i=0;i<std.length;i++) {
			std[i].setTotal(std[i].getKor() + std[i].getEng() + std[i].getMath());
		}
	}
	// 3. 평균 구하기
	public void stdAvg() {
		for(int i=0;i<std.length;i++) {
			std[i].setAvg(std[i].getTotal()/3.0);
		}
	}
	// 4. 학점 구하기
	public void stdScore() {
		char c= 'A';
		for(int i=0;i<std.length;i++) {
			switch((int)std[i].getAvg()/10) {
			case 10: case 9:
				c = 'A';
			case 8:
				c = 'B';
			case 7:
				c = 'C';
			case 6:
				c = 'D';
			case 5:
				c = 'F';
			}
			std[i].setScore(c);
		}
	}
	// 5. 등수 구하기
	public void stdRank() {
		for(int i=0;i<std.length;i++) {
			std[i].setRank(i+1);
		}
		for(int i=0;i<std.length;i++) {
			for(int j=i+1;j<std.length;j++) {
				if(std[i].getTotal() < std[j].getTotal()) {
					int tmp = std[i].getRank();
					std[i].setRank(std[j].getRank());
					std[j].setRank(tmp);
				}
			}
		}
	}
}
