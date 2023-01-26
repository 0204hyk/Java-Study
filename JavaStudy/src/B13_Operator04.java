
public class B13_Operator04 {
	/*
	 	# 삼항 연산자
	 	
	 	 - 간단한 if문을 한 줄로 사용할 수 있다.
	 	 - 비교 ? 예 : 아니오;
	 	 - 비교 결과가 true라면 : 왼쪽의 값을 사용한다.
	 	 - 비교 결과가 false라면 : 오른쪽의 값을 사용한다.
	 */
	public static void main(String[] args) {
		
		int apple = 22;
		int basket = apple % 10 == 0 ? apple / 10 : apple / 10 + 1;
		System.out.println("필요한 바구니의 개수 : " + basket);
		
		int a = 13;
		String message = a % 2 == 0 ? "짝수입니다." : "홀수입니다.";		
		int result = a % 2 == 0 ? 7 : 99;
		boolean holsu = a % 2 != 0;
		// boolean = holsu = a % 2 != 0 ? true : false;
		// 와 같으므로 boolean타입 삼항연산자는 안쓰는 것과 결과가 같다.
		
		System.out.println(message);
		System.out.println(result);
		System.out.println(holsu);
	}

}
