package Class;

public class No4_Overloading_Info {
	// �޼ҵ常
	// �Ű������� �� or �ڷ����� �޶�� ��
	public void getInfo() {
		System.out.println("������ �ҷ��ɴϴ�");
	}
	
	public void getInfo(String name, int age) {
		System.out.println("�̸��� ���̸� �ҷ��ɴϴ�");
		System.out.println(name + age);
	}

	public void getInfo(String name, int age, String address) {
		System.out.println("�̸��� ���̿� �ּҸ� �ҷ��ɴϴ�");
		System.out.println(name + age + address);
	}
	
	public void getInfo(String id, String password, String job) {
		System.out.println("���̵�� ��й�ȣ�� ������ �ҷ��ɴϴ�");
		System.out.println(id + password + job);
	}
}
