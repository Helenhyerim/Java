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
	
	// ����
	public void deposit() {
		System.out.println("-- deposit() start--");
	}
	// ���
	public void withdraw() {
		System.out.println("-- withdraw()--");
	}
	
	// ����
	public abstract void installmentSavings();
	// �ؾ�
	public abstract void cancellation();
	// �������
	public void getInfo() {
		System.out.printf("name : %s\n", name);
		System.out.printf("account : %s\n", account);
		System.out.printf("totalAmount : %s\n", totalAmount);
	}
}
