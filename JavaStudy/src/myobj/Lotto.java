package myobj;

import java.util.Arrays;

public class Lotto {
	
	int[][] nums;
	
	static int MAX_NUM = 45;
	static int MIN_NUM = 1;
	static int NUM_OF_LOTTO = 5;
	static int LOTTO_LENGTH = 6;
	static int WIN_LENGTH = 7;
	
	public static boolean isWin(int[] winNum, Lotto lotto) {
		// 넘겨받은 당첨번호와 해당 로또용지를 대조하여 당첨되었는지 확인하는 메서드를 구현해보세요 		 
		for (int i = 0; i < NUM_OF_LOTTO; ++i) {
			int count = 0;
			
			for (int j = 0; j < LOTTO_LENGTH; ++j) {
				for (int k = 0; k < WIN_LENGTH; ++k) {
					if(lotto.nums[i][j] == winNum[k]) {
						++count;
						break;
					}
				}
			}
			
			if (count >= 6) {
				return true;				
			}
		}
		
		return false;
	}
	
	public static int[] getWinNum() {
		int[] win = new int[WIN_LENGTH];
		
		for (int i = 0; i < WIN_LENGTH; ++i) {
			win[i] = (int)(Math.random() * MAX_NUM + MIN_NUM);
			
			for (int j = 0; j < i; ++j) {
				if (win[i] == win[j]) {
					--i;
					break;
				}
			}
		}
		return win;
	}
	
	public static int[] auto() {
		int[] lotto = new int[LOTTO_LENGTH];
		
		for (int i = 0; i < LOTTO_LENGTH; ++i) {
			lotto[i] = (int)(Math.random() * MAX_NUM + MIN_NUM);
			
			for (int j = 0; j < i; ++j) {
				if (lotto[i] == lotto[j]) {
					--i;
					break;
				}
			}
		}
		return lotto;
	}
	
	public Lotto() {
		nums = new int[NUM_OF_LOTTO][LOTTO_LENGTH];
		
		for (int i = 0; i < NUM_OF_LOTTO; ++i) {
			nums[i] = auto();
		}
	}
	
	public Lotto(int[][] nums) {
		this.nums = nums;
	}
	
	public void view() {
		for (int i = 0; i < NUM_OF_LOTTO; ++i) {
			System.out.println(Arrays.toString(nums[i]));
		}
	}

	public static void main(String[] args) {
		// Lotto 클래스의 당첨번호를 생성하는 기능을 이용해 당첨번호를 생성
		int[] winNum = Lotto.getWinNum();
		
		// 당첨될 때까지 용지 생성
		int count = 0;
		while (true) {
			// 생성자에서 자동으로 번호 5세트 생성
			Lotto lotto = new Lotto();
			count++;
			// 생성해놓은 당첨번호와 생성한 용지를 전달하면 당첨인지 알려주는 메서드
			if (Lotto.isWin(winNum, lotto)) {
				System.out.println("당첨 용지가 나왔습니다.");
				lotto.view(); // 해당 로또 용지 정보를 출력하는 메서드
				System.out.println("-------------------------");
				System.out.println("당첨번호: " + Arrays.toString(winNum));
				break;
			}
		} 
		System.out.printf("당첨 용지는 %d번 만에 나왔습니다.\n", count);
	}
}
