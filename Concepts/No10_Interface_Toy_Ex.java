package Class;

public class No10_Interface_Toy_Ex {

	public static void main(String[] args) {
		// No10_Interface_Toy_Airplane airplane = new No10_Interface_Toy_Airplane();
		// No10_Interface_Toy_Robot robot = new No10_Interface_Toy_Robot();
		
		// 인터페이스 객체생성
		Toy airplane = new No10_Interface_Toy_Airplane();
		Toy robot = new No10_Interface_Toy_Robot();
		// 배열에 넣을 수 있음, 데이터타입이 Toy로 같아서 가능
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
