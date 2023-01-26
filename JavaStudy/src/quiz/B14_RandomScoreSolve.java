package quiz;

public class B14_RandomScoreSolve {
	/*
 	1. 학생 100명의 점수(0 ~ 100)를 랜덤으로 생성하여 배열에 저장
 	
 	2. 배열에 저장된 값을 한 줄에 10개씩 출력
 	
 	3. 모든 학생들의 평균 점수를 출력 (소수 둘째 자리까지 출력)
 	
 	4. 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은 점수를 출력
	 */
	public static void main(String[] args) {
		
		int[] score = new int[100];
		
		// 1. 학생 100명의 점수를 랜덤으로 생성하여 배열에 저장
		for (int i = 0; i < score.length; ++i) {
			score[i] = (int)(Math.random() * 101);
		}
		
		// 2. 출력 
		for (int i = 0; i < score.length; ++i) {
			System.out.printf("[%02d] : %-3d ", i, score[i]);
			if (i % 10 == 9) {
				System.out.println();
			}
		}
		
		// 3. 평균
		int sum = 0;
		for (int i = 0; i < score.length; ++i) {
			sum += score[i];
		
		}
		System.out.println("총합 : " + sum);
		System.out.printf("평균 : %.2f\n", sum / (double)score.length);
		
		// 4. 최대값, 최소값
		int max = 0;
		int min = 100;
		
		for (int i = 0; i <score.length; ++i) {
			// 현재 max에 들어있는 값보다 더 크면 최대값을 교체한다.
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
		}
		System.out.printf("최대값은 %d이고, 최소값은 %d입니다.\n", max, min);
		
	}
}
