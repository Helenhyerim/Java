package Class;

public class No10_Interface_Toy_Airplane implements Toy{

	public No10_Interface_Toy_Airplane() {
		System.out.println("--- Toy Interface Constructor---1");
	}
	@Override
	public void walk() {
		System.out.println("airplane cannot walk");
	}

	@Override
	public void run() {
		System.out.println("airplane cannot run");
	}

	@Override
	public void alarm() {
		System.out.println("airplane has alarm function");
	}

	@Override
	public void light() {
		System.out.println("airplane has light function");
	}
}
