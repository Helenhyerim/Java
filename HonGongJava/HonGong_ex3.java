package Practice;

// �������� ���� 10���� ���� ���� �迭�� �����
// �ִ񰪰� �ּڰ��� ���� ���
public class HonGong_ex3 {

	public static void main(String[] args) {
		// [1] �����迭 ����(10��)
		int[] arr = new int[10];
		int max=arr[0];
		int min=arr[0];
		
		// [2] �ݺ������� �������� 10�� ���� ����
		System.out.print("�迭�� ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
			System.out.print(arr[i]+" ");
		}
		
		// [3] �ִ�, �ּڰ� ���ϱ�
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}	
			if(min>arr[i]) {
					min = arr[i];
			}
		}
		
		System.out.println("�ִ��� "+ max);
		System.out.println("�ּڰ��� "+ min);
	}

}
