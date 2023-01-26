package quiz;

import java.util.Scanner;

public class E06_Factorial {
	/*
	 	사용자가 정수를 입력하면 해당 정수의 !를 구하는 메서드를 정의해보세요
	 	
	 	10! -> 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
	 */
	
	// 재귀함수 예시 (탈출 조건이 없으면 무한히 반복, StackOverflowError 발생)
	public static int test(int num) throws Exception{
		if (num == -200) {
			throw new Exception("이제 그만");
		}
		System.out.println("test: " + num);
		return test(num - 1);
	}
	
	// 자기 자신을 호출하는 재귀함수 방식 (recursive, 성능 안 좋음)
	public static int factorial2(int num) {
		if (num == 1) {
			return 1;
		}
		return num * factorial2(num - 1);
	}
	
	public static int factorial(int num) {
		int result = 1;
		
		for (int i = num; i > 0; --i) {
			result *= i;
		} 
		System.out.printf("%d!: %d\n", num ,result);
		return result;
	}
	
	public static void main(String[] args) {
		factorial(5);
		
		System.out.println(factorial2(5));
		
		try {
			test(5);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
