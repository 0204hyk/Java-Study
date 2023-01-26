package quiz;

public class B06_ForQuiz {
	/*
	 	1. 2000 미만의 9의 배수를 모두 출력해보세요 (양수만)
	 	
	 	2. 100부터 300까지의 총합을 구해보세요 (100과 300 포함)
	 	
	 	3. 1000부터 1500까지 10의 배수를 한 줄에 7개씩 출력해보세요
	 */
	public static void main(String[] args) {
		
		// 1. 2000 미만의 9의 배수를 모두 출력해보세요 (양수만)
		
		// 1-1. 9씩 더하면 9의 배수
		for (int i = 0; i < 2000; i += 9) {
			System.out.println(i);
		}
		
		// 1-2. 숫자를 9로 나누었을 때 나누어 떨어지면 9의 배수
		for (int i = 0; i < 2000; ++i) {
			if (i % 9 == 0) {
				System.out.println(i);
			}
		}
		
		//2. 100부터 300까지의 총합을 구해보세요 (100과 300 포함)
		
		// * 총합을 구할 때는 변수를 하나 만들어서 값을 계속 누적시킨다.
		int sum = 0;
		
		for (int i = 100; i <= 300; ++i) {
			sum += i;
		}
		
		System.out.printf("100부터 300까지의 총합은 %d입니다.\n", sum);
		
		//3. 1000부터 1500까지 10의 배수를 한 줄에 7개씩 출력해보세요 
		
		// * 7번에 한번씩 \n을 출력해주면 된다.
		
		// for문 안에서 변수를 선언해도 된다.
		// int count = 0;
		for (int i = 1000, count = 0; i <= 1500; ++i) {
			if (i % 10 == 0) {
				System.out.printf("%-5d(%d번째) ", i, count);
				
				if (count % 7 == 6) {
					System.out.println(); // == System.out.print("\n");
				}
				count++;
			}
		}
		
	}
}
