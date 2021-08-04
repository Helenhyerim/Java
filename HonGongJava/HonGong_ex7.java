package Practice;
// 성적의 순위를 출력
// 성적 배열의 점수를 오름차순으로 정렬하고, 옆에 등수를 표시
import java.util.Arrays;
public class HonGong_ex7 {
	// 출력하는 메소드
	public static void printRanking(int [] a, int [] b) {
		for(int i=0; i<a.length; i++) {
		System.out.println(a[i]+"점 -->"+b[i]+"등");
		}
	}

	public static void main(String[] args) {
		// 성적 배열 설정
		int[] scores= {50,40,60,70,20,95,88,45,95};
		int[] rankings = new int[scores.length];// 성적원소수만큼 랭킹배열설정
		// 오름차순 정렬
		Arrays.sort(scores);
		
		// 자신보다 큰 점수가 있을 시 인덱스 값 증가 -> 등수
		for(int i =0; i<scores.length; i++) {
			rankings[i] =1;
			for(int j=0; j<scores.length; j++) {
				if(scores[i]<scores[j]) {
					rankings[i]++;
				}
			}
		}
		// 출력 메소드로 출력
		printRanking(scores, rankings);
	}

}
