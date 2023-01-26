
public class B08_CharAt {
	/*
	 	# "문자열".charAt(index);
	 	
	 	 - 해당 문자열에서 원하는 인덱스의 문자를 char타입으로 꺼내는 함수
	 	 - 첫 번째 문자는 0번 인덱스다.
	 	 
	 	# "문자열".length();
	 	
	 	 - 해당 문자열이 몇 글자인지 (길이가 얼마인지) int 타입으로 알려주는 함수
	 	 - 문자열의 마지막 인덱스는 '길이 - 1'이다.
	 */
	public static void main(String[] args) {
		
		String msg = "Welcome to my homepage!";
		
		System.out.println("msg의 길이 : " + msg.length());
		
		System.out.println(msg);
		System.out.println(msg.charAt(0));
		System.out.println(msg.charAt(1));
		System.out.println(msg.charAt(2));
		System.out.println(msg.charAt(3));
		System.out.println(msg.charAt(4));
		System.out.println(msg.charAt(5));
		System.out.println(msg.charAt(6));
		
		// 길이 -1이 마지막 글자임을 이용해 뒤에서부터 접근 가능
		int len = msg.length();
		
		System.out.println(msg.charAt(len - 1));
		System.out.println(msg.charAt(len - 2));
		System.out.println(msg.charAt(len - 3));
		
		// for문을 통해 문자열의 모든 문자를 쉽게 꺼낼 수 있다.
		for (int index = 0; index < msg.length(); ++index) {
			System.out.printf("%d번째 글자 : %c\n", index, msg.charAt(index));
		}
		
	}
}
