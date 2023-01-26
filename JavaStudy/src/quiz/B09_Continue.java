package quiz;

public class B09_Continue {
	/*
	 	1. 1부터 30까지 한 줄에 숫자를 5개씩 출력
	 	
	 	2. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
	 */
	public static void main(String[] args) {
		// 1. 1부터 30까지 한 줄에 숫자를 5개씩 출력
		for (int i = 1; i <= 30; ++i) {
			System.out.print(i + "\t");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("-----------------------------------");
		
		// continue를 쓰는 경우
		for (int i = 1; i <= 30; ++i) {
			System.out.print(i + "\t");
			if(i % 5 != 0) {
				continue;
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		// 2. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
		int sum = 0;
		for (int i = 1; i <= 200; ++i) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("총합 : " + sum);
	}
}
