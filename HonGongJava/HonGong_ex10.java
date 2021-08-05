package Practice;
// String 클래스의 메소드들
// charAt()
// ==는 번지수를 비교, 문자열만 비교하고싶다면 equals()
// 
public class HonGong_ex10 {
	public static void main(String[] args) {
		String str = "안녕하세요";
		int[] arr = {1,2,3,4,5};
		
		//System.out.println(str.length());
		//System.out.println(arr.length);
		
		String str1 = str.replace("안", "An");
		//System.out.println(str1);
		
		String strCut = str1.substring(1,3);
		//System.out.println(strCut);
		
		String eng = "hello world";
		String upper = eng.toUpperCase();
		System.out.println(upper);
		
		// .trim() 문자열 앞뒤 공백제거한 문자열 리턴
		
		// .ValueOf() 기본타입의 값을 문자열로 변환
		
		
		
		
		
		
	}
}
