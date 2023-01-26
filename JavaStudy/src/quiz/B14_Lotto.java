package quiz;

public class B14_Lotto {
	/*
	    0. 우선 배열에 랜덤 숫자 6개를 생성해보세요
	    
	 	1. 1 ~ 45의 "중복 없는" 랜덤 숫자 6개를 생성하여 당첨번호를 만들어보세요
		Hint : 중복값이면 다시 뽑는다. or 뽑고나서 그 번호 다시 안뽑는다
		
	 	2. 당첨될 때까지 랜덤 로또 번호를 생성하여 몇회만에 당첨되었는지 출력해보세요
	 	   (6개중 6개 맞추면 1등) 
	 */
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; ++i) {
			// 1 ~ 45의 랜덤 값 배정
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			// 중복 제거
			for (int j = 0; j < i; ++j) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}				
		}				
		// 당첨 번호 출력
		System.out.print("당첨 번호 : ");
		for (int i = 0; i < 6; ++i) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
	}
}
