package Practice;
// �־��� �����迭���� �ּڰ� ���ϱ�
public class HonGong_ex2 {

	public static void main(String[] args) {
		// �迭 ����
		int[] arr = {};
		arr = new int[] {3,50,22,-5,300};
		
		// �ּڰ� �ʱ�ȭ
		int min = arr[0];
		
		// [1] Math Ŭ���� Ȱ��
//		for(int i = 0; i<arr.length; i++){
//			min = Math.min(min,arr[i]);
//			}
//		 
		// [2] �˰���
		
		for(int i =0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("�ּڰ��� "+ min);

	}

}
