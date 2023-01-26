package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class D10_CheckPasswordSolve {
	
	private static String passwordRegex = "(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%])"
			+ "[\\da-zA-Z!@#$%]{8,16}";  

	
	public static boolean isValidPassword2(String userPass) {
		// 정규표현식은 왜 틀렸는지는 알 수 없다.
		return Pattern.matches(passwordRegex, userPass);
	}
	
	public static boolean isValidPassword(String userPass) {
		int len = userPass.length();

		// if else로 비밀번호 검사를 구현하면 무엇때문에 안됐는지 자세히 표현이 가능
		if (len < 8 || len > 16) {
			System.out.println("비밀번호의 길이가 잘못되었습니다. "
					+ "(8 ~ 16자 사이의 길이만 사용 가능)");
			return false;
		}
		
		if (!Pattern.matches("[\\da-zA-Z!@#$%]{8,16}", userPass)) {
			System.out.println("사용하면 안되는 문자를 사용하셨습니다. "
					+ "(소문자, 대문자, 숫자, 특수문자만 사용 가능)");
			return false;
		}
		
		List<Character> mustHave = new ArrayList<>();
		Collections.addAll(mustHave, '!', '@', '#', '$', '%');
		
		boolean digit = false, lower = false, upper = false, special = false;
		
		for (int i = 0; i < len; ++i) {
			char ch = userPass.charAt(i);
			if (Character.isLowerCase(ch)) {
				lower = true;
			} else if (Character.isUpperCase(ch)) {
				upper = true;
			} else if (Character.isDigit(ch)) {
				digit = true;
			} else if (mustHave.contains(ch)) {
				special = true;
			}
		}
		
		if (!digit) {
			System.out.println("숫자 미포함");
			return false;
		} else if (!upper) {
			System.out.println("대문자 미포함");
			return false;
		} else if (!lower) {
			System.out.println("소문자 미포함");
			return false;
		} else if (!special){
			System.out.println("특수문자 미포함");
			return false;
		}
		
			return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String userPass;
			while (true) {
				System.out.print("사용하고 싶은 비밀번호 입력 >> ");
				userPass = sc.nextLine();
				
				if (isValidPassword2(userPass)) {
					break;
				}
			}
			System.out.print("다시 한번 입력 >> ");
			if (userPass.equals(sc.nextLine())) {
				System.out.println("일치합니다!");
				break;
			} else {
				System.out.println("확인한 비밀번호가 일치하지 않습니다. 처음부터 다시합니다.");
			}
					
		}
	}
}
