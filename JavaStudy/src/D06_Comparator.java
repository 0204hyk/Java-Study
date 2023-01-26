import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import myobj.Peach;
import myobj.PeachPriceComparator;
import myobj.PeachSweetComparator;

public class D06_Comparator {
	/*
	 	# Comparable 인터페이스
	 	
	 	 - 이 인터페이스를 구현한 클래스는 크기 비교가 가능해진다.
	 	 - 크기 비교가 정렬의 기준이 된다. (정렬이 가능해진다.)
	 	
	 	# Comparator 인터페이스
	 	
	 	 - 이 인터페이스를 구현한 클래스는 크기 비교의 기준이 된다.
	 	 - 해당 클래스의 인스턴스를 정렬 기준으로 전달할 수 있다.
	 */
	public static void main(String[] args) {
		// 일반적인 List 정렬
		List<Integer> nums = new ArrayList<>();
		
		Collections.addAll(nums, 33, 1, 9, 17, 100, 5, 24, 88);
		
		System.out.println(nums);
		Collections.sort(nums);
		System.out.println(nums);
		
		// 복숭아는 아직 크기 비교가 구현되지 않았기 때문에 정렬을 할 수 없다.
		List<Peach> peachs = new ArrayList<>();
		
		for (int i = 0; i < 10; ++i) {
			peachs.add(new Peach());
		}
		System.out.println(peachs);
		
		// 복숭아를 등급 기준으로 크기 비교가 가능한 객체로 만든 후 정렬이 가능해졌다.
		Collections.sort(peachs);
		System.out.println(peachs);
		
//		Peach standard = new Peach(); 
//		for (Peach p : peachs) {
//			System.out.printf("%s vs %s : %d\n", standard, p, standard.compareTo(p));
//		}
		
		// 복숭아에 내장된 compareTo 대신 다른 Comparator를 사용할 수 있다.
		Collections.sort(peachs, new PeachSweetComparator());
		System.out.println(peachs);
		
	}
}
