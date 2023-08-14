package My.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("홍길동", 85);
		map.put("강길동", 90);
		map.put("이길동", 80);
		map.put("김길동", 95);
		System.out.println("총 객체수 : " + map.size());
		System.out.println();
		
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + " : " + value);
		System.out.println();
		
		//키를 반복해서 키와 값을 모두 얻기
		//	Set<String> keyset = map.keySet();
		//	Iterator Iterator = keyset.iterator();
		
		//	while(Iterator.hasNext()) {
		//		String s= (String) Iterator.next();
		//		Integer v = map.get(6);
		//		System.out.println(s + ":" + v);
		//	}
		//	map.remove("홍길동");
		//	System.out.println(map.size());
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String , Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
			
		}System.out.println();
	
	map.remove("홍길동");
	System.out.println("총 Entry 수 : " + map.size());
	System.out.println();
	}
}
