import java.util.ArrayList;
import java.util.List;

public class D01_ArrayList {
	/*
	 
	 	# 자료구조
	 	
	 	 - 데이터를 효율적으로 저장하는 여러가지 방식들
	 	 - 상황마다 최적의 효율을 내는 자료구조가 있다.
	 	   (검색, 탐색, 정렬, 추가, 삭제 등)
	 	 
	 	# Java Collection Interface
	 	
	 	 - 자바 라이브러리(자바가 미리 만들어놓은 클래스들)들에 대한 
	 	   정보는 Java API 문서를 확인하여 정확하게 파악할 수 있다.
	 	   (https://docs.oracle.com/en/java/javase/17/docs/api/)
	 	 - Collection은 자바에서 제공하는 자료구조 인터페이스이다.
	 	 - Collection끼리는 언제든지 다른 컬렉션으로 변환이 가능하다.
	 	 - Collection 인터페이스를 구현한 클래스로는 List, Set 등이 있다.
	 	 
	 	# ArrayList
	 	
	 	 - 배열과 유사하지만 크기가 자동으로 조절된다는 장점이 있는 자료구조
	 	 - 배열처럼 데이터를 순차적으로 저장한다. (인덱스가 있다.)
	 	 - 모든 데이터를 순서대로 접근하는 속도가 가장 빠르다.(탐색이 빠르다.)
	 */
	public static void main(String[] args) {
		
		// 타입을 지정하지 않고 리스트 생성하기
		ArrayList myList = new ArrayList();
		ArrayList myList2 = new ArrayList();
		
		// list.add(item): 리스트의 맨 뒤에 원하는 데이터를 추가한다.
		myList.add("A");
		myList.add(123);
		myList.add(99.9999);
		
		myList2.add("B");
		myList2.add("C");
		
		// list.add(index, item): 리스트의 원하는 위치에 원하는 데이터를 추가
		myList.add(0, 7777);
		
		// list.addAll(Collection): 다른 컬렉션의 모든 데이터를 추가
		myList.addAll(myList);
		
		// list.addAll(index, Collection): 원하는 위치에 다른 컬렉션 데이터 추가
		myList.addAll(2, myList2);
		
		System.out.println(myList);
		
		// list.get(index): 원하는 위치의 데이터를 하나 꺼낸다.
		// 타입을 지정하지 않았을 때는 Object타입으로 꺼내진다.		
		Object data = myList.get(5);
		
		System.out.println(data);
		System.out.println(myList.get(6));
		System.out.println(myList.get(7));
		
		// list.size(): 해당 리스트의 크기를 반환한다.
		System.out.println("myList의 크기: " + myList.size());
		System.out.println("myList2의 크기: " + myList2.size());
		
		for (int i = 0; i < myList.size(); ++i) {
			System.out.println(myList.get(i));
		}
		
		
		
		// 타입을 지정하면서 리스트 생성하기
		ArrayList<String> snacks = new ArrayList<>();
		
		snacks.add("마이구미");
		snacks.add("마이쮸");
		snacks.add("새콤달콤");
		
		System.out.println(snacks);
		
		String snack = snacks.get(2);
		System.out.println(snack);
		
		// list.contains(item): 리스트에 해당 값이 포함되어 있는지 여부를 반환
		System.out.println("리스트에 고구마깡이 있나요? " + snacks.contains("고구마깡"));
		
		// list.remove(index): 해당 인덱스의 데이터를 지운다.
		//					   해당 데이터를 지우면서 반환한다.
		
		// list.remove(Object): 해당 데이터가 있으면 지운다.
		//						삭제에 성공하면 true, 실패하면 false
		
		String removed = snacks.remove(0);
		
		System.out.println("지워진 녀석: " + removed);
		System.out.println("지워진 후의 모습: " + snacks);
		
		
		if (snacks.contains("마이쮸")) {
			System.out.println("마이쮸를 하나 먹음");
			boolean success =  snacks.remove("마이쮸");
			System.out.println(success);
		}
		
		// list.set(index, item): 해당 위치의 값을 원하는 값으로 수정한다.
		snacks.add("초코파이");
		snacks.add("초코파이");
		snacks.add("초코파이");
		snacks.add("초코파이");
		snacks.add("초코파이");
		snacks.add("초코파이");
		
		snacks.set(5, "오예스");
		
		System.out.println(snacks);
		
		// list.sublist(start, end): 리스트의 일부분을 반환한다. 
		List<String> subSnacks = snacks.subList(0, 5); // 0 ~ 4
		
		System.out.println(subSnacks);
	}
}
