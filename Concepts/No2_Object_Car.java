package Class;

public class No2_Object_Car {
	//�ʵ�
	String company = "00�ڵ���";
	String model ="�׷���";
	String color = "����";
	int maxSPeed = 350;
	int speed;
	String aa;
	String bb;
	int cc;
	int dd;
	
	// ������ ��������� ����
	No2_Object_Car(String color, int maxSpeed, int speed, String m){
		speed = 999;
		color = "��";
		maxSpeed = 1000;
		model = m;
		// model = "����";
	}
	
	No2_Object_Car(String aa, int cc){
		
		this.aa = aa;
		this.cc = cc;
		
	}
	
	No2_Object_Car(String company, String bb, int dd){}
}
