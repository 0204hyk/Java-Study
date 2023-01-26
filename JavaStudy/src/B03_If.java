
public class B03_If {
	
	/*
	 	# if문
	 	
	 	 - ()안의 값이 true면 {}안의 내용을 실행하는 문법
	 	 - ()안의 값이 false면 {}안의 내용을 무시한다.
	 	
	 	# else if문
	 	
	 	 - 위의 if문이 실행되지 않았다면 if문처럼 동작한다.
	 	 - else if는 여러번 사용할 수 있다.
	 	 - else if는 단독으로 사용할 수 없다.
	 	 
	 	# else문
	 	
	 	 - 위의 조건(if, else if)이 모두 아니라면 {}안의 내용을 무조건 실행한다.
	 	   (무조건 실행하기 때문에 ()가 쓰이지 않는다.)
	 	 - if문 바로 다음에 사용할 수도 있다.
	 	 - 단독으로 사용할 수 없다.
	 	 - else가 붙어있는 if절은 최소한 한 번은 실행이 보장된다.
	 	 
	 */
	public static void main(String[] args) {
		System.out.println("program start.");
		
		int a = 13;
		
		if (a == 10) {
			System.out.println("hi");
		} else if (a == 11) {
			System.out.println("hello");
		} else if (a == 12) {
			System.out.println("nice to meet you");
		} else if (a == 13) {
			System.out.println("welcome");
		} else {
			System.out.println("nothing");
		}
		
		int apple;
		a = -500;
		
		// else를 사용하지 않으면 변수 apple이 초기화 되지 않을 가능성이 존재하므로
		// 초기화 된 것으로 볼 수 없다.
		if(a > 100) {
			apple = 55;			
		} else if (a <= 100) {
			apple = -1;
		} else {
			apple = -10;
		}
		
		System.out.println("사과 : " + apple);
		
		System.out.println("program end.");
		
	}

}
