package Class;

public class No5_Getter$Setter_Speed {
	// �ʵ�, private ���������������� ���ͼ��ͷ� ���氡��
	private int speed;
	private boolean stop; //�ʱⰪ false
	
	// ������
	
	// �޼ҵ�
	// speed ���ͼ���
	public int getSpeed() {
		return speed;
	}
	
	// ��� ���� : ������ �� �� ����
	public void setSpeed(int speed) {
		if(speed <0) {
			this.speed =0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	// stop ���ͼ���
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed =0;
	}
	
}
