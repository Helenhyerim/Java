package Class;

public class No11_AbstractClass_Bank_Ex {

	public static void main(String[] args) {
		No11_AbstractClass_Bank myBank = new No11_AbstractClass_myBank("À»Áö¹®´ö", "123-1222-32122", 30000);
		myBank.deposit();
		myBank.withdraw();
		myBank.installmentSavings();
		myBank.cancellation();
		
		System.out.println();
		
		myBank.getInfo();
	}
}
