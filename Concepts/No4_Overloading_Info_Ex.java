package Class;

public class No4_Overloading_Info_Ex {

	public static void main(String[] args) {
		No4_Overloading_Info info = new No4_Overloading_Info();
		info.getInfo();
		info.getInfo("������", 33);
		info.getInfo("���ؿ�", 33, "����� �����");
		info.getInfo("chuchu ", "iamchuchu ", "doctor ");
	}

}
