// 빈도수 구하기 : 0~9숫자를 랜덤으로 100번 생성해 빈도수 확인
public class 배열응용_5 {
	public static void main(String[] args) {
		int[] count = new int[10];
		for(int i=0;i<100;i++) {
			int num = (int)(Math.random()*10);
			count[num]++;
		}
		
		for(int i=0;i<10;i++){
			System.out.println(i+":"+count[i]);
		}
		
		int max = 0;
		int min = 0;
		for(int i=0;i<10;i++) {
			if(count[max]<count[i])
				max = i;
			if(count[min]>count[i])
				min = i;
		}
		
		System.out.printf("가장 빈도수가 많은 수 : %d (%d번 발생)\n", max, count[max]);
		System.out.printf("가장 빈도수가 적은 수 : %d (%d번 발생)\n", min, count[min]);
	}
}
