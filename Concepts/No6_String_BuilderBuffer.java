package Class;
// StringBuffer, StringBuilder 은 concat 혹은 + 대신 append사용
// concat & + 은 기존 String에 있던 값을 삭제하고 새로운 값을 넣는 것 -> 속도 저하
//String 객체끼리 더할 때 새로운 객체를 생성하지 않고 기존의 데이터에 더하는 방식 -> 빠르고 부하 적음
// 긴 문자열일 경우 Buffer, Builder 사용하는게 효율적
public class No6_String_BuilderBuffer {
// String : 불변객체 immutable
// StringBuffer, StringBuilder : 가변객체 mutable
// StringBuffer : 공통메소드 동기화되므로 멀티쓰레드 환경에서는 Buffer을 쓰는 것이 안전(값이 예상치 못하게 변경되는 것 방지)
// 그 외에는 Builder 사용하면 ok
	
	public static void main(String[] args) {
		
		StringBuilder builder1 = new StringBuilder();
		StringBuffer buffer1 = new StringBuffer();
		
		// [1] 값을 더하는 append
		builder1.append("abc");
		builder1.append(3);
		buffer1.append(2.3);
		buffer1.append("김밥");
		
		// [2] 특정 인덱스부터 값을 중간삽입 insert(인덱스, 값)
		builder1.insert(1, 'k');
		buffer1.insert(1, "flower");
		
		// [3] 인덱스 시작범위, 끝범위까지 값 삭제하는 delete
		builder1.delete(0, 1);
		
		// [4] 해당 인덱스의 char 값 charAt()
		System.out.println(builder1.charAt(2));
		
		// indexOf(), substring(), length(), replace(), reverse() 등등


	}

}
