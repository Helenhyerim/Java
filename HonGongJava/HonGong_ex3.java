package Practice;

// 랜덤으로 정수 10개의 값을 갖는 배열을 만들고
// 최댓값과 최솟값을 같이 출력
public class HonGong_ex3 {

	public static void main(String[] args) {
		// [1] 정수배열 선언(10개)
		int[] arr = new int[10];
		int max=arr[0];
		int min=arr[0];
		
		// [2] 반복문에서 랜덤으로 10개 정수 셋팅
		System.out.print("배열은 ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
			System.out.print(arr[i]+" ");
		}
		
		// [3] 최댓값, 최솟값 구하기
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}	
			if(min>arr[i]) {
					min = arr[i];
			}
		}
		
		System.out.println("최댓값은 "+ max);
		System.out.println("최솟값은 "+ min);
	}

}
