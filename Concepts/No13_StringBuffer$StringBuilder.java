package Class;

public class No13_StringBuffer$StringBuilder {

	public static void main(String[] args) {
		// StringBuffer
		StringBuffer bf = new StringBuffer("Java");
		System.out.println("bf : "+bf);
		// �̾���̱� : append()
		bf.append(33);
		System.out.println("bf : "+bf);
		// ������ �������� : length()
		System.out.println("br.length(): "+bf.length());
		// �߰����� : insert(�ε���, ������)
		bf.insert(bf.length(), "~~");
		System.out.println(bf);
		// ���� : delete(�����ε���, ���ε���)
		bf.delete(2, 5);
		System.out.println(bf);
		
		System.out.println("-------------");
		// StringBuilder (Buffer�� �޼ҵ� �Ȱ���)
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		sb.append(45);
	}
}
