package Practice;
// ������ ������ ���
// ���� �迭�� ������ ������������ �����ϰ�, ���� ����� ǥ��
import java.util.Arrays;
public class HonGong_ex7 {
	// ����ϴ� �޼ҵ�
	public static void printRanking(int [] a, int [] b) {
		for(int i=0; i<a.length; i++) {
		System.out.println(a[i]+"�� -->"+b[i]+"��");
		}
	}

	public static void main(String[] args) {
		// ���� �迭 ����
		int[] scores= {50,40,60,70,20,95,88,45,95};
		int[] rankings = new int[scores.length];// �������Ҽ���ŭ ��ŷ�迭����
		// �������� ����
		Arrays.sort(scores);
		
		// �ڽź��� ū ������ ���� �� �ε��� �� ���� -> ���
		for(int i =0; i<scores.length; i++) {
			rankings[i] =1;
			for(int j=0; j<scores.length; j++) {
				if(scores[i]<scores[j]) {
					rankings[i]++;
				}
			}
		}
		// ��� �޼ҵ�� ���
		printRanking(scores, rankings);
	}

}
