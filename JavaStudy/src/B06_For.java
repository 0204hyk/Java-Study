
public class B06_For {
	/*
	 	# 반복문 (Loop)
	 	
	 	 - for, while, forEach, do-while(X)
	 	 - 똑같은 코드를 여러번 반복하고 싶을 때 사용한다.
	 	 
	 	# for문
	 	
	 		for(초기값; 반복조건; 증감값) {
	 			가운데의 반복 조건이 참인 동안 반복될 코드들
	 		}
	 	 - 초기값 : 다양한 변수들을 초기화 하는 용도로 사용하는 곳
	 	 - 반복 조건 : 가운데의 조건이 참인동안 {}안의 내용을 계속 실행한다.
	 	 - 증감값 : {}의 내용을 모두 실행하고 나면 값을 변화시키는 용도로 사용하는 곳
	 */
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; ++i) {
			System.out.println("Hello, world!" + i);
		}
		
		for (int i = 0; i <= 12; i += 3) {
			System.out.println("Hello, world!" + i);
		}
		
		for (int i = 100; i > 0; i -= 5) {
			System.out.println("Hello!" + i);
		}
		/*
		 	1. 가장 기본적인 형태의 for문
		 	 
		 	 - 초기값에 0을 주고, 조건에는 반복하고 싶은 횟수를 적는다.
		 	 - 증가는 1씩 한다.
		 	 - 원하는 횟수만큼 반복하고 싶을 때 가장 많이 사용하는 형태의 for문
		 */
		for (int i = 0; i < 143; ++i) {
			System.out.printf("%d회 반복중입니다.\n", i + 1);
		}
		/*
		 	2. 초기값, 조건, 증감값을 자유롭게 설정한 for문
		 	
		 	 - 초기값, 조건, 증감값은 자유롭게 변경하여 용도에 맞게 사용할 수 있다.
		 	 - 증감값에는 +도 사용할 수 있고, -도 사용할 수 있다.
		 */
		for (int i = 7; i < 1000000000; i *= 7) {
			System.out.println(i);
		}
		
		for (int i = 483928123; i > 0; i /= 10) {
			System.out.println(i);
		}
		/*
		 	3. 각 자리에 값을 생략한 for문
		 	
		 	 - 초기값, 조건, 증감값은 모두 생략하여 사용할 수 있다.
		 	 - 조건을 생략하면 무한 반복하게 된다.
		 	 - ;;은 꼭 넣어야한다.
		 */
		int num = 10;
		for (;num < 100;) {
			System.out.printf("%d\n", num);
			num += 20;
		}
		System.out.printf("반복문이 모두 끝난 후의 num : %d\n", num);
	} 
}
