package Class;

public class No4_Overloading_Info {
	// 메소드만
	// 매개변수의 수 or 자료형이 달라야 함
	public void getInfo() {
		System.out.println("정보를 불러옵니다");
	}
	
	public void getInfo(String name, int age) {
		System.out.println("이름과 나이를 불러옵니다");
		System.out.println(name + age);
	}

	public void getInfo(String name, int age, String address) {
		System.out.println("이름과 나이와 주소를 불러옵니다");
		System.out.println(name + age + address);
	}
	
	public void getInfo(String id, String password, String job) {
		System.out.println("아이디와 비밀번호와 직업을 불러옵니다");
		System.out.println(id + password + job);
	}
}
