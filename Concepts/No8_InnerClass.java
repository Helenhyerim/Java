package Class;

public class No8_InnerClass {
	int num = 100;
	static String str1 = "hello";
	
	public No8_InnerClass() {
		System.out.println("OuterClass Constructor");
	}
	
	// 내부클래스1
	class InnerClass {
		int num = 200;
		String str2 = str1; // 내부클래스는 외부클래스 멤버 접근가능
		
		// 내부클래스1 생성자
		public InnerClass() {
			System.out.println("InnerClass Constructor");
		}
	}
	
	// 내부클래스2(static)
	static class SInnerClass {
		int num = 300;
		String str3 = str1;
		// String str4 = str2; static 클래스는 외부클래스 멤버에 접근불가
		
		// 내부클래스2 생성자
		public SInnerClass() {
			System.out.println("Static InnerClass Contructor");
			
		}
	}
	
	
	
	

}
