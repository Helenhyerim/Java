package Practice;
// �迭 �� ���ڵ��� �� �󵵼��� ���ϴ� �ڵ带 �����Ͻÿ�
public class HonGong_ex8 {

	public static void main(String[] args) {
		// �迭����
		int[] target = {0,1,3,2,2,2,1,4,4,5,2,2,3,1,4,5};
		
		int[] arr= new int[6]; //�ʱ갪 0���� ������
		
		// �󵵼� ��� , ī���� ����: �ش� ���ڸ� �ε����� �޾Ƽ� Ƚ������
		for(int i=0; i<target.length; i++) {
			arr[target[i]]++;
			}
				
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+"�� "+arr[i]+"�� �ִ�");
		}

	}

}
