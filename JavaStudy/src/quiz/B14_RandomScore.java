package quiz;

public class B14_RandomScore {
	/*
	 	1. 학생 100명의 점수(0 ~ 100)를 랜덤으로 생성하여 배열에 저장
	 	
	 	2. 배열에 저장된 값을 한 줄에 10개씩 출력
	 	
	 	3. 모든 학생들의 평균 점수를 출력 (소수 둘째 자리까지 출력)
	 	
	 	4. 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은 점수를 출력
	 */
	public static void main(String[] args) {
		int score[] = new int[100];
		int sum = 0;
		
		for (int i = 0; i < score.length; ++i) {
			score[i] = (int)(Math.random() * 101);
			
			//한줄에 10개씩 출력, 점수 합 구하기
			if (i % 10 == 9) {
				System.out.printf("%-3d ", score[i]);			
				System.out.println();
			} else {
				System.out.printf("%-3d ", score[i]);								
			}
			sum += score[i];
			
		}
		double avg = sum / 100.0;
		
		System.out.println("학생들의 평균 점수 : " + Math.round(avg * 100) / 100.0);
		
		int min = score[0];
		int max = score[0];
		// 최대값, 최소값 구하기
		for (int j = 1; j < score.length; ++j) {
			if (min > score[j]) {
				min = score[j];
			}
			
			if (max < score[j]) {
				max = score[j];
			}
		}
		
		System.out.printf("최소점수 : %d\n최대점수 : %d\n", min, max);
	}

}
