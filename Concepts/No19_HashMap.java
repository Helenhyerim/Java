package Class;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class No19_HashMap {

	public static void main(String[] args) {
		Map<String , Integer> hm = new HashMap<>();
		
		// [1] �������
		hm.put("����", 01);
		hm.put("���", 02);
		hm.put("��õ", 03);
		
		// [2] Ű�� ����, ���� ���� 
		System.out.println(hm.keySet()); // Ű ����
		System.out.println(hm.values()); // �� ����
		
		// [3] Ű�� ��ã��
		System.out.println(hm.get("����")); // 01
		System.out.println(hm.get("�λ�")); // null
		
		// [4] iterator()�� ����� ���
		Iterator<String> keys = hm.keySet().iterator();
		
		while(keys.hasNext()) {
			String s = keys.next();
			System.out.println(s + hm.get(s));
		}
		
		// [5] ��� ����
		hm.replace("��õ", 04);
	}

}
