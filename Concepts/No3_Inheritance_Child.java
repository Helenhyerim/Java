package Class;

public class No3_Inheritance_Child extends No3_Inheritance_Parents{
	// �ʵ�
	public int studentNo;
	
	// ������
	public No3_Inheritance_Child(String name, String ssn, int studentNo) {
		super(name, ssn);// �θ������ ȣ��
		this.studentNo = studentNo;
		
	}
	// �޼ҵ� ������
	// �޼ҵ� �ڵ�����: Source - Override/Implement Methods
	@Override
	double areaCircle(double r) {
		return Math.PI * r * r;
	}
	
	void method() {
		areaCircle(3.3); // �����ǵ� �޼ҵ� ȣ�� from �ڽ�
		super.areaCircle(3.3); // ������ �� �޼ҵ� ȣ�� from �θ�
	}
	

}
