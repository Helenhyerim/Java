package Practice;

import java.util.Arrays;

// ���� �Լ��� �̿��� �л����� ������ �������� ���
public class HonGong_ex4 {

	public static void main(String[] args) {
		// 10�ڸ� �迭 �����
		int[] jumsu = new int[10];
		int min = 0;
		
		// �迭�� ������ ���� �ֱ�
		
		for(int i=0; i<jumsu.length; i++) {
			jumsu[i]= (int)(Math.random()*10);
		}
		
		for(int i:jumsu) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		// �޼ҵ�� �������� & ���
		// Arrays.sort(jumsu);
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(jumsu[i]+" ");
		}
		
		// �˰��� �������� & ���
		System.out.println();
		
		for(int i=0; i<jumsu.length; i++) {
			for(int j=i+1; j<jumsu.length; j++) {
				
				if(jumsu[i] > jumsu[j]) {// ��������, �������� �ڸ��ٲٱ�
				int ex = jumsu[i];
				jumsu[i] = jumsu[j];
				jumsu[j] = ex;
				}
			}
		}
		
		System.out.print("�˰��� �������� �迭: ");
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(jumsu[i]);
			if(i+1 != jumsu.length) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}
