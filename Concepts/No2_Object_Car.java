package Class;

public class No2_Object_Car {
	//필드
	String company = "00자동차";
	String model ="그랜저";
	String color = "레드";
	int maxSPeed = 350;
	int speed;
	String aa;
	String bb;
	int cc;
	int dd;
	
	// 생성자 명시적으로 선언
	No2_Object_Car(String color, int maxSpeed, int speed, String m){
		speed = 999;
		color = "블랙";
		maxSpeed = 1000;
		model = m;
		// model = "뉴모델";
	}
	
	No2_Object_Car(String aa, int cc){
		
		this.aa = aa;
		this.cc = cc;
		
	}
	
	No2_Object_Car(String company, String bb, int dd){}
}
