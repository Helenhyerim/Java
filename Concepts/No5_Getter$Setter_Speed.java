package Class;

public class No5_Getter$Setter_Speed {
	// 필드, private 데이터은닉이지만 게터세터로 변경가능
	private int speed;
	private boolean stop; //초기값 false
	
	// 생성자
	
	// 메소드
	// speed 게터세터
	public int getSpeed() {
		return speed;
	}
	
	// 사용 목적 : 조건을 걸 수 있음
	public void setSpeed(int speed) {
		if(speed <0) {
			this.speed =0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	// stop 게터세터
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed =0;
	}
	
}
