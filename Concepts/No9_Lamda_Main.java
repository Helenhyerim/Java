package Class;

public class No9_Lamda_Main {

	public static void main(String[] args) {
		// �Ű������� ���๮������ �ۼ�
		No9_Lamda_Interface1 In1 = (String a, String b, String c) -> {System.out.println(a+" "+b+" "+c);};
		In1.method("this", "is", "Lamda");
		
		// �Ű������� 1���̰ų� �Ű��������� Ÿ���� ������-> Ÿ�Ի�������
		No9_Lamda_Interface2 In2 = (s1)->{System.out.println(s1); };
		In2.method("Fighting");
		
		// ���๮�� 1���϶� '{}' ��������
		No9_Lamda_Interface2 In3 = (s1)-> System.out.println(s1);
		In3.method("skip");
		
		// �Ű������� ���๮��  1���϶� '()' �� '{}' ��������
		No9_Lamda_Interface2 In4 = s1 -> System.out.println(s1);
		In4.method("double skip");
		
		// �Ű������� ���� �� '()'�� �ۼ�
		No9_Lamda_Interface3 In5 = ()-> System.out.println("no parameter");
		In5.method();
		
		// ��ȯ���� �ִ� ���
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
		// �������̽��� ������ϱ� �����ϰ� ��� ������ ��
	}
}
