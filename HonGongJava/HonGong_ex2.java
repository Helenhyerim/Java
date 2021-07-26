package Practice;
// 주어진 정수배열에서 최솟값 구하기
public class HonGong_ex2 {

	public static void main(String[] args) {
		// 배열 선언
		int[] arr = {};
		arr = new int[] {3,50,22,-5,300};
		
		// 최솟값 초기화
		int min = arr[0];
		
		// [1] Math 클래스 활용
//		for(int i = 0; i<arr.length; i++){
//			min = Math.min(min,arr[i]);
//			}
//		 
		// [2] 알고리즘
		
		for(int i =0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("최솟값은 "+ min);

	}

}
