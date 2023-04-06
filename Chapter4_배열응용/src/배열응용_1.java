import java.util.Arrays;

/*
 *    *** 자바의 메모리 구조
 *    
 *    
 *    
 *    1. 배열 선언
 *       데이터형[] 배열명;
 *       데이터형 배열명[];
 *    2. 배열 할당(연속적으로 몇개를 만들지 여부)
 *       데이터형[] 배열명 = new : 메모리 만들어주고 다음에 만든 메모리의 주소를 넘겨준다
 *                       ---- malloc(sizeof(10))
 *                       delete
 *                            free() ---> 개발자가 사용을 잘 안함
 *                       
 *                       GC => 사용하지 않거나 / null값일 경우 자동 회수
 *                       System.gc()
 *       데이터형 배열명[] = new 데이터형[크기]
 *       
 *       ex) int[] arr = new int[5];
 *           ---------   -----------
 *           Stack       Heap(실제 데이터가 저장)
 *           
 *           arr
 *           -----   ----------------------------
 *           0x100       0    0    0    0    0     
 *           -----  |----------------------------
 *             |   0x100
 *             |   
 *             |
 *        실제 저장된 데이터의 메모리 주소를 이용하서 데이터 관리 (참조변수)
 *        => 배열/ 클래스
 *        ** 변수 (변수, 배열, 클래스) => 초기한 후에 사용
 *               클래스(많이 사용) => 영화정보, 회원, 게시물...
 *        
 *     1. 인덱스를 이용하는 방법 => 초기화
 *        int[] arr = new int[3];
 *        arr[0] = 10;
 *        arr[1] = 20;
 *        arr[2] = 30;
 *     2. for문을 이용헤서 초기화
 *        for(int i=0;i<arr.length;i++)
 *           arr[i] = (i+1)*10;
 *     3. 선언과 동시에 초기화
 *        int[] arr = {10, 20, 30};
 *        
 *        
 *     *** new를 사용하는 경우 => 기본 디폴트 값이 설정된다
 *     int[]      ===> 0
 *     char[]     ===> '\u0000'
 *     String[]   ===> null (모든 클래스의 기본 디폴트는 null) => null은 메모리 주소가 없는 경우
 *     double[]   ===> 0.0                                 => NullPointerException
 *     boolean[]  ===> false
 */
public class 배열응용_1 {
	public static void main(String[] args) {
		// char배열 선언 => 26 ==> 초기값 => A ~ Z
		char[] alpha = new char[26];
		for(int i=0;i<alpha.length;i++)
			alpha[i]=(char)('A'+i);
		
		for(char c:alpha)
			System.out.print(c+" ");
	}
}
