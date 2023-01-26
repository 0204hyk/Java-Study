package quiz;

import javax.lang.model.SourceVersion;

public class D04_IsJavaVar {
	
	/*
	 	 문자열을 매개변수로 전달하면 해당 문자열을 
	 	 자바 변수로 사용할 수 있는 문자열인지 검사해주는 메서드를 만들어보세요
	 */
	
	public static boolean isJavaVar(String word) {
		
		if (SourceVersion.isKeyword(word)) {
			System.out.print("예약어는 변수로 사용할 수 없습니다.");
			return false;
		}
		
		if(!Character.isJavaIdentifierStart(word.charAt(0))) {
			System.out.printf("[%s]의 첫 번째 글자가 자바 변수에 사용할 수 없는 문자입니다.", word);
			return false;
		}
		
		for (int i = 1; i < word.length(); ++i) {
			if (!Character.isJavaIdentifierPart(word.charAt(i))) {
				System.out.printf("[%s]의 %d 번째 글자가 자바 변수에 사용할 수 없는 문자입니다."
						, word, i + 1);
				return false;
			}
		}
		
		return true;
	}
		
	public static boolean canUse(String varName) {
		
		if (Character.isJavaIdentifierStart(varName.charAt(0)) == true) {
			for (int i = 1; i < varName.length(); ++i) {
				if (!Character.isJavaIdentifierPart(varName.charAt(i))) {
					return false;
				}
			}
		} else {
			return false;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(canUse("ABC2"));
		System.out.println(canUse("2ABC"));
		System.out.println(canUse("$A$B$C$"));
		System.out.println(canUse("int"));
		
		System.out.println(isJavaVar("sevenEleven"));
		System.out.println(isJavaVar("se^venEleven"));
		System.out.println(isJavaVar("7Eleven"));
		System.out.println(isJavaVar("public"));
		System.out.println(isJavaVar("void"));
		System.out.println(isJavaVar("int"));
		
		// 입력한 문자열을 변수로 사용할 수 있는지 판단해주는 문법
		System.out.println(SourceVersion.isIdentifier("apple123"));
		System.out.println(SourceVersion.isIdentifier("apple 23"));
		System.out.println(SourceVersion.isIdentifier("1apple"));
	}
}
