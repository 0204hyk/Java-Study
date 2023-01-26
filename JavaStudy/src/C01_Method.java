
public class C01_Method {
	/*
	 	# 함수 (Function)
	 	
	 	 - 기능을 미리 정의해두고 나중에 가져다 쓰는 것
	 	 - 함수를 정의한 시점에서는 실행되지 않고 나중에 호출했을 때 실행된다.
	 	 - 미리 정의된 함수 이름 뒤에 ()를 붙여 해당 함수를 호출한다.
	 	 - 나중에 재사용 할 가능성이 있는 기능들을 함수로 만들어두면 작업의 반복을 줄일 수 있다.
	 	 - 자바에서 함수는 반드시 클래스 내부에 선언해야 한다.
	 	 - 클래스 내부에 선언된 함수는 메서드(method)라고 부른다.
	 	 
	 	# 함수의 선언
	 	
	 	 public static 리턴타입 함수이름(매개변수) {
	 	 	함수의 내용
	 	 	return;
	 	 }
	 	
	 	 - public static : 뭔지 모르겠지만 일단 써야하는 것
	 	 - 리턴 타입 : 함수가 실행되고 나면 호출한 곳에 돌려줘야하는 값의 타입
	 	 - 함수 이름 : 나중에 호출할 때 사용하고 싶은 이름.
	 	 - return; : 해당 함수를 끝마치면서 값을 호출한 곳에 돌려준다.
	 	 
	 	# 함수의 리턴 (return)
	 	
	 	 - 해당 함수가 반환하는 값의 타입을 지정할 수 있다.
	 	 - 함수를 호출했을 때 호출한 곳에 함수의 실행 결과가 반환된다.
	 	 - 함수 내부에서 return을 만나면 해당 함수를 즉시 종료한다.
	 	 - 리턴 타입 void인 함수는 값을 반환하지 않는다.
	 	 
	 	# 함수의 매개변수 (argument)
	 	
	 	 - 함수를 호출할 때 ()에 전달하는 값을 '인자'라고 한다
	 	 - 함수를 정의할 때 ()에 선언하는 인자를 받을 수 있는 변수를 '매개변수'라고 한다.
	 	 - 매개변수의 개수에는 제한이 없다.
	 	 - 매개변수에 ...을 찍으면 여러개의 해당 타입 값을 배열로 받을 수 있다.
	 	 - ...은 반드시 마지막 매개변수에 사용해야 한다.
	 	  
	 */
	public static void test (int a, String... msgs) {
		System.out.println("a: " + a);
		
		for (int i = 0; i < msgs.length; ++i) {
			System.out.printf("%d: %s\n", i, msgs[i]);
		}
	}
	
	
	public static void printRabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(   >$");		
	}
	
	public static String repeat(int time, String message) {
		String str = "";
		for (int i = 0; i < time; ++i) {
			str += message;
		}
		return str;
	}
							// 매개 변수
	public static int plus(int a, int b) {
		int num = a + b;
		return num;
//		return 123;  --> 이렇게 해도 실행가능, 값은 항상 123으로 나옴
	}
	 
	// void : "이 함수는 호출해도 리턴이 없습니다" 라는 뜻
	public static void print(String str) {
		System.out.print(str);
	}
	
	public static void main(String[] args) {
		// 리턴 타입이 void인 함수는 호출해도 값이 돌아오지 않는다.
		// int a = print("123\n");
		
		// 리턴 타입이 있는 함수는 해당 타입의 값을 반드시 리턴한다.
				  // 인자
		int b = plus(1,2);
		String str = repeat(3, "L");
		
		System.out.println(repeat(5, "hello! "));
		System.out.println(repeat(10, "bye! "));
		
		// ... 매개변수에는 값을 원하는만큼 보낼 수 있다.
		test(1, "abc", "abc", "abc");
		test(2, "abc");
		test(3, "lion", "lion", "tiger", "monkey", "lion");
		
	}
		
}
