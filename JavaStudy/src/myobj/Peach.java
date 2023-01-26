package myobj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Peach implements Comparable{
	
	String kind;	// 백도 황도
	int grade;		// 1 ~ 5등급
	double sweet;	// 10 ~ 20%
	int country;	// 국가 코드 (중국, 이탈리아, 스페인, 미국)
	int price;
	String countryName;
	
	// 다른 패키지에서는 수정할 수 없도록 제어할 수 있음
	public int getPrice() {
		return price;
	}
	public double getSweet() {
		return sweet;
	}
	public String getCountryName() {
		return countryName;
	}
	
	private static Random r = new Random();
	private static int[] countryCodes = {86, 39, 34, 1}; 
	private static String[] countryNames = {"China", "Italy", "Spain", "USA"}; 
	
	public Peach() {
		int randomCountry = r.nextInt(countryCodes.length);
		
		kind	= r.nextBoolean() ? "백도" : "황도";
		grade	= r.nextInt(5) + 1;
		sweet	= r.nextDouble(10) + 10;
		// 중국(86), 이탈리아(39), 스페인(34), 미국(1)
		country	= countryCodes[randomCountry];
		price = (r.nextInt(11) + 20) * 100;	// 백원단위로 끊기
		
		countryName = countryNames[randomCountry];
	}
	
	@Override
	public String toString() {
		return String.format("[%s/%d등급/%.2f%%/￦%d/%s(%d)]\n", 
				kind, grade, sweet, price, countryName, country);
	}
	
	// compareTo : Comparable 인터페이스에 딸려있는 추상 메서드
	//			   현재 인스턴스와 매개변수로 전달받은 인터페이스의 비교 결과를 정의해놓아야 한다.
	
	@Override
	public int compareTo(Object o) {
		Peach p2 = (Peach)o;
		
		// this와 매개변수로 전달받은 인스턴스를 비교
		//		return 1  : this가 더 크다. (오름차순 시 오른쪽으로 가야한다.)
		//		return 0  : 두 인스턴스의 크기가 같다.
		//		return -1 : this가 더 작다. (오름차순 시 왼쪽으로 가야한다.)
		
		if (this.grade > p2.grade) {
			return 1;
		} else if (this.grade < p2.grade) {
			return -1;
		} else {
			return 0;
		}
	}
}
