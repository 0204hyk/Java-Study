package quiz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_CheckPassword {
	/*
	 	사용자가 사용하고 싶은 비밀번호를 입력하면 사용할 수 있는 비밀번호인지 체크한 후
	 	한번 더 동일하게 입력하도록 만들어보세요
	 	(사용할 수 있는 비밀번호의 조건 - 아무 유명 사이트 회원가입)
	 
		네이버 비밀번호 조건
		- 8~16자 영문 대/소문자, 숫자, 특수문자만 사용 가능합니다.
		- 사용 가능한 특수문자 33자: ! " # $ % & ' ( ) * + , - . / : ; ? @ [ ＼ ] ^ _ ` { | } ~ \
	 */
	
	public static String rule = "[\\w!\"#$%&'()*+,-\\./:;?@\\[＼\\]^`{|}~\\\\]{8,16}";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("사용할 비밀번호 입력 >> ");
			String password = sc.nextLine();
			
			if (Pattern.matches(rule, password)) {
				System.out.println("사용할 수 있는 암호 입니다.");
				while(true) {
					System.out.print("비밀번호 재입력 >> ");
					String password2 = sc.nextLine();
					if (password.equals(password2)) {
						System.out.println("비밀번호 생성 완료");
						break;
					} else {
						System.out.println("비밀번호를 잘못 입력했습니다.");
					}												
				}
				break;
			} else {
				if (password.length() < 8 || password.length() > 16) {
					System.out.println("8 ~ 16자 사이의 비밀번호를 입력하세요");
				} else {
					System.out.println("사용할 수 없는 문자가 포함되어 있습니다.");
				}
			}
		}

	}
}
