package com.sist.movie;

import java.util.Scanner;

public class MovieMain {
	public static void main(String[] args) {
		MovieSystem ms = new MovieSystem();
		Scanner Sc = new Scanner(System.in);
		
		while(true) {
			int menu = ms.menu();
			if(menu == 9) {
				System.out.println("프로그램 종료");
				break;
			}
			else if (menu == 1 || menu == 2 || menu == 3) {
				Movie[] mm = ms.movieListData(menu);
				int i=1;
				for(Movie m : mm) {
					System.out.println(i++ +". " + m.title);
				}
			}
			else if(menu == 4) {
				System.out.print("상세히 볼 영화번호 입력(1~10):");
				Movie m = ms.movieDetailData(Sc.nextInt());
				System.out.println("영화명: " + m.title);
				System.out.println("감독: " + m.director);
				System.out.println("상영시간: " + m.time + "분");
				System.out.println("장르: " + m.genre);
				System.out.println("줄거리: " + m.story);
			}
		}
	}
}
