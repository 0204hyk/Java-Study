import java.awt.print.Printable;

public class D04_WrapperClass {
	/*
	 	# Wrapper Class
	 	
	 	 - 각 기본형 타입에 대응하는 참조형 타입
	 	 -  
	 	 - 각 타입에 유용한 기능들이 해당 클래스에 정의되어 있다.
	 	 
	 	# 기본형
	 	 - int, char, byte, short, long, float, double, boolean
	 	 
	 	# 참조형
	 	 - Integer, Character, Byte, Short, Long, Float, Double, Boolean
	 */
	public static void main(String[] args) {
		/*
		 	# Parsing
		 	
		 	 - 문자열을 해당 타입으로 변환하는 것
		 	 - 각 타입 클래스마다 해당 메서드가 있음 (Character는 한글자만 추출하기 때문에 의미가 없어서 따로 없다.)
		 */
		// 문자열을 숫자 값으로 변환
		int value = Integer.parseInt("12345");
		System.out.printf("%d\n", value);
		
		// 원하는 진법으로 숫자 값을 추출하는 오버로딩
		value = Integer.parseInt("AF1234", 16); // 16진수로 출력
		System.out.printf("%d\n", value);
		
		// 문자열의 원하는 부분을 숫자로 추출하는 오버로딩
		// 8번 인덱스 ~ 12번 인덱스까지 10진수로 출력
		value = Integer.parseInt("Hello!! 12345 Good!", 8, 13, 10); 
		System.out.printf("%d\n", value);
		
		float fvalue = Float.parseFloat("123.1234");
		System.out.println(fvalue);
		
		boolean boolvalue = Boolean.parseBoolean("TrUE");
		System.out.println(boolvalue);
		
		/*
		 	# toString
		 	
		 	 - 각 타입 값을 문자열로 변환하는 기능
		 	 - 정수 값을 원하는 진법의 문자열로 쉽게 변환할 수 있다.
		 */
		String strValue = Integer.toString(12345, 2);
		System.out.println(strValue);
		
		strValue = Boolean.toString(false);
		System.out.println(strValue);
		
		// 각 타입에 대한 상수들
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE + "bits");
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Character.SIZE + "bits");
		
		// Character 타입의 유용한 기능들
		System.out.println("is 글자? " + Character.isAlphabetic('a'));
		System.out.println("is 글자? " + Character.isAlphabetic('한'));
		System.out.println("is 글자? " + Character.isAlphabetic('3'));
		System.out.println("is 글자? " + Character.isAlphabetic('$'));
		
		// 대소문자
		System.out.println("is 대문자? " + Character.isUpperCase('A'));
		System.out.println("is 소문자? " + Character.isLowerCase('A'));
		System.out.println("해당 문자의 타입: " + Character.getType('_'));
		
		// 공백
		System.out.println("공백이니? " + Character.isWhitespace(' '));
		System.out.println("공백이니? " + Character.isWhitespace('\t'));
		System.out.println("공백이니? " + Character.isWhitespace('\n'));
		
		// 숫자 구분
		System.out.println("숫자니? " + Character.isDigit('2'));
		System.out.println("숫자니? " + Character.isDigit('가'));
		
		// 자바의 변수명 첫번째 글자로 사용할 수 있는가
		System.out.println(Character.isJavaIdentifierStart('#'));
		System.out.println(Character.isJavaIdentifierStart('$'));
		System.out.println(Character.isJavaIdentifierStart('_'));
		System.out.println(Character.isJavaIdentifierStart('7'));
	}
}
