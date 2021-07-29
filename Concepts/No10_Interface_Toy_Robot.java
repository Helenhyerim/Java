package Class;

public class No10_Interface_Toy_Robot implements No10_Interface_Toy {

	public No10_Interface_Toy_Robot() {
		System.out.println("--- Toy Interface Constructor---2");
	}
	
	@Override
	public void walk() {
		System.out.println("robot can walk");
	}

	@Override
	public void run() {
		System.out.println("robot can run");
	}

	@Override
	public void alarm() {
		System.out.println("robot has alarm system");
	}

	@Override
	public void light() {
		System.out.println("robot gas light system");
	}
}
