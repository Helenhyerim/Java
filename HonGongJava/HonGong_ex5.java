package Practice;

import java.util.Arrays;
import java.util.Collections;

// 성적 내림차순
public class HonGong_ex5 {

	public static void main(String[] args) {
		// [1] 점수 배열 설정
		int[] arr = {30, 5, 99, 82, 14, 20, 75}; //primitive 타입
		
		// 내림차순 알고리즘
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int ex = arr[j];
					arr[j]=arr[i];
					arr[i]=ex;
				}
			}
		}
		// 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		// Arrays.sort(), Collections클래스의 reverseOrder() 사용, 둘다 import 필요
		// 내림차순 메소드, Primitive타입 배열에는 적용 안됌, Wrapper 클래스로
		// 참고로 String은 primitive가 아님
		System.out.println("-----------------");
		Integer[] arr1= {30, 46,88, 20, 95};
		Arrays.sort(arr1, Collections.reverseOrder());
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}
