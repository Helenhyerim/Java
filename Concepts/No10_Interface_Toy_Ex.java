package Class;

public class No10_Interface_Toy_Ex {

	public static void main(String[] args) {
		// No10_Interface_Toy_Airplane airplane = new No10_Interface_Toy_Airplane();
		// No10_Interface_Toy_Robot robot = new No10_Interface_Toy_Robot();
		
		// �������̽� ��ü����
		Toy airplane = new No10_Interface_Toy_Airplane();
		Toy robot = new No10_Interface_Toy_Robot();
		// �迭�� ���� �� ����, ������Ÿ���� Toy�� ���Ƽ� ����
		Toy toys[] = {airplane, robot};
		
		for(int i=0; i<toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			
			System.out.println();
		}
	}
}
