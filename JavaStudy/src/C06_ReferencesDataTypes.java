import java.util.Scanner;

import myobj.Apple;

public class C06_ReferencesDataTypes {
	/*
	 	# 기본형 변수 타입
	 	 
	 	 - int, boolean, float, double 등 소문자로 시작하는 타입들
	 	 - 해당 타입 변수에는 .을 찍어 사용할 수 없다.
	 	   (.은 그 주소를 따라가서 참조하겠다는 뜻이다.)
	 	
	 	# 참조형 변수 타입
	 	 
	 	 - 우리가 만든 모든 클래스들
	 	 - String
	 	 - 배열
	 	
	 */
	
	// 클래스도 타입이기 때문에 매개변수로 활용할 수 있다.
	static void appleTest(Apple apple) {
		apple.info();
	}
	
	public static void main(String[] args) {
		String str = "Hello";
		int[] nums = {1, 2, 3, 4};
		
		// 클래스도 타입이다
		Scanner sc = new Scanner(System.in);
		Apple myApple = new Apple(10, 11, "Test Apple");
		
		// 사과 타입을 매개변수로 가진 메서드에 사과 타입 인스턴스를 전달
		appleTest(myApple);
		appleTest(new Apple(8, 8, "New Apple"));
	}
}
