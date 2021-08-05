package Practice;
// 홀수, 짝수를 while과 continue를 사용해 구현하시오
// 1-30까지의 수에서만 짝수 출력
public class HonGong_ex9 {

	public static void main(String[] args) {
		int i=1;
		
		while(i<30) {
			if(i%2 !=0) {
				i++;
				continue;
			}
			System.out.print(i+" ");
			i++;
		}

	}
}
