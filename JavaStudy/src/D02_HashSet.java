import java.util.ArrayList;
import java.util.HashSet;

public class D02_HashSet {
	/*
	 	# Set
	 	
	 	 - 집합을 구현해 놓은 클래스
	 	 - 요소로 같은 값이 들어오는 것을 허용하지 않는다. (중복값 X)
	 	 
	 	# Hash
	 	
	 	 - 같은 값을 넣으면 항상 일정한 값이 나와야 하는 단방향성 알고리즘
	 	 - 결과 값을 통해 원래 값을 유추할 수 없어야 한다.
	 	 - 중복 체크 및 데이터 위조/변조 체크에 주로 사용한다.
	 	 - 주로 특정 데이터의 고유 번호로 활용하기도 한다.
	 	 - Hash의 결과는 규칙적이지 않기 때문에 Hash로 만들어진 알고리즘은 순서를 알 수 없다. 
	 	   (인덱스가 없다. get 사용불가.)
	 	 - 인덱스가 없기때문에 하나의 값을 꺼내서 보기 위해서는 for each문을 사용해야한다.
	 	 
	 	   "ABC" ->		ba1274dfd61...
	 	   "ABC" ->		ba1274dfd61...
	 	   "ABC1" ->	88dfd123124...
	 	   
	 */
	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<>();
		
		System.out.println("Hello everyone my name is sausage".hashCode());
		System.out.println("Hello everyone. my name is sausage".hashCode());
		System.out.println("apple".hashCode());
		System.out.println("apple1".hashCode());
		
		// set.add(item): 데이터를 추가한다 (중복은 알아서 제거됨)
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("mango");
		fruits.add("grape");
		fruits.add("grape");
		fruits.add("grape");
		
		System.out.println(fruits);
		
		//for each: 배열, 리스트, 집합 등에서 요소를 하나씩 꺼내며 반복하는 문법
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		String[] animals = {"lion", "tiger", "bear", "dolphin"};
		
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		// set.contains(item)
		System.out.println("수박 있니? " + fruits.contains("수박"));
		
		//set.remove(item)
		System.out.println("삭제 성공? " + fruits.remove("apple"));
		
		// set.remaveAll(Collection): 포함된 모든 내용 삭제
		HashSet<String> toRemove = new HashSet<>();
		
		toRemove.add("watermelon");
		toRemove.add("peach");
		toRemove.add("grape");
		
		System.out.println("포함된 모든 내용 삭제 성공? " + fruits.removeAll(toRemove));
		
		// Set도 Collection이기 때문에 다른 Collection으로의 변환이 자유롭다.
		ArrayList<String> fruitList = new ArrayList<>(fruits);
		
		System.out.println(fruitList);
		System.out.println(fruitList.get(1));
	}
}
