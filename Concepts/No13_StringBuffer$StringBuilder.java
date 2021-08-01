package Class;

public class No13_StringBuffer$StringBuilder {

	public static void main(String[] args) {
		// StringBuffer
		StringBuffer bf = new StringBuffer("Java");
		System.out.println("bf : "+bf);
		// 이어붙이기 : append()
		bf.append(33);
		System.out.println("bf : "+bf);
		// 데이터 길이측정 : length()
		System.out.println("br.length(): "+bf.length());
		// 중간삽입 : insert(인덱스, 데이터)
		bf.insert(bf.length(), "~~");
		System.out.println(bf);
		// 삭제 : delete(시작인덱스, 끝인덱스)
		bf.delete(2, 5);
		System.out.println(bf);
		
		System.out.println("-------------");
		// StringBuilder (Buffer와 메소드 똑같다)
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		sb.append(45);
	}
}
