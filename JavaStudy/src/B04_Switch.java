
public class B04_Switch {
	
	/*
	 	# switch-case문
	 	
	 	 - ()안의 연산 결과에 따라 실행할 코드를 결정하는 문법
	 	 - ()안에 boolean 타입 대신 다른 타입을 사용해야 한다.
	 	 - if문으로 완벽하게 대체 가능하기 때문에 자주 사용하는 편은 아니다.
	 	 - break를 적지 않으면 다음 break를 만날 때까지 밑에 있는 모든 case를 실행한다.
	 	 - default는 if문의 else같은 역할을 한다.
	 	   ()안의 값에 해당하는 case가 없는 경우 default를 실행한다.
	 */
	
	public static void main(String[] args) {
		
		int a = 1;
		
		// 최신 JDK버전에서는 case에 ,를 사용할 수 있지만, 옛날 JDK에서는 불가능
		switch (a) {
			case 0: case 13: case 17: case 55: // case 0,1,2,3:
				System.out.println("명령1");
				System.out.println("명령1");
				System.out.println("명령1");
				break;
			case 4:
				System.out.println("명령2");
				break;
				
		}
		
		String user_input = "Quit";
		
		switch (user_input) {
			case "quit", "exit":
				System.out.println("프로그램을 종료합니다...");
				break;
			case "next", "play":
				System.out.println("프로그램을 계속 진행합니다...");
				break;
			case "add":
				System.out.println("새로운 데이터를 추가합니다");
				break;
			default:
				System.out.println("올바른 명령어가 아닙니다...");
				break;
		}
		
	}

}
