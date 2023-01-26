package quiz;

public class B11_Continue {
	/*
 		1. 1부터 30까지 한 줄에 숫자를 5개씩 출력
 	
 		2. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
 	
 		* while문을 사용해야함
 		* while문 내부에도 break와 continue를 사용할 수 있다.
	 */
	public static void main(String[] args) {
		System.out.println("============== 1번 문제 ==============");
		int num = 1;
		
		while (num <= 30) {
			System.out.print(num + "\t");
			if (num % 5 == 0) {
				System.out.println();
			}
			num++;
		}
		
		// contiune를 이용한 풀이
		System.out.println("============== 1번 풀이 ==============");
		
		num = 1;
		while (num <= 30) {
			System.out.print(num++ + "\t");
			if (num % 5 != 1) {
				continue;
			}
			System.out.println();
		}
		
		System.out.println("============== 2번 문제 ==============");
		
		num = 0;
		int sum = 0;
		
		while (num++ <= 200) {
			if (num % 2 == 0 || num % 3 == 0) {
				continue;
			}
			sum += num;
		}
		System.out.printf("총합 : %d", sum);
		
	}
}




