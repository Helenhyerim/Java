package Class;

public class No8_InnerClassAnonymousClass_Ex {

	public static void main(String[] args) {
		No8_InnerClass obj1 = new No8_InnerClass();
		
		System.out.println("obj1.num :"+ obj1.num);
		System.out.println("obj1.str1 :"+ obj1.str1);
		
		System.out.println();
		
		// 내부클래스1
		No8_InnerClass.InnerClass inner = obj1.new InnerClass();
		System.out.println("inner.num : "+ inner.num);
		System.out.println("inner.str2 : "+ inner.str2);
		
		System.out.println();
		
		// 내부클래스2
		// No8_InnerClassAnonymousClass.SInnerClass Sinner = obj1.new SInnerClass(); static이라서 안됨
		No8_InnerClass.SInnerClass SInner = new No8_InnerClass.SInnerClass();
		System.out.println("SInner.num : "+ SInner.num);
		System.out.println("SInner.str3 : "+ SInner.str3);
		
		System.out.println();
		
		// 익명(anonymous)클래스
		// 목적 : 메소드 재정의, 인터페이스나 추상클래스에서 주로 이용
		new No8_AnonymousClass() {
			// override
			public void anonyMethod() {
				System.out.println("--- Override anonyMethod---");
			}
		}.anonyMethod(); //이름이 없기때문에 바로호출, 한번 쓰고 버림
	}

}
