import java.util.Arrays;

/*
 * 1. 달력 만들기
 *   1) 년도 / 월 입력
 *   2) 1일자의 요일 확인 => 세분화
 *   3) 달력 출력
 * 2. 숫자 야구 게임
 *   1) 난수 발생
 *   2) 사용자 입력
 *   3) 비교
 *   4) 힌트 생성
 *   5) 종료여부 확인
 */
public class 메소드조립법_1 {
	static void sort(int[] arr, int type) { // type 0 : 오름차순, tpye 1: 내림차순
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				boolean check;
				if(type == 0)
					check = arr[i]>arr[j];
				else
					check = arr[i]<arr[j];
				if(check) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	static void rand(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		rand(arr);
		System.out.println(Arrays.toString(arr));

		sort(arr, 0);
		System.out.println(Arrays.toString(arr));
		sort(arr, 1);
		System.out.println(Arrays.toString(arr));
	}
}
