package Practice;

import java.util.Arrays;

// 정렬 함수를 이용해 학생들의 성적을 오름차순 출력
public class HonGong_ex4 {

	public static void main(String[] args) {
		// 10자리 배열 만들기
		int[] jumsu = new int[10];
		int min = 0;
		
		// 배열에 무작위 점수 넣기
		
		for(int i=0; i<jumsu.length; i++) {
			jumsu[i]= (int)(Math.random()*10);
		}
		
		for(int i:jumsu) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		// 메소드로 오름차순 & 출력
		// Arrays.sort(jumsu);
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(jumsu[i]+" ");
		}
		
		// 알고리즘 오름차순 & 출력
		System.out.println();
		
		for(int i=0; i<jumsu.length; i++) {
			for(int j=i+1; j<jumsu.length; j++) {
				
				if(jumsu[i] > jumsu[j]) {// 오름차순, 선택정렬 자리바꾸기
				int ex = jumsu[i];
				jumsu[i] = jumsu[j];
				jumsu[j] = ex;
				}
			}
		}
		
		System.out.print("알고리즘 오름차순 배열: ");
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(jumsu[i]);
			if(i+1 != jumsu.length) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}
