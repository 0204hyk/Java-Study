
public class B02_Operator02 {
	
	/*
	 	# 비교 연산자
	 	
	 	 - 두 값을 비교하는 연산
	 	 - 비교 연산의 결과는 항상 참(true) 또는 거짓(false)이다.
	 	   (비교 연산의 결과는 boolean 타입이다.)
	 	 - 산술 연산과 비교 연산이 함께 있으면 산술 연산을 먼저 계산한다.
	 	
	 	# 논리 연산자
	 	
	 	 - boolean 타입 값으로 연산
	 	 - && : 양 옆의 두 값이 모두 true (AND)
	 	 - || : 두 값중 하나만 true여도 true (OR)
	 	 - ! : true면 false, false면 true (NOT)
	 */
	public static void main(String[] args) {
		
		int a = 10, b = -7;
		// boolean 타입 변수에는 비교 연산자가 들어갈 수 있다.
		// ex> boolean c = a > b;
		
		System.out.println(a < b);
		System.out.println(a * b < a + b);
		
		System.out.println(a > b);  // > : 왼쪽이 크면 true
		System.out.println(a < b);  // < : 오른쪽이 크면 true
		System.out.println(a >= b); // >= : 왼쪽이 크거나 같으면 true
		System.out.println(a <= b); // <= : 오른쪽이 크거나 같으면 true
		System.out.println(a == b); // == : 두 값이 같으면 true
		System.out.println(a != b); // == : 두 값이 다르면 true
		
		System.out.println(a + 5 < 20);
		System.out.println(a % 3 == 0); // a가 3의 배수일 때 true
		System.out.println(a % 3 != 0); // a가 3의 배수가 아닐 때 true
		
		System.out.println("### AND ###"); // 양 옆의 두 값이 모두 true인 경우에만 true
		System.out.println(true && true); 
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println("### OR ###"); // 두 값 중 하나만 true여도 true
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("### NOT ###"); // true면 false, false면 true
		System.out.println(!true);
		System.out.println(!false);	
		
		a = 95;
		
		System.out.println(a < 100 && a % 5 == 0 && a > 0);

	}
	
}
