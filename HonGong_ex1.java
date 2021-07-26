package Practice;
// 주어진 정수 배열에서 최댓값 구하기
public class HonGong_ex1 {

	public static void main(String[] args) {
		// 배열 선언
		int[] ars = {};
		ars = new int[] {4,13,150,17,-2};
		
		// 배열내 첫번째 원소 수가 가장 크다고 가정
		int k= ars[0];
		System.out.println("현재 젤 큰수 "+ k);
		
		// [1] Math클래스 활용
		// 반복문 돌면서 비교&출력
		/*for(int i = 0; i<ars.length; i++)
			k = Math.max(k, ars[i]);
		System.out.println("최댓값은 "+ k);
		*/

		// [2] 알고리즘
		// 2번째부터 비교한다면 int i =1;
		for(int i=0; i<ars.length; i++) {
			if(k<ars[i]) {
				k=ars[i];
			}
		}
		System.out.println("젤 큰수는 "+ k);
	}

}
