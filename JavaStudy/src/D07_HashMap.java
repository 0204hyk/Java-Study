import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import myobj.Peach;

public class D07_HashMap {
	/*
	 	# Map
	 	
	 	 - 데이터를 Key/Value 방식으로 저장하는 자료구조
	 	 - 인덱스 번호 대신 Key값을 이용해 Value에 접근한다.
	 	 - Key값은 중복을 허용하지 않는다.
	*/
	public static void main(String[] args) {
				//Key, Value의 제네릭 타입
		HashMap<String, Peach> map1 = new HashMap<>();
		
		// put(K, V) : 해당키에 값을 저장한다.
		map1.put("김민호", new Peach());
		map1.put("먹던것", new Peach());
		
		System.out.println(map1);
		// get(K) : 키 값에 해당하는 Value를 꺼낸다. 키를 찾지 못하면 null이 반환됨
		
		Peach p1 = map1.get("최민호");
		Peach p2 = map1.get("김민호");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("-------------------------------------");
		
		HashMap<String, String> navi = new HashMap<>();
		//HashMap<String, MemberInfo> members = new HashMap<>();
		
		navi.put("우리 집", "서울시 무슨구 무슨동 무슨무슨아파트 XXX-XXXX");
		navi.put("회사", "서울시 XX구 가산디지털단지 XXX밸리 XXX-XXXX");
		navi.put("마트", "...");
		
		System.out.println(navi);
		System.out.println("-------------------------------------");
		
		// putIfAbsent(K, V) : 새로운 등록일 때만 키와 데이터를 추가한다. (null을 리턴)
		//					   이미 키와 데이터가 존재하면 들어있는 값을 꺼내준다. (기존 데이터 수정x)
		// key 값이 존재하는 경우 > Map의 value 값을 반환
		// key 값이 존재하지 않는 경우 > key와 value를 Map에 저장하고 null을 반환

		String existValue1 = navi.putIfAbsent("우리 집", "경기도 구리시");
		String existValue2 = navi.putIfAbsent("우리집", "경기도 구리시");
		navi.put("마트", "서울특별시 구로구 디지털로32길 43");
		
		System.out.println(navi);
		System.out.println(existValue1);
		System.out.println(existValue2);
		System.out.println(navi.get("우리집"));
		System.out.println("-------------------------------------");
		
		// Map 탐색 방법
		
		// keySet() : 해당 맵의 키들로 이루어진 Set를 반환한다.
		Set<String> keys = navi.keySet();
		
		for (String key : keys) {
			System.out.printf("%s = %s\n", key, navi.get(key));
		}
		System.out.println("-------------------------------------");
		
		// values() : 해당 맵의 value들로 이루어진 Collection을 반환한다.
		List<String> valueList = new ArrayList<>(navi.values());
		
		for (String value : valueList) {
			System.out.println(value);
		}
		System.out.println("-------------------------------------");
		
		// containsKey(key) : Map의 키 값에 해당 키가 있는지 알려준다.
		System.out.println(navi.containsKey("우리집"));
		System.out.println(navi.containsKey("초밥무한리필"));
		System.out.println("-------------------------------------");
		
		// containsValue(value) : Map의 값에 해당 값이 있는지 알려준다.
		System.out.println(navi.containsValue("경기도 구리시"));
		System.out.println(navi.containsValue("경기도 남양주시"));
	}
}
