package school;

public class RandomNameGenerator {
	
	private static String[] lastName = {
			"김", "이", "박", "최", "성", "제갈", "남궁", "왕", "조", "구", "정" 
	};
	
	private static String[] firstName = {
			"민석", "민식", "민구", "민희", "민지", "민철", "민", "민수"
	};
	
	public static String getName() {
		return lastName[(int)(Math.random() * lastName.length)]
				+ firstName[(int)(Math.random() * firstName.length)];
	}
}
