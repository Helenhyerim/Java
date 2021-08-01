package Class;

public class No9_Lamda_Main {

	public static void main(String[] args) {
		// 매개변수와 실행문만으로 작성
		No9_Lamda_Interface1 In1 = (String a, String b, String c) -> {System.out.println(a+" "+b+" "+c);};
		In1.method("this", "is", "Lamda");
		
		// 매개변수가 1개이거나 매개변수들의 타입이 같을때-> 타입생략가능
		No9_Lamda_Interface2 In2 = (s1)->{System.out.println(s1); };
		In2.method("Fighting");
		
		// 실행문이 1개일때 '{}' 생략가능
		No9_Lamda_Interface2 In3 = (s1)-> System.out.println(s1);
		In3.method("skip");
		
		// 매개변수와 실행문이  1개일때 '()' 와 '{}' 생략가능
		No9_Lamda_Interface2 In4 = s1 -> System.out.println(s1);
		In4.method("double skip");
		
		// 매개변수가 없을 때 '()'만 작성
		No9_Lamda_Interface3 In5 = ()-> System.out.println("no parameter");
		In5.method();
		
		// 반환값이 있는 경우
		No9_Lamda_Interface4 In6 = (x,y)->{
			int result = x+y;
			return result;
		};
		System.out.printf("In6.method(x,y) : %d\n", In6.method(3, 4));
		
		In6 = (x,y)->{
			int result = x-y;
			return result;
		};
		System.out.printf("In6.method(x,y) : %d\n", In6.method(20, 4));
		// 인터페이스는 껍데기니까 유연하게 사용 가능한 것
	}
}
