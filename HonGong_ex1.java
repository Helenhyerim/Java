package Practice;
// �־��� ���� �迭���� �ִ� ���ϱ�
public class HonGong_ex1 {

	public static void main(String[] args) {
		// �迭 ����
		int[] ars = {};
		ars = new int[] {4,13,150,17,-2};
		
		// �迭�� ù��° ���� ���� ���� ũ�ٰ� ����
		int k= ars[0];
		System.out.println("���� �� ū�� "+ k);
		
		// [1] MathŬ���� Ȱ��
		// �ݺ��� ���鼭 ��&���
		/*for(int i = 0; i<ars.length; i++)
			k = Math.max(k, ars[i]);
		System.out.println("�ִ��� "+ k);
		*/

		// [2] �˰���
		// 2��°���� ���Ѵٸ� int i =1;
		for(int i=0; i<ars.length; i++) {
			if(k<ars[i]) {
				k=ars[i];
			}
		}
		System.out.println("�� ū���� "+ k);
	}

}
