package quiz;

public class D08_CheckPhoneNumber {
	/*
	 	사용자로부터 입력받은 문자열이 유효한 핸드폰 번호인지 검사하는 메서드를 만들어보세요
	 */
	
	public static boolean check(String phoneNumber) {
		// 바깥쪽의 공백을 제거
		phoneNumber = phoneNumber.trim();
		
		// 010으로 시작하는 문자열인지 검사
		if (!phoneNumber.startsWith("010")) {
			return false;
		}
		
		// 길이가 11(-가 포함되지 않은 버전) 또는 13(-가 포함된 버전)인가
		int len = phoneNumber.length();
		if (len != 11 && len != 13) {
			return false;
		}
		
		// 길이가 13이라면
		if (len == 13) {
			// -의 위치가 올바른지 확인하고
			if (phoneNumber.charAt(3) != '-' || phoneNumber.charAt(8) != '-') {
				return false;
			}
			// -를 제거한다
			phoneNumber = phoneNumber.replaceAll("-", "");
		}
		
		// 남은 문자열이 모두 숫자인지 확인한다.
		for (int i = 0; i < phoneNumber.length(); ++i) {
			if (!Character.isDigit(phoneNumber.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(check("010-1234-1234"));
		System.out.println(check("010-1234-12345"));
		System.out.println(check("010-1234"));
		System.out.println(check("010-1234#1234"));
		System.out.println(check("010-123--a234"));
		System.out.println(check("01012341234"));
		System.out.println(check("010-asdf-asdf"));
		
	}
}
