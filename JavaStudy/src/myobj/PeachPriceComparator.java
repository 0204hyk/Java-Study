package myobj;

import java.util.Comparator;
// 제네릭 Peach로 지정해두면 compare 오버라이드 할때 매개변수 자동으로 Peach로 받음														
public class PeachPriceComparator implements Comparator<Peach> {
	
	@Override
	public int compare(Peach o1, Peach o2) {
		return o1.price - o2.price;

		// 가격 기준으로 오름차순 정렬하고, 가격이 같은 경우 당도 기준 내림차순 정렬
//		if (o1.price == o2.price) {
//			if (o1.sweet > o2.sweet) {
//				return -1;
//			}
//		}
//		
//		if (o1.price > o2.price) {
//			return 1;
//		} else if (o1.price < o2.price) {
//			return -1;
//		} else {
//			return 0;			
//		}
	}
}
