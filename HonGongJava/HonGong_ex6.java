package Practice;
// ������ ������ �迭�� ���
// ����(Ranking) �˰���
public class HonGong_ex6 {

	public static void main(String[] args) {
		// �����迭, ��ŷ�迭 ����
		int[] scores = {45, 80, 90, 35, 60, 40, 65, 90};
		int[] ranking = new int[scores.length];// scores�� ���Ҽ���ŭ �迭 ����
		
		// �ݺ������� ��ŷó��
		for(int i=0; i<scores.length; i++) {
			ranking[i]=1; //1�� �ʱ�ȭ
			
			for(int j=0; j<scores.length; j++) {
				if(scores[i] < scores[j]) {
					ranking[i]++;// �� ū���� ������ ������ŷ+1
				}
			}
			System.out.println(ranking[i]+" ");
		}
		// �������� �߻� ����
	}
}
