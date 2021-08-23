package Class;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class No19_HashMap {

	public static void main(String[] args) {
		Map<String , Integer> hm = new HashMap<>();
		
		// [1] 요소저장
		hm.put("서울", 01);
		hm.put("경기", 02);
		hm.put("인천", 03);
		
		// [2] 키의 집합, 값의 집합 
		System.out.println(hm.keySet()); // 키 집합
		System.out.println(hm.values()); // 값 집합
		
		// [3] 키로 값찾기
		System.out.println(hm.get("서울")); // 01
		System.out.println(hm.get("부산")); // null
		
		// [4] iterator()을 사용해 출력
		Iterator<String> keys = hm.keySet().iterator();
		
		while(keys.hasNext()) {
			String s = keys.next();
			System.out.println(s + hm.get(s));
		}
		
		// [5] 요소 수정
		hm.replace("인천", 04);
	}

}
