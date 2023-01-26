package quiz;

public class B02_ConditionQuiz {
	
	public static void main(String[] args) {
		int a, b, c, d, e, year;
		
		// 1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		a = 16;
		
		boolean result1 = a > 10 && a < 20;
		
		System.out.println("1번 결과 : " + result1);
		
		// 2. int형 변수 b가 짝수일 때 true
		b = 20;
		
		boolean result2 = b % 2 == 0;
		
		System.out.println("2번 결과 : " + result2);
		
		// 3. int형 변수 c가 7의 배수일 때 true
		c = 49;
		
		boolean result3 = c % 7 == 0;
		
		System.out.println("3번 결과 : " + result3);
		
		// 4. int형 변수 d와 e의 차이가 30일 때 true
		d = 90; 
		e = 120;
		
		boolean result4 = d - e == 30 || e - d == 30;
		boolean result44 = d - e == 30 || d - e == -30;
		boolean result444 = Math.abs(d - e) == 30;
		
		System.out.println("4번 결과 : " + result4);
		System.out.println("4번 결과 : " + result44);
		System.out.println("4번 결과 : " + result444);
		
		// 5. int형 변수 year가 400으로 나누어 떨어지거나
 	 	//    또는 4로 나누어 떨어지고 100으로 나누어 떨어지지 않을 때 true
		//	  => 2월이 하루 더 있나 없나를 알 수 있는 공식 (윤년) 
		year = 2020;
		
		boolean result5 = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
				
		System.out.printf("%d년에는 2월이 하루 더 있나요? %s\n", year, result5);
		
		// 6. boolean형 변수 powerOn이 false일 때 true
		boolean powerOn = false;
		
		System.out.printf("지금 전원이 꺼져 있나요? %s\n", !powerOn);
		
		// 7. 문자열 참조변수 str이 "yes"일 때 true
		String str = "yes";
		System.out.println(str.equals("yes"));		
		
		// 기본형 변수 : 데이터를 차곡차곡 쌓는 곳에 용량을 확보하고 거기에 값을 저장한다.
		// 참조형 변수 : 데이터의 길이가 어떻게 될지 모르기 때문에 
		//            데이터를 차곡차곡 쌓는 곳에 넣으면 비효율적이다.
		//            스택에는 실제 데이터의 주소(메모리상의 위치)를 저장하고 
		//            실제 데이터는 데이터를 유동적으로 저장하는 곳(힙)에 저장한다.
		String str1 = "yes"; // str1, str2 다른 개체지만 저장된 주소가 같음
		String str2 = "yes";
		String str3 = new String("yes"); // str3 주소가 다름
		
		// * 참조형 변수끼리 ==을 통해 비교하면 실제 내용이 아닌 주소값끼리 비교한다.
		System.out.println(str1 == str2); // true
		System.out.println(str1 == str3); // false
		
		// * 참조형 변수의 실제 내용을 통해 비교하기 위해서는 equals() 메서드를 사용해야한다.
		System.out.println(str1.equals(str3)); // true
		System.out.println(str2.equals(str3)); // true
	}

}
