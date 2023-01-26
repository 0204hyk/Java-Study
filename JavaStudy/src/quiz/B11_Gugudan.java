package quiz;

public class B11_Gugudan {
	/*
	 	B10의 구구단 두 개를 while문으로 출력해보세요
	 	
	 */
	public static void main(String[] args) {
		System.out.println("======== 1번 문제 ========");
		
		int dan1 = 2;
		int gop1 = 1;
		
		while (dan1 <= 9) {
			System.out.printf("%d단 : ", dan1);
			gop1 = 1;
			while (gop1 <= 9) {
				System.out.printf("%dx%d=%-3d", dan1, gop1, dan1 * gop1);
				gop1++;
			}
			System.out.println();
			dan1++;
		}
		
		System.out.println("======== 2번 문제 ========");
		
		int gop2 = 0;
		int dan2 = 2;
		
		while (gop2 <= 9) {			
			dan2 = 2;
			while(dan2 <= 9) {
				if (gop2 == 0) {
					System.out.printf("%d단\t", dan2);
				} else {
					System.out.printf("%dx%d=%d\t", dan2, gop2, dan2 * gop2);
				}
				dan2++;
			}
			
			System.out.println();
			gop2++;
		}

		
		System.out.println("======== 1번 풀이 ========");
		int dan3 = 2, gop3 = 1;
		
		while (dan3 <= 9) {
			System.out.printf("%d단: ", dan3);
			gop3 = 1; // 아래 while문을 반복하기 위해서는 초기화를 다시 해줘야한다.
			while (gop3 <= 9) {
				System.out.printf("%dx%d=%-2d ", dan3, gop3, dan3 * gop3);
				++gop3;
			}
			++dan3;
			System.out.println();
		}
		
		
		System.out.println("======== 2번 풀이 ========");
		
		int line = 0;
		
		while (line < 10) {
			int dan4 = 2;
			while (dan4 <= 9) {
				if (line == 0) {
					System.out.printf("%d단\t", dan4);
				} else {
					System.out.printf("%dx%d=%d\t", dan4, line, dan4 * line);
				}
				++dan4;
			}
			++line;
			System.out.println();
		}
		
	}
}








