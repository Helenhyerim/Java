package Class;

public class No11_AbstractClass_myBank extends No11_AbstractClass_Bank{
	public No11_AbstractClass_myBank(String name, String account, int totalAmount) {
		super(name, account, totalAmount);
	}

	@Override
	public void installmentSavings() {
		System.out.println("-- installmentSavings() start --override");
	}

	@Override
	public void cancellation() {
		System.out.println("-- cancellation() start--override");
	}
}
