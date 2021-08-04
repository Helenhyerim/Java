package Practice;
// 배열 내 숫자들의 각 빈도수를 구하는 코드를 구현하시오
public class HonGong_ex8 {

	public static void main(String[] args) {
		// 배열선언
		int[] target = {0,1,3,2,2,2,1,4,4,5,2,2,3,1,4,5};
		
		int[] arr= new int[6]; //초깃값 0으로 설정됨
		
		// 빈도수 출력 , 카운팅 정렬: 해당 숫자를 인덱스로 받아서 횟수증가
		for(int i=0; i<target.length; i++) {
			arr[target[i]]++;
			}
				
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+"는 "+arr[i]+"번 있다");
		}

	}

}
