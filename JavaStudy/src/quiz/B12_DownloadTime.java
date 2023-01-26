package quiz;

import java.util.Scanner;

public class B12_DownloadTime {
	/*
	 	사용자로부터 다운로드 시간을 초 단위로 입력받으면
	 	x일 x시간 x분 x초 남았는지 환산하여 출력해보세요
	 	(필요 없는 단위는 출력하지 않아야 함)
	 	
	 	>> 600
	 	 -> 10분 0초
	 	
	 	>> 86756
	 	 -> 1일 0시간 5분 56초
	 */
	public static void main(String[] args) {
		System.out.print("다운로드 시간 >> ");
		int downloadTime = new Scanner(System.in).nextInt();
		// final이 붙은 변수는 수정할 수 없다.
		// 영원히 변하지 않을 값은 변수를 모두 대문자로 지정한다
		final int SECOND = downloadTime % 60;
		final int MINUTE = (downloadTime / 60) % 60;
		// MINUTE = downloadTime % 3600 / 60도 가능
		final int HOUR = (downloadTime / 3600) % 24;
		// HOUR = downloadTime % 86400 / 3600도 가능
		final int DAY = downloadTime / 86400;
		
		if (downloadTime >= 86400) {
			System.out.printf("%d일 %d시간 %d분 %d초", DAY, HOUR, MINUTE, SECOND);
		} else if (downloadTime >= 3600) {
			System.out.printf("%d시간 %d분 %d초", HOUR, MINUTE, SECOND);
		} else if (downloadTime >= 60) {
			System.out.printf("%d분 %d초", MINUTE, SECOND);
		} else {
			System.out.printf("%d초", downloadTime);
		}
		
		
	}
}
