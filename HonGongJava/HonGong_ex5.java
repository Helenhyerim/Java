package Practice;

import java.util.Arrays;
import java.util.Collections;

// ���� ��������
public class HonGong_ex5 {

	public static void main(String[] args) {
		// [1] ���� �迭 ����
		int[] arr = {30, 5, 99, 82, 14, 20, 75}; //primitive Ÿ��
		
		// �������� �˰���
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int ex = arr[j];
					arr[j]=arr[i];
					arr[i]=ex;
				}
			}
		}
		// ���
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		// Arrays.sort(), CollectionsŬ������ reverseOrder() ���, �Ѵ� import �ʿ�
		// �������� �޼ҵ�, PrimitiveŸ�� �迭���� ���� �ȉ�, Wrapper Ŭ������
		// ����� String�� primitive�� �ƴ�
		System.out.println("-----------------");
		Integer[] arr1= {30, 46,88, 20, 95};
		Arrays.sort(arr1, Collections.reverseOrder());
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}
