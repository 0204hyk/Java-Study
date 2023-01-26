import java.util.Random;

public class B12_Random {
	/*
	 	# 무작위 숫자 생성하기
	 	
	 	 1. Math.random() 함수 사용하기
	 	 
	 	 2. java.util.Random 클래스 사용하기
	 */
	public static void main(String[] args) {
		// # new Random()으로 새로운 랜덤 시드 생성
		//  - 시드 : 여러 숫자가 순서대로 저장되어 있는  것
		//  - 같은 시드 번호로 설정하면 계속 같은 숫자가 순서대로 나오게 된다.
		//  - 원하는 타입을 선택하여 꺼낼 수 있다.
		Random ran = new Random();
		
		// nextInt()에 int 값을 전달해 랜덤 숫자의 범위를 설정할 수 있다.
		//  - 100을 전달하면 0부터 99까지의 정수를 반환 (100개)
		//  - 101을 전달하면 0부터 100까지의 정수를 반환 (101개)
		//  - 먼저 숫자의 개수를 정하고 더하거나 빼서 숫자의 시작 지점을 정할 수 있다.
		System.out.println(ran.nextInt(100));
		System.out.println(ran.nextInt(100));
		System.out.println(ran.nextInt(100) - 200);	// -200 ~ -101
		System.out.println(ran.nextInt(101) - 200); // -200 ~ -100
		System.out.println(ran.nextInt(100));
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextBoolean());
		
		// Math.random() : 0 <= x < 1인 랜덤 소수를 생성한다.
		System.out.println(Math.random()); 
		System.out.println(Math.random()); 
		System.out.println(Math.random()); 
		System.out.println(Math.random()); 
		System.out.println(Math.random()); 
		
		// Math.random()을 사용해 원하는 범위의 랜덤 정수 만들기
		
		// (1) 소수를 int로 변경하면 소수점 아래를 모두 버린다.
		System.out.println((int)Math.random()); // 0
		
		// (2) 0 <= x < 1인 소수에 원하는 범위를 곱한 후 int로 변경하면
		// 	   원하는 범위위 랜덤 정수를 생성할 수 있다.
		//	   ==> ran.nextInt(int bound)에 범위를 설정하는 것과 같음
		
		// 0 * 10 <= x < 1 * 10 --> 0 ~ 9 
		System.out.println((int)(Math.random() * 10));
		
		// 0 <= x < 100
		System.out.println((int)(Math.random() * 100));
		
		// 0 <= x < 1000
		System.out.println((int)(Math.random() * 1000));
		
		// 0 <= x < 85
		System.out.println((int)(Math.random() * 85));
		
		// (3) 만들어진 정수에 값을 더하거나 빼서 원하는 범위를 설정
		System.out.println((int)(Math.random() * 85) - 300); // -300 ~ - 216
		System.out.println((int)(Math.random() * 85) + 100); // 100 ~ 184
		
		// 연습 : 1 ~ 45의 랜덤 정수를 10개 출력해보세요
		for (int i = 1; i <= 10; ++i) {
			// 0 ~ 44 + 1 => 1 ~ 45
			System.out.print((int)(Math.random() * 45) + 1 + " ");
		}
		System.out.println();
		
		int a = 1;
		while(a <= 10) {
			System.out.print(ran.nextInt(45) + 1 + " ");
			a++;
		}
		
	}

}
