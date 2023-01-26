package quiz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Test_Lotto {
	
	static int bonusNum;
	
	public static int[] winNumber() {
		int[] lotto = new int[7];
		
		for (int i = 0; i < lotto.length; ++i) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			for (int j = 0; j < i; ++j) {
				if (lotto[i] == lotto[j]) {
					--i;
					break;
				}
			}
		}
		
		bonusNum = lotto[6];
		
		System.out.print("[ 당첨 번호 : ");
		for (int i = 0; i < 6; ++i) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("]");
		System.out.printf("[ 보너스번호 : %d ]\n\n", bonusNum);
		
		return lotto;
	}
		
	public static int[] getLotto(int[] winNumber) {
		int[] myLotto = new int[6];
		for (int i = 0; i < myLotto.length; ++i) {
			myLotto[i] = (int)(Math.random() * 45 + 1);
			for (int j = 0; j < i; ++j) {
				if (myLotto[i] == myLotto[j]) {
					--i;
					break;
				}
			}
		}
		System.out.print("내가 뽑은 번호 : ");
		for (int i = 0; i < myLotto.length; ++i) {
			System.out.print(myLotto[i] + " ");
		}
		System.out.println();
		
		return myLotto;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int buyCount;
		System.out.print("로또 구입할 횟수 입력 > ");
		buyCount = sc.nextInt();
		System.out.println();
		
		int[] winLotto = winNumber();

		// 낙첨, 1 ~ 5등 횟수를 배열에 저장
		int[] rankNum = {0, 0, 0, 0, 0, 0};
		
		for (int i = 0; i < buyCount; ++i) {
			int[] myLotto = getLotto(winLotto);
			
			int winCount = 0;
			
			for (int j = 0; j < winLotto.length - 1; ++j) {
				for (int k = 0; k < myLotto.length; ++k) {
					if (winLotto[j] == myLotto[k]) {
						++winCount;
						break;
					}
				}
			}
			System.out.print("결과 : ");			
			if (winCount == 6) {
				System.out.println("1등 당첨");
				rankNum[1]++;
			} else if (winCount == 5) {
				for (int j = 0; j < myLotto.length; ++j) {
					if (myLotto[j] == bonusNum) {
						System.out.println("2등 당첨");
						rankNum[2]++;
					} else {
						System.out.println("3등 당첨");
						rankNum[3]++;
					}
				}
			} else if (winCount == 4) {
				System.out.println("4등 당첨");
				rankNum[4]++;
			} else if (winCount == 3) {
				System.out.println("5등 당첨");
				rankNum[5]++;
			} else {
				System.out.println("낙첨");
				rankNum[0]++;
			}
			System.out.println();
		}
		
		System.out.printf("[ 1등 당첨 횟수 : %d ]\n"
				+ "[ 2등 당첨 횟수 : %d ]\n"
				+ "[ 3등 당첨 횟수 : %d ]\n"
				+ "[ 4등 당첨 횟수 : %d ]\n"
				+ "[ 5등 당첨 횟수 : %d ]\n"
				+ "[ 낙첨 횟수 : %d ]\n", 
				rankNum[1], rankNum[2], rankNum[3], rankNum[4], rankNum[5], rankNum[0]);
		
	}
}
