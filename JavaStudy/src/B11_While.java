
public class B11_While {
	
	/*
	 	# while문
	 	
	 	 - for문과 사용법이 약간 다른 반복문
	 	 - 초기값과 증감값의 위치가 정해져 있지 않다. (자유롭다.)
	 	 - ()안의 내용이 true이면 {}안의 내용을 반복한다.
	 	 - 증감값의 위치에 따라 프로그램 실행 결과가 달라질 수 있다.
	 */
	public static void main(String[] args) {		
		int i = 0;
		
		while(i++ < 10) {
			System.out.println("loop " + i++);
			i++;
		}
		
		// while문에서 가장 중요한 것은 증감값의 위치에 따라
		// 숫자가 몇부터 몇까지 반복될지 정확하게 아는 것
		i = 0;
		
		while(i++ < 10) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 10이지만 9번 반복하므로 별로인 반복문
		i = 0;
		
		while(++i < 10) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		i = 0;
		
		while(i < 10) {
			System.out.print(i++ + " ");
		}
		System.out.println();
		
		i = 0;
		
		while(i < 10) {
			System.out.print(++i + " ");
		}
		System.out.println();
	}
}
