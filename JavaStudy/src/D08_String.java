import java.util.Arrays;

public class D08_String {
	public static void main(String[] args) {
		String fruits = "apple/banana/orange/melon/watermelon/grape";
		
		// split(delim) : 문자열을 원하는 기준으로 잘라 문자열 배열로 반환한다. 
		String[] splited = fruits.split("/");
		String[] splited2 = fruits.split("an");
		
		System.out.println(Arrays.toString(splited));
		System.out.println(Arrays.toString(splited2));
		System.out.println("--------------------------------------");
		
		// join(delim, iterable) : 해당 iterable 객체에 들어 있는 모든 요소를 delim로 이어붙인다. 
		// ※ iterable - 배열, 리스트 등 순서대로 꺼낼 수 있는 성질을 의미하는 인터페이스
		
		String join = String.join("--", splited);
		System.out.println(join);
		System.out.println("--------------------------------------");
		
		// join(delim, Charsequence...)
		String join2 = String.join(", ", "사자", "호랑이", "얼룩말", "고양이", "강아지");
		System.out.println(join2);
		System.out.println("--------------------------------------");
		
		// contains(Charsequence) : 해당 문자열의 포함 여부를 반환
		String email = "abc123@naver.com";
		System.out.println(email.contains("naver"));
		System.out.println(email.contains("google"));
		System.out.println("--------------------------------------");
		
		// startsWith(Charsequence) : 문자열이 해당 문자열로 시작하는지 검사
		String url = "https://www.naver.com";
		
		System.out.println("URL: " + url);
		System.out.println("http:// - " + url.startsWith("http://"));
		System.out.println("http:// - " + url.startsWith("https://"));
		
		// endsWith(Charsequence) : 문자열이 해당 문자열로 끝나는지 검사
		System.out.println(".net? " + url.endsWith(".net"));
		System.out.println(".jpg? " + url.endsWith(".jpg"));
		System.out.println(".co.kr? " + url.endsWith(".co.kr"));
		System.out.println(".com? " + url.endsWith(".com"));
		System.out.println("--------------------------------------");
		
		// replace(old, new) : 문자열을 교체한 새로운 문자열을 반환한다. (원본을 훼손시키지 않는다.)
		String replaced = fruits.replace("melon", "redapple");
		System.out.println("원본: " + fruits);
		System.out.println("교체: " + replaced);
		System.out.println("--------------------------------------");
		
		// substring(start, end) : 문자열의 일부분을 자른 인스턴스를 반환한다.
		//						   (start 이상 end 미만, end의 인덱스값은 포함하지않는다.)
		String substr = fruits.substring(10, 17); // 10 ~ 16까지
		System.out.println(substr);
		
		//substring(start) : 해당 위치부터 맨 마지막까지 자른 인스턴스를 반환한다.
		substr = fruits.substring(17);
		System.out.println(substr);
		System.out.println("--------------------------------------");
		
		//trim() : 외곽의 공백을 제거한 인스턴스를 반환한다. (내부의 공백은 제거하지 않는다.)
		String input = "    abc123";
		String trimStr = input.trim();
		System.out.println("입력: " + input);
		System.out.println("입력: " + trimStr);
		System.out.println("--------------------------------------");
		
		// toUpperCase() : 해당 문자열을 모두 대문자로 변환한 인스턴스를 반환
		// toLowerCase() : 해당 문자열을 모두 소문자로 변환한 인스턴스를 반환
		System.out.println(input.toUpperCase().trim().replace(' ', '#'));
		System.out.println("--------------------------------------");
		
		// indexOf(Charsequence) : 원하는 문자열을 찾아 인덱스를 반환
		//						   맨 앞에서 시작하여 가장 먼저 찾은 인덱스를 반환한다.
		//						   값을 찾지 못하면 -1을 반환한다.
		fruits = "apple/banana/kiwi/greenapple/mango/orange/pineapple/grape/melon";
		
		System.out.println(fruits.indexOf("kiwi"));
		System.out.println(fruits.indexOf("apple"));
		
		// indexOf(Charsequence, statr) : 원하는 위치부터 찾기 시작할 수 있다.
		System.out.println(fruits.indexOf("apple", 1));		
	}
}
