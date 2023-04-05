
public class 문제12 {
	public static void main(String[] args) {
		int[] score = new int[10];
		for(int i=0;i<10;i++) {
			score[i]=(int)(Math.random()*100)+1;
		}
		
		int total = 0;
		for(int i=0;i<10;i++) {
			System.out.print(score[i]+" ");
			total += score[i];
		}
		System.out.println("\n총점:"+total);
		System.out.printf("평균:%.2f",total/10.0);
		
	}
}
