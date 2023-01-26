package quiz;

import java.util.Arrays;

public class C01_MethodQuiz {
	/*
	 	# 다음 메서드를 정의하고 올바르게 동작하는지 테스트 해보세요
	 	
	 	 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 	 
	 	 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 	 
	 	 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	 	 
	 	 4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	 	 
	 	 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 */
	
	// 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean alphabet(char ch) {
		// true일 때 true, false일 때 false 출력할 것이므로 if문 사용할 필요 없다.
		return (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z');
	}
	
	// 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean triple(int num) {
		
		return num % 3 == 0;
	}
	
	// 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	public static String evenOdd(int num) {
		// 삼항연산자로 간단한 if문 한줄에 출력 가능
		//						  true :	false;
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
		
//		if (c % 2 == 0) {
//			return "짝수입니다";			
//		} else {
//			return "홀수입니다";
//		}
	}
	
	// 4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	public static int[] divisor(int num) {
		int cnt = 0;
		for (int i = 1; i <= num; ++i) {
			if (num % i == 0) {
				++cnt;
			}
		}
		int[] divisor = new int[cnt];
		
		cnt = 0;
		for (int i = 1; i <= num; ++i) {
			if (num % i == 0) {
				divisor[cnt++] = i;
			}
		}
		
		return divisor;
	}
	
	// 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	public static boolean prime(int num) {
		
		for (int i = 2; i < Math.sqrt(num); ++i) {
			if (num % i == 0) {
				return false;			
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		boolean english = alphabet('가');
		System.out.println(english);
		
		System.out.println(alphabet('a')); 
		System.out.println(triple(369));
		System.out.println(evenOdd(2));
		System.out.println(Arrays.toString(divisor(13)));
		System.out.println(prime(12));
		
		// boolean 타입을 리턴하는 메서드는 조건으로 사용할 수 있다.
		if (prime(13)) {
			System.out.println("소수일 때 도착하는 곳");
		} else {
			System.out.println("소수가 아닐 때 도착하는 곳");			
		}
	
		
	}
}
