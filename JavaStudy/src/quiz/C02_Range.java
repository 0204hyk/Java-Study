package quiz;

import java.util.Arrays;
import java.util.Iterator;

public class C02_Range {
	/*
	 	1. 최대값을 인자(매개변수)로 전달하면 
	 	   0부터 최대값 미만의 int[]을 생성하여 반환하는 range 메서드를 만들어보세요
	 	   ex > range(8)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7]
	 	
	 	2. 최소값과 최대값을 인자로 전달하면 
	 	   최소값부터 최대값 미만의 int[]을 생성하여 반환하는 range 메서드를 만들어보세요
	 	   ex > range(10, 15)의 결과 -> [10, 11, 12, 13, 14]
	 	   ex > range(15, 10)의 결과 -> [15, 14, 13, 12, 11]
	 	   
	 	3. 최소값 최대값 증가값을 인자로 전달하면 
	 	   최소값부터 최대값 미만까지 증가값만큼 증가하는 int[]을 반환하는 range 메서드를 만들어보세요
	 	   ex > range(30, 40, 2) -> [30, 32, 34, 36, 38]
	 	   ex > range(50, 40, -3) -> [50, 47, 44, 41]
	 	   ex > range(50, 40, 5) -> []
	 	
	 */
	
	// 1번 문제
	public static int[] range(int max) {
	
		int[] range1 = new int[max];
		
		for (int i = 0; i < max; ++i) {
			range1[i] = i;
		}
		
		return range1;
	}
	
	// 1번 다른 풀이
	// 2번문제 다른 풀이에서 만든 함수 이용
	public static int[] range2(int num) {
		return range2(0, num);
	}
	

	// 2번 문제
	public static int[] range(int min, int max) {
		int cnt = 0;
		if (min < max) {
			for (int i = min; i < max; ++i) {
				cnt++;
			}
		} else {
			for (int i = min; i > max; --i) {
				cnt++;
			}
		}
		int[] range2 = new int[cnt];
		
		
		cnt = 0;
		
		if (min < max) {
			for (int i = min; i < max; ++i) {
				range2[cnt++] = i;
			}			
		} else {
			for (int i = min; i > max; --i) {
				range2[cnt++] = i;
			}
		}
		
		return range2;
	}
	// 2번 문제 다른 풀이
	// 3번 문제에서 만든 함수를 사용
	public static int[] range2(int begin, int end) {
		return begin == end ? null :
			begin < end ? range(begin, end, 1) : range(begin, end, -1);
	}
	
	
	// 3번문제
	public static int[] range(int begin, int end, int inc) {
		int diff = end - begin;

		// inc가 0인 경우 증가값이 0이라 이상하므로 함수를 종료해버림
		if (inc == 0) {
			return null;
		}
		
		// 길이 계산 (요소의 개수 계산) 
		int len = diff / inc;
		
		
		// 길이 계산이 음수가 나오면 뭔가 이상하다는 뜻이므로 함수를 종료해버림
		if (len <= 0) {
			return null;
		}
		
		// 음수가 아닐 때 나누어 떨어지면 range3[len], 떨어지지않으면 range3[len + 1]
		// ex > 2, 4 = range3은 [0, 2]    --> 2개
		//		2, 5 = range3은 [0, 2, 4] --> 3개
		len = diff % inc == 0 ? len : len + 1;
		
		int[] range3 = new int[len];
		
		for (int i = 0; i < len; ++i) {
			range3[i] = begin + i * inc;
		}
		
		return range3;
	}
	
	
	public static void main(String[] args) {
		System.out.println("1번 문제 : " + Arrays.toString(range(8)));
		System.out.println("2번 문제1 : " + Arrays.toString(range(10, 15)));
		System.out.println("2번 문제2 : " + Arrays.toString(range(15, 10)));
		System.out.println("3번 문제1 : " + Arrays.toString(range(30, 40, 2)));
		System.out.println("3번 문제2 : " + Arrays.toString(range(50, 40, -3)));
		System.out.println("3번 문제3 : " + Arrays.toString(range(50, 40, 5)));
		System.out.println("3번 문제4 : " + Arrays.toString(range(10, 30, 3)));
		System.out.println("3번 문제5 : " + Arrays.toString(range(30, 10, -2)));
		
		
		System.out.println("2번 다른 풀이 : " + Arrays.toString(range2(8, 15)));
		System.out.println("2번 다른 풀이 : " + Arrays.toString(range2(15, 8)));
		
	}
}
