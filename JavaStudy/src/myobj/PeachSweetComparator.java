package myobj;

import java.util.Collections;
import java.util.Comparator;

// 복숭아 분류기 (당도를 기준으로)
public class PeachSweetComparator implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		// return 1  : 왼 쪽이 더 크다.
		// return 0  : 두 인스턴스의 크기가 같다.
		// return -1 : 오른쪽이 더 크다.
		
		Peach p1 = (Peach)o1;
		Peach p2 = (Peach)o2;
		
		// 당도가 높은 순으로 가져오기 위해 내림차순 정렬
		if (p1.sweet >  p2.sweet) {
			return -1;
		} else if (p1.sweet < p2.sweet) {
			return 1;
		} else {
			return 0;			
		}
	}
}
