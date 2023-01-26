package quiz;

import java.util.ArrayList;

public class D01_ArrayListPractice2 {
	
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
		
		for (int i = 0; i < 100; ++i) {
			list.add((int)(Math.random() * 1001 + 4000)); 
		}
		
		// 얕은 복사 (shallow copy) - 주소를 복사해준다. 값이 변하면 원본도 변함
		// ArrayList<Integer> oddList = list;
		
		// 깊은 복사 (deep copy) - 값을 복사해 똑같은 인스턴스를 하나 더 만든다.
		// ArrayList<Integer> oddList = new ArrayList<>();
		// oddList.addAll(list);
		
		// 깊은 복사는 clone으로 가능.
		// clone은 기본적으로 Object타입으로 반환하기 때문에 타입을 변경해주어야함
		ArrayList<Integer> oddList = (ArrayList<Integer>)list.clone();
		
		for (int i = 0; i < oddList.size(); ++i) {
			if (oddList.get(i) % 2 == 0) {
//				oddList.remove(i);
//				--i;
				oddList.remove(i--);
			}
		}
		
		System.out.println("원본 리스트: " + list);
		System.out.println("홀수들만 남아있는 리스트: " + oddList);
	}
}
