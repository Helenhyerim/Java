package Class;

public class No5_Getter$Setter_Speed_Ex {
	public static void main(String[] args) {
		
		No5_Getter$Setter_Speed myCar = new No5_Getter$Setter_Speed();
		
		// �߸��� �ӵ� ����
		myCar.setSpeed(-50);
		System.out.println("����ӵ�: "+myCar.getSpeed());
		
		// �ùٸ� �ӵ� ����
		myCar.setSpeed(100);
		System.out.println("����ӵ�: "+myCar.getSpeed());
		
		// ����
		if(!myCar.isStop()) {
			myCar.setStop(true);
			System.out.println("������ϴ�");
			System.out.println("����ӵ�: "+myCar.getSpeed());
		} else {
			System.out.println("�ȸ���");
			System.out.println("����ӵ�: "+myCar.getSpeed());
		}
		
	}

}
