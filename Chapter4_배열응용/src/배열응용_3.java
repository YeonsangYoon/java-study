import java.util.Arrays;

// 중복 없는 6개의 난수를 발생 => 1 ~ 45 
public class 배열응용_3 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		boolean[] check = new boolean[46];
		
		for(int i=0;i<lotto.length;i++) {
			int newNum = 0;
			while(true) {
				newNum = (int)(Math.random()*45)+1;
				if(!check[newNum]) {
					check[newNum]=true;
					break;
				}
			}
			lotto[i] = newNum;
			
		}
		System.out.println(Arrays.toString(lotto));
	}
}
