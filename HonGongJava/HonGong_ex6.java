package Practice;
// 성적의 순위를 배열로 출력
// 순위(Ranking) 알고리즘
public class HonGong_ex6 {

	public static void main(String[] args) {
		// 점수배열, 랭킹배열 생성
		int[] scores = {45, 80, 90, 35, 60, 40, 65, 90};
		int[] ranking = new int[scores.length];// scores의 원소수만큼 배열 생성
		
		// 반복문에서 랭킹처리
		for(int i=0; i<scores.length; i++) {
			ranking[i]=1; //1로 초기화
			
			for(int j=0; j<scores.length; j++) {
				if(scores[i] < scores[j]) {
					ranking[i]++;// 더 큰수가 나오면 기존랭킹+1
				}
			}
			System.out.println(ranking[i]+" ");
		}
		// 공동순위 발생 가능
	}
}
