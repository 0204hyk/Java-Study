import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import myobj.Peach;
import myobj.PeachPriceComparator;

public class D06_ComparatorPractice {
	public static void main(String[] args) {
		List<Peach> peachs = new ArrayList<>();
		
		for (int i = 0; i < 10; ++i) {
			peachs.add(new Peach());
		}
		
		// 연습1 : 복숭아에 가격을 추가하고 가격 기준으로 오름차순 정렬해보세요
		System.out.println("연습1");
		Collections.sort(peachs, new PeachPriceComparator());
		System.out.println(peachs);
		System.out.println("=====================================");
		
		// 연습2 : 가격이 같은 경우 당도 기준으로 내림차순 정렬해보세요 
		System.out.println("연습2");
		Collections.sort(peachs, new Comparator<Peach>() {
			@Override
			public int compare(Peach o1, Peach o2) {
				int result = o1.getPrice() - o2.getPrice();
				
				if (result == 0) {
					// 내림차순을 하고 싶을 경우 -1을 곱하거나, o1과 o2의 위치를 바꾸면 된다.
					return Double.compare(o1.getSweet(), o2.getSweet()) * -1;
				} else {
					return result;
				}
				
//				if (result == 0) {
//					if (o1.getSweet() > o2.getSweet()) {
//						return -1;
//					} else if (o1.getSweet() < o2.getSweet()) {
//						return 1;
//					} else {
//						return 0;
//					}
//				} else {
//					return result;	
//				}
			}
		});
		System.out.println(peachs);
		System.out.println("=====================================");
		
		// 심화문제 : 원산지의 영어 이름을 추가하고 원산지의 이름 기준으로 오름차순 정렬해보세요
		
		// Srting 클래스는 이미 Comparable 인터페이스가 구현되어 있음
		Collections.sort(peachs, new Comparator<Peach>() {
			@Override
			public int compare(Peach o1, Peach o2) {
				// 오름차순
				return o1.getCountryName().compareTo(o2.getCountryName());
				// 내림차순
//				return o2.getCountryName().compareTo(o1.getCountryName());
//				return o1.getCountryName().compareTo(o2.getCountryName()) * -1;
			}
		});
		System.out.println(peachs);
		
		
		
	}
}
