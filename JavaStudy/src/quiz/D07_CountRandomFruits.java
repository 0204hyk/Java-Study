package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class D07_CountRandomFruits {
	/*
	 	리스트에 String 타입 랜덤 과일 이름을 300개 추가하고 각 과일이 몇 번 등장했는지 세어보세요
	 	(apple, banana, kiwi, orange, grape, peach, pineapple)
	 */
	public static void main(String[] args) {
		List<String> fruitList = new ArrayList<>();
		String[] fruitNames = {"apple", "banana", "kiwi", "orange", "grape", "peach", "pineapple"}; 
		
		for (int i = 0; i < 300; ++i) {
			fruitList.add(fruitNames[(int)(Math.random() * fruitNames.length)]);
		}
		System.out.println(fruitList);
		System.out.println("과일 수 : " + fruitList.size());
		
		// HashMap 사용X (300개를 7번 반복하기 때문에 비효율적)
//		for (int i = 0; i < fruitNames.length; ++i) {
//			System.out.printf("%s's count : %d\n", 
//					fruitNames[i], Collections.frequency(fruitList, fruitNames[i]));
//		}
		
		// HashMap (사용 300개를 7번 반복하기 때문에 비효율적)
//		HashMap<String, Integer> fruitCount = new HashMap<>();
//		
//		for (int i = 0; i < fruitNames.length; ++i) {
//			fruitCount.put(fruitNames[i], Collections.frequency(fruitList, fruitNames[i]));			
//		}
//		
//		System.out.println(fruitCount);

		
		// HashMap 사용X (한번만 반복)
		int[] count = new int[fruitNames.length];
		
		for (int i = 0; i < fruitList.size(); ++i) {
			String fruit = fruitList.get(i);
			if (fruit.equals("apple")) {
				count[0] += 1;
			} else if (fruit.equals("banana")) {
				count[1] += 1;
			} else if (fruit.equals("kiwi")) {
				count[2] += 1;
			} else if (fruit.equals("orange")) {
				count[3] += 1;
			} else if (fruit.equals("grape")) {
				count[4] += 1;
			} else if (fruit.equals("peach")) {
				count[5] +=1;
			} else {
				count[6] +=1;
			}
		}
		for (int i = 0; i < fruitNames.length; ++i) {
			System.out.printf("%s=%d, ", fruitNames[i], count[i]);
		}
		System.out.println();

		
		// HashMap 사용 (한번만 반복)
		HashMap<String, Integer> fruitCount = new HashMap<>();
		
		for (String fruit : fruitList) {
			// 새로운 과일이 등장했을 때는 1을 넣고 null을 리턴한다
			// 이미 값이 들어가 있을 때는 값을 꺼낸다
			Integer cnt = fruitCount.putIfAbsent(fruit, 1);
			
			// 이미 cnt를 세고 있는 과일이라면 1 증가시킨다
			if (cnt != null) {
				fruitCount.put(fruit, cnt + 1);
			}
		}
		System.out.println(fruitCount);
		
	}
	
}
