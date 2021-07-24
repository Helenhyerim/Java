package Class;

public class No5_Getter$Setter_Speed_Ex {
	public static void main(String[] args) {
		
		No5_Getter$Setter_Speed myCar = new No5_Getter$Setter_Speed();
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재속도: "+myCar.getSpeed());
		
		// 올바른 속도 변경
		myCar.setSpeed(100);
		System.out.println("현재속도: "+myCar.getSpeed());
		
		// 멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
			System.out.println("멈췄습니다");
			System.out.println("현재속도: "+myCar.getSpeed());
		} else {
			System.out.println("안멈춤");
			System.out.println("현재속도: "+myCar.getSpeed());
		}
		
	}

}
