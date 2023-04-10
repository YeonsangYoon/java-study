//	2. 임의의 정수를 배열로 생성해서 입력하고 정렬하는 프로그램 작성 
//	임의의 정수 입력 (배열 생성후)
//	정렬 처리
//	출력 

import java.util.Arrays;

public class 메소드문제2 {
	static int[] rand() {
		int cnt = (int)(Math.random()*5+5);
		int[] arr = new int[cnt];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100+1);
		}
		return arr;
	}
	
	static void sortASC(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	static void sortDESC(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	static void printArray(int[] arr) {
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("정렬전:");
		int[] arr = rand();
		printArray(arr);
		
		System.out.println("오름차순 정렬:");
		sortASC(arr);
		printArray(arr);

		System.out.println("내림차순 정렬:");
		sortDESC(arr);
		printArray(arr);
	}
}
