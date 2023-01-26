import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D11_RegexLookahead {
	/*
	 	# 정규표현식 Lookahead
	 	
	 	 - 특정 정규표현식 앞에 있는 패턴을 잡아낼 수 있는 방식
	 	 - 잘 응용하면 반드시 포함시키는 규칙을 만들어낼 수 있다.
	 	 
	 	 	apple(?=regex)  : regex 앞에 있는 apple을 찾아라
	 	 	apple(?!regex)  : regex 앞에 오지 않는 apple을 찾아라 
	 	 	apple(?<=regex) : regex 뒤에 오는 apple을 찾아라
	 	 	apple(?<!regex) : regex 뒤에 오지 않는 apple을 찾아라
	 */
	public static void main(String[] args) {
		
		// step1
		String text = "apple@ @apple apple@ @apple apple@ @apple";
//		Pattern frontApple = Pattern.compile("apple@");		// 그냥 쓰면 @가 포함됨
		Pattern frontApple = Pattern.compile("apple(?=@)");
		
		Matcher frontMatcher = frontApple.matcher(text);
		
		while(frontMatcher.find()) {
			System.out.println("found: " + frontMatcher.group());
			System.out.println("start: " + frontMatcher.start());
			System.out.println("end: " + frontMatcher.end());
		}
		
		
		// step2
		String text2 = "apple";
		String frontRegex2 = "app(?=l)e";	// app(?=l)e ----> "l앞에 app가 있니?" (l 자체가 없으므로 false)
		String frontRegex2_1 = "app(?=l)le";	// true
		
		System.out.println("# test2");
		System.out.println("app(?=l)e: " + Pattern.matches(frontRegex2, text2));
		System.out.println("app(?=l)le: " + Pattern.matches(frontRegex2_1, text2));
		
		
		// step3
		String text3 = "Hello, abcd1234!!! 3 4 5 6 78910 123 1234 1333";
		// "(?=\\d)."  ---> (?=\\d) 앞에 아무 것도 없기 때문에 .은 나(숫자)를 의미
		String frontRegex3 = "(?=\\d)[1-3]{2,}";
		
		
		Pattern pattern3 = Pattern.compile(frontRegex3);
		
		Matcher matcher3 = pattern3.matcher(text3);
		
		System.out.println("\n# test3\n");
		while (matcher3.find()) {
			System.out.println("found: " + matcher3.group());
			System.out.println("start: " + matcher3.start());
			System.out.println("end: " + matcher3.end());
			System.out.println("-------------------------");
		}
		
		
		// step4
		String text4 = "a12";
		String frontRegex4 = "(?=a\\d)[a1-4]{3,}";		// 글자를 소모하지 않아 맨 앞부터 검사하므로 3글자 true
		String frontRegex4_1 = "a(?=\\d)[1-4]{3,}";		// a 뒤부터 3글자여야 하므로 false
		
		System.out.println("# test4\n");
		System.out.println(Pattern.matches(frontRegex4, text4));
		System.out.println(Pattern.matches(frontRegex4_1, text4));
		
		
		// step5
		String text5 = "!AC2ABasdas@";
		// 조건을 모두 만족해야 하므로 다른 문자 들어가면 false
		// 조건1 검사하고 처음으로 돌아가서 조건2 검사 ... 조건4까지 검사
		String frontRegex5 = "(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%])"
				+ "[\\da-zA-Z!@#$%]{6,}";  
		
		System.out.println("\n# test5\n");
		System.out.println(Pattern.matches(frontRegex5, text5));
	}
}
