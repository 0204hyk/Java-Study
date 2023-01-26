package quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class D01_ArrayListPractice {
	
	/*
	 	1. ArraysList에 4000 ~ 5000의 랜덤 정수를 100개 추가한다.
	 	
	 	2. 모든 숫자의 총합과 평균을 구한다.
	 	
	 	3. 원본에서 짝수를 모두 제거한 후 총합을 구한다.
	 	
	 	4. 원본에서 홀수를 모두 제거한 후 총합을 구한다.
	 	
	 	5. 10번째 홀수를 구한다.
	 	
	 	※ 제네릭에는 기본형 타입은 사용할 수 없다. (int를 Integer로 써야함)
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		// 1. ArraysList에 4000 ~ 5000의 랜덤 정수를 100개 추가한다.
		for (int i = 0; i < 100; ++i) {
			list.add((int)(Math.random() * 1001 + 4000)); 
		}
		
		System.out.println(list);
		
		// 2. 모든 숫자의 총합과 평균을 구한다.
		int sum = 0;
		for (int i = 0; i < list.size(); ++i) {
			sum += list.get(i);
		}
		
		System.out.println("총합: " + sum);
		System.out.println("평균: " + sum / (double)list.size());
		
		// 3. 원본에서 짝수를 모두 제거한 후 총합을 구한다.
		// 4. 원본에서 홀수를 모두 제거한 후 총합을 구한다.
		// 3번, 4번 문제 제거 하지 않고 푸는 경우

		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> odds = new ArrayList<>();
		
		for (int i = 0; i < list.size(); ++i) {
			int num = list.get(i);
			
			if (num % 2 == 0) {
				evens.add(list.get(i));
			} else {
				odds.add(list.get(i));
			}
		}

		int evenSum = 0;
		for (int i = 0; i < evens.size(); ++i) {
			evenSum += evens.get(i);
		}
		int oddSum = 0;
		for (int i = 0; i < odds.size(); ++i) {
			oddSum += odds.get(i);
		}

		System.out.println(evens);
		System.out.println("짝수합: " + evenSum);
		System.out.println(odds);
		System.out.println("홀수합: " + oddSum);
		
		// 5. 10번째 홀수를 구한다.
		System.out.println("10번째 홀수: " + odds.get(9));
	}
}
