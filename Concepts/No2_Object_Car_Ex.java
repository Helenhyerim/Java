package Class;

public class No2_Object_Car_Ex {
	public static void main(String[] args) {
		// ��ü ����1
		// ��������� ����� �����ڰ� �����ϸ� �⺻������ �ڵ��߰�X
		No2_Object_Car myCar = new No2_Object_Car("��",350,0,"��");
		
		// �ʵ尪 �б�
		System.out.println(myCar.company);
		
		// ��ü�������� �ʵ�� �ʱⰪ���� �ڵ������� ���� �ƴϰ� ����� ���
		// �ٸ� ������ �ʱ�ȭ�ϰ�ʹٸ� 1)�ʵ弱��� 2)������&��ü������ �Ű������� ����
		// 3) ������ ���ο��� ���Ƿ� �ʱ�ȭ 4) ��ü ������ �ʵ尪 ��������
		System.out.println(myCar.color);
		myCar.color = "��";
		System.out.println(myCar.color);
		
		// �ʵ尪 ����
		myCar.speed = 60;
		System.out.println(myCar.speed); // 60���
		
		// ��ü ����2
		// �Ű������� �ʱ�ȭ�ϱ�
		No2_Object_Car myCar1 = new No2_Object_Car("���̿���",1100);
		System.out.println(myCar1.aa + myCar.cc);
	}
}
