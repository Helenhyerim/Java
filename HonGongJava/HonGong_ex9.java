package Practice;
// Ȧ��, ¦���� while�� continue�� ����� �����Ͻÿ�
// 1-30������ �������� ¦�� ���
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
