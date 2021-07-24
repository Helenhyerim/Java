package Class;

public class No4_Overloading_Info_Ex {

	public static void main(String[] args) {
		No4_Overloading_Info info = new No4_Overloading_Info();
		info.getInfo();
		info.getInfo("이익준", 33);
		info.getInfo("김준완", 33, "서울시 노원구");
		info.getInfo("chuchu ", "iamchuchu ", "doctor ");
	}

}
