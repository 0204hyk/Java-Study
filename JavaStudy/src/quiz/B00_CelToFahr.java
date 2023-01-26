package quiz;

import java.util.Scanner;

public class B00_CelToFahr {

	// 사용자로부터 섭씨(℃) 온도를 입력 받으면 화씨(℉)로 몇도인지 알려주는 프로그램을 만들어보세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double celcius, fahrenheit;
		
		System.out.print("섭씨 온도(℃)를 입력하세요 >> ");
		celcius = sc.nextDouble();
		
		fahrenheit = (celcius * 1.8) + 32;
		System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.\n", celcius, fahrenheit);
		
		sc.close();
	}
	
}
