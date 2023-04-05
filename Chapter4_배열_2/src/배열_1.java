import java.util.Arrays;

/*
 *     *** 모아서 관리하는 것
 *         = 데이터 ==> 배열 / 클래스
 *         = 명령문 ==> 메소드 (재사용)
 *     1. 같은 데이터형을 모아서 관리
 *        ----------
 *        = 연속적으로 메모리 배치
 *        = 인덱스번호를 이용한다 (0부터 시작)
 *        = 고정적이다 (변경시에는 더 큰 배열을 생성해서 사용한다)
 *        = 배열 복사
 *          앝은 복사 => 별칭, 참조 (같은 메모리 주소를 활용)
 *             int[] arr={};
 *             int[] arr2=arr;  ==> 같은 메모리를 제어
 *          깊은 복사 => 데이터만 복사, 새로운 메모리를 만들어서 저장
 *             int[] arr={};
 *             int[] arr2=arr.clone()
 *             System.arraycopy()
 *        = 배열의 크기 : length
 *        = 출력시 에는 주로 for-each(향상된 for) 사용
 *          -------------------- 브라우저에서 변경하는 것이 아니라 출력
 *          배열 / 컬렉션 (데이터가 모아있어야 사용이 가능)
 *          => 인덱스를 이용하는 프로그램이 아니다
 *          = 배열에 저장된 값을 한개씩 읽어온온다
 *        = 초기값, 값을 변경시에는 일반 for문을 이용한다
 *        int[] arr = {10, 20, 30, 40, 50}
 *        ---
 *        for(int a : arr){
 *           a = 10
 *        }
 *      
 */
public class 배열_1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i:arr) {
			i = 100;
			System.out.println("i="+i);
		}
		System.out.println(Arrays.toString(arr));
	}
}
