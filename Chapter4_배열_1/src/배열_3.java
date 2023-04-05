/*
 *    3명의 학생 국어, 영어, 수학 => 총점, 평균, 학점, 등수
 *    
 */
import java.util.Scanner;
public class 배열_3 {
	public static void main(String[] args) {
		// 배열 선언
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		
		int[] total = new int[3];
		double[] avg = new double[3];
		char[] score = new char[3];
		int[] rank = new int[3];
		
		Scanner Sc = new Scanner(System.in);
		
		for(int i=0;i<kor.length;i++) {
			System.out.print((i+1)+"번째 국어 점수 입력:");
			kor[i] = Sc.nextInt();
			System.out.print((i+1)+"번째 영어 점수 입력:");
			eng[i] = Sc.nextInt();
			System.out.print((i+1)+"번째 수학 점수 입력:");
			math[i] = Sc.nextInt();
			
			total[i]=kor[i]+math[i]+eng[i];
			avg[i]=(double)total[i]/3;
		}
		for(int i=0;i<kor.length;i++) {
			switch((int)avg[i]/10) {
			case 10:
			case 9:
				score[i] = 'A';
				break;
			case 8:
				score[i] = 'B';
		        break;
			case 7:
				score[i] = 'C';
				break;
			case 6:
				score[i] = 'D';
				break;
			default:
				score[i]='F';
				break;
			}
		}
		for(int i=0;i<kor.length;i++) {
			rank[i]=1;
			for(int j=0;j<kor.length;j++) {
				if(total[i]<total[j])
					rank[i]++;
			}
		}
		
		System.out.println("=============== 성적표 ===============");
		for(int i=0;i<kor.length;i++) {
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%2c%3d\n",
					kor[i],eng[i],math[i],total[i],avg[i], score[i], rank[i]);
		}
	}
}
