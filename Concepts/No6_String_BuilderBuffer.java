package Class;
// StringBuffer, StringBuilder �� concat Ȥ�� + ��� append���
// concat & + �� ���� String�� �ִ� ���� �����ϰ� ���ο� ���� �ִ� �� -> �ӵ� ����
//String ��ü���� ���� �� ���ο� ��ü�� �������� �ʰ� ������ �����Ϳ� ���ϴ� ��� -> ������ ���� ����
// �� ���ڿ��� ��� Buffer, Builder ����ϴ°� ȿ����
public class No6_String_BuilderBuffer {
// String : �Һ���ü immutable
// StringBuffer, StringBuilder : ������ü mutable
// StringBuffer : ����޼ҵ� ����ȭ�ǹǷ� ��Ƽ������ ȯ�濡���� Buffer�� ���� ���� ����(���� ����ġ ���ϰ� ����Ǵ� �� ����)
// �� �ܿ��� Builder ����ϸ� ok
	
	public static void main(String[] args) {
		
		StringBuilder builder1 = new StringBuilder();
		StringBuffer buffer1 = new StringBuffer();
		
		// [1] ���� ���ϴ� append
		builder1.append("abc");
		builder1.append(3);
		buffer1.append(2.3);
		buffer1.append("���");
		
		// [2] Ư�� �ε������� ���� �߰����� insert(�ε���, ��)
		builder1.insert(1, 'k');
		buffer1.insert(1, "flower");
		
		// [3] �ε��� ���۹���, ���������� �� �����ϴ� delete
		builder1.delete(0, 1);
		
		// [4] �ش� �ε����� char �� charAt()
		System.out.println(builder1.charAt(2));
		
		// indexOf(), substring(), length(), replace(), reverse() ���


	}

}
