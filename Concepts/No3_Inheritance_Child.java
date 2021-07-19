package Class;

public class No3_Inheritance_Child extends No3_Inheritance_Parents{
	// 필드
	public int studentNo;
	
	// 생성자
	public No3_Inheritance_Child(String name, String ssn, int studentNo) {
		super(name, ssn);// 부모생성자 호출
		this.studentNo = studentNo;
		
	}
	// 메소드 재정의
	// 메소드 자동생성: Source - Override/Implement Methods
	@Override
	double areaCircle(double r) {
		return Math.PI * r * r;
	}
	
	void method() {
		areaCircle(3.3); // 재정의된 메소드 호출 from 자식
		super.areaCircle(3.3); // 재정의 전 메소드 호출 from 부모
	}
	

}
