

import myobj.Apple;
import myobj.Banana;
import myobj.Car;
import myobj.Subway;

public class C04_Constructor {
	/*
	 	# 클래스의 생성자 (Constructor)
	 	
	 	 - 새로운 인스턴스를 생성할 때 new와 함께 호출하는 것
	 	 - 클래스 이름과 동일한 이름을 가진 메서드
	 	  Apple a = new Apple();
	 	 - 생성자를 정의하지 않은 클래스에는 아무것도 없는 기본 생성자를 자동으로 생성해준다.
	 	 - 생성자는 새로운 인스턴스 생성시 가장 먼저 호출할 수밖에 없는 메서드이기 때문에, 
	 	   주로 해당 인스턴스의 초기화에 많이 사용된다.
	 */
	public static void main(String[] args) {
		Apple a = new Apple();
		Apple a2 = new Apple(99, 8, "red");
		Apple a3 = new Apple(77, 5);
		
		a.info();
		System.out.println("-----------------");
		a2.info();
		System.out.println("-----------------");
		a3.info();
		
		// 기본 생성자의 사용을 막아놓은 클래스
		//  - 이상한 바나나의 생성을 막는다 (개수만 있거나 색깔만 있는 것을 방지)
		Banana b1 = new Banana(8, "푸르딩딩");
		
		// 연습: C03에서 연습으로 만들었던 클래스에 생성자를 추가해보기
		
		Car c1 = new Car(2020, 40000, 3500);
		
		System.out.println("-----------------");
		System.out.printf("연식: %d\n키로수: %d\n원가: %d\n", c1.modelYear, c1.km, c1.price);
		c1.priceDownYear();
		c1.priceDownKm();
		System.out.printf("중고가: %d\n", c1.price);
		
		System.out.println("-----------------");
		
		Subway s1 = new Subway(2, true, true, new String[]{"A", "B", "C", "D", "E"});
		
		for (int i = 0; i < 6; ++i) {
			s1.infomation();
			s1.next();
		}
		
		Subway s2 = new Subway(4, true, false, new String[]{"a", "b", "c", "d", "e"});
		
		for (int i = 0; i < 6; ++i) {
			s2.infomation();
			s2.next();
		}
		
	}
	
}
