package mod0010;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "����");
		map.put(new Integer(2), "����"); //map.put(2, "����"); ���������� Ʋ�� �������� ����ڽ�����.
		map.put(new Integer(3), "���");
		
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

// Deprecated: java���� �ǰ��ϴ� ����.