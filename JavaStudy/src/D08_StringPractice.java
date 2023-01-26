import java.util.ArrayList;
import java.util.List;

public class D08_StringPractice {
	public static void main(String[] args) {
		// 연습문제 : 문자열 fruits에서 모든 "apple"의 인덱스를 찾아 리스트에 저장해보기.
		String fruits = "apple/banana/kiwi/greenapple/mango/orange/pineapple/grape/melon";
		
		for (int i = 0; i < 10; ++i) {
			fruits += fruits;
		}
		System.out.println(fruits.length());
		
		// 내 풀이
		List<Integer> count = new ArrayList<>();
		
		for (int i = 0; i < fruits.length(); ++i) {
						
			if (fruits.indexOf("apple", i) >= 0 &&
					fruits.indexOf("apple", i) != fruits.indexOf("apple", i + 1)) {
				count.add(fruits.indexOf("apple", i));
			}
		}
		System.out.println(count);		
		
		// 강사님 풀이
		List<Integer> indexs = new ArrayList<>();
		String word = "apple";
		int len = word.length();
		int found = 0;
		//			   i != -1		
		for (int i = 0; true; i = found + len) {
			found = fruits.indexOf(word, i);
			if (found == -1) {
				break;
			} else {
				System.out.printf("%d에서 \"apple\"발견!\n", found);	
				indexs.add(found);
			}
		}
		
	}
}
