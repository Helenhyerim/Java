package Class;

public abstract class No11_AbstractClass_Bank {
	String name;
	String account;
	int totalAmount;
	
	public No11_AbstractClass_Bank() {
		System.out.println("Bank constructor1");
	}
	
	public No11_AbstractClass_Bank(String name, String account, int totalAmount) {
		System.out.println("Bank constructor2");
		this.name = name;
		this.account = account;
		this.totalAmount = totalAmount;
	}
	
	// 예금
	public void deposit() {
		System.out.println("-- deposit() start--");
	}
	// 출금
	public void withdraw() {
		System.out.println("-- withdraw()--");
	}
	
	// 적금
	public abstract void installmentSavings();
	// 해약
	public abstract void cancellation();
	// 정보출력
	public void getInfo() {
		System.out.printf("name : %s\n", name);
		System.out.printf("account : %s\n", account);
		System.out.printf("totalAmount : %s\n", totalAmount);
	}
}
