import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import blackjack.Card;

public class D05_Collections {
	
	/*
	 	# java.util.Arrays
	 	
	 	 - 배열을 편하게 다룰 수 있는 메서드들이 모여있는 클래스
	 	 
	 	# java.util.Collections
	 	
	 	 - 컬렉션을 편하게 다룰 수 있는 메서드들이 모여있는 클래스
	 */
	
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		Set<Double> set = new HashSet<>();
		
		// Collections.addAll(Collection, ...): 해당 컬렉션에 여러 데이터를 한번에 추가하는 메서드
		Collections.addAll(list, 1.1, 2.2, 3.3, 4.4, 5.5, 6.6);
		Collections.addAll(set, 1.11, 2.22, 3.33, 4.44, 5.55, 6.66);
		
		System.out.println(list);
		System.out.println(set);
		
		// Collections.copy(dest, src): 불편함 
		//					목적지  원본
		// (Destination 리스트의 size는 source 리스트의 사이즈보다 크거나 같지않으면 에러 발생)
		ArrayList<Double> copied = new ArrayList<>();
		
		Collections.addAll(copied, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1);
		
		Collections.copy(copied, list);
		
		System.out.println("원본: " + list);
		System.out.println("복사본: " + copied);

		copied.set(0, 9.9);
		
		System.out.println("원본: " + list);
		System.out.println("복사본: " + copied);
		
		// Collections.fill(list, item): 해당 리스트의 모든 값을 원하는 값으로 초기화(set은 불가)
		Collections.fill(copied, 7.777);
		System.out.println(copied);
		
		// Collections.frequency(list, item): 리스트에 해당 값이 몇 개 들어있는지 알려준다.(set은 불가)
		List<String> fruits = new ArrayList<>();
		
		Collections.addAll(fruits, "apple", "grape", "banana", "apple", "kiwi");
		Collections.addAll(fruits, "apple", "mango", "banana", "peach", "kiwi");
		
		int a = Collections.frequency(fruits, "apple");
		System.out.printf("apple은 %d번 등장했습니다.\n", a);
		
		// Collections.max(coll): 해당 컬렉션에서 가장 큰 값을 하나 꺼내 반환
		// Collections.min(coll): 해당 컬렉션에서 가장 작은 값을 하나 꺼내 반환
		// (컬렉션을 매개변수로 받기 때문에 set 가능)
		System.out.println(Collections.max(fruits));	// 알파벳이 가장 큰 문자열 반환
		System.out.println(Collections.min(fruits));	// 알파벳이 가장 작은 문자열 반환
		
		List<Card> cardList = new ArrayList<>();	// 블랙잭에서 만들었던 카드 호출
		
		for (int i = 0; i < 13; ++i) {
			cardList.add(new Card(2, i));
		}
		System.out.println(cardList);
		
		// Collections.shuffle(list): 해당 리스트의 요소를 랜덤으로 섞는다.
		Collections.shuffle(cardList);
		System.out.println(cardList);
		
		// Collections.rotate(list, distance): 해당 리스트를 원하는만큼 순환시킨다. 
		// (입력한 distance만큼 옆 인덱스로 이동, 반대로 돌리려면 - 사용)
		for (int i = 0; i < 10; ++i) {
			Collections.rotate(cardList, -2);
			System.out.printf("rotate %d: %s\n", i, cardList);
		}
		
		// Collections.swap(list, i, j): 해당 리스트의 i와 j의 값을 교체
		System.out.println("교체 전: " + cardList);
		Collections.swap(cardList, 0, 5);
		System.out.println("교체 후: " + cardList);
		
		// Collections.replaceAll(list, old, new): 해당 리스트의 모든 값을 교체
		Collections.replaceAll(fruits, "apple", "pineapple");
		System.out.println(fruits);
		
		// Collections.reverse(list): 해당 리스트를 거꾸로 뒤집는다.
		System.out.println("뒤집기 전: " + cardList);
		Collections.reverse(cardList);
		System.out.println("뒤집은 후: " + cardList);
		
		// Collections.sort(list): 해당 리스트를 정렬한다.
		
		// 오름차순 정렬
		Collections.sort(fruits);
		System.out.println(fruits);
		
		// 뒤집으면 내림차순
		Collections.reverse(fruits);
		System.out.println(fruits);
		
		// 카드가 들어있는 컬렉션은 아직 정렬할 수 없다. (정렬 기준이 없기 때문에)
		// Collections.sort(cardList);
	}
}
