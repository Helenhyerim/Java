package Class;

public class No8_InnerClass {
	int num = 100;
	static String str1 = "hello";
	
	public No8_InnerClass() {
		System.out.println("OuterClass Constructor");
	}
	
	// ����Ŭ����1
	class InnerClass {
		int num = 200;
		String str2 = str1; // ����Ŭ������ �ܺ�Ŭ���� ��� ���ٰ���
		
		// ����Ŭ����1 ������
		public InnerClass() {
			System.out.println("InnerClass Constructor");
		}
	}
	
	// ����Ŭ����2(static)
	static class SInnerClass {
		int num = 300;
		String str3 = str1;
		// String str4 = str2; static Ŭ������ �ܺ�Ŭ���� ����� ���ٺҰ�
		
		// ����Ŭ����2 ������
		public SInnerClass() {
			System.out.println("Static InnerClass Contructor");
			
		}
	}
	
	
	
	

}
