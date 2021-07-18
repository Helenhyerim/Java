package Class;

public class No2_Object_Car_Ex {
	public static void main(String[] args) {
		// 객체 생성1
		// 명시적으로 선언된 생성자가 존재하면 기본생성자 자동추가X
		// 아래는 기본생성자가 아니므로 객체생성시 매개변수 줘야함
		No2_Object_Car myCar = new No2_Object_Car("블랙",350,0,"모델");
		
		// 필드값 읽기
		System.out.println(myCar.company);
		
		// 객체생성시점 필드는 초기값으로 자동설정됨 블랙이 아니고 레드로 출력
		// 다른 값으로 초기화하고싶다면 1)필드선언시 2)생성자&객체생성시 매개변수로 조정
		// 3) 생성자 내부에서 임의로 초기화 4) 객체 생성후 필드값 별도저장
		System.out.println(myCar.color);
		myCar.color = "블랙";
		System.out.println(myCar.color);
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println(myCar.speed); // 60출력
		
		// 객체 생성2
		// 매개변수로 초기화하기
		No2_Object_Car myCar1 = new No2_Object_Car("에이에이",1100);
		System.out.println(myCar1.aa + myCar.cc);
	}
}
