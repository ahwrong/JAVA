package mod0010;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "유비");
		map.put(new Integer(2), "관우"); //map.put(2, "관우"); 문법적으로 틀린 것이지만 오토박싱해줌.
		map.put(new Integer(3), "장비");
		
//		System.out.println(map.get(new Integer(1)));
		System.out.println(map.get(1));
		
		Set<Integer> set = map.keySet();
		for(Integer integer : set) {
			System.out.print(integer);
			System.out.println(" = " + map.get(integer));
//			System.out.println(map.get(integer));
		}
	}
}

// Deprecated: java에서 권고하는 형태.