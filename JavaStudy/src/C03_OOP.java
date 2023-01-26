import myobj.Book;
import myobj.Car;
import myobj.Car2;
import myobj.Subway;

public class C03_OOP {
	/*
	 	# 객체 지향 프로그래밍 (Object Oriented Programming)
	 	
	 	 - 변수와 함수들을 세상에 존재하는 개념(객체)으로 묶어서 사용하려는 프로그래밍 방법론
	 	 - 변수와 함수들을 무분별하게 사용하는 것보다 현실에 존재하는 객체 단위로 묶어서 표현하는 것이 개발자들의 업무 효율을 높인다.
	 	 - 변수는 현실에 존재하는 객체의 상태를 나타낸다.
	 	   ex > color, name, age, ...
	 	 - 해당 객체의 상태를 변화시킬 수 있는 객체 내부의 함수들을 메서드라고 부른다.
	 	 
	 	 
	 	ex : 책 (Book)
	 	 - 책의 상태(변수) : 전체 페이지, 현재 페이지, 눌림정도, 각 페이지의 낙서여부, 
	 	 				  각 페이지의 메모 내용, 가치, 원래 가격, 감가상각, ...
	 	 - 책의 기능(메서드) : 페이지를 넘기는 기능(몇 페이지 넘길지), 해당 페이지에 메모하는 기능,
	 	  				   형광펜을 칠하는 기능, ...
	 	  				   
		# 클래스 (Class)
		
		 - 객체지향 프로그래밍의 객체를 프로그래밍 언어로 표현한 문법
		 - 클래스는 해당 객체의 설계도 역할을 한다.
		 - 클래스는 정의한 시점에서는 실체(인스턴스)가 없다.
		 - 클래스라는 설계도를 통해 만들어내는 실제 객체를 '인스턴스(instance)'라고 부른다.
		 - 클래스를 통해 인스턴스를 생성할 때 new를 사용한다.
		 - 같은 패키지 내부에는 같은 이름의 클래스를 정의할 수 없다.
	 */
	public static void main(String[] args) {
		// new를 통해 인스턴스를 찍어낼 수 있다.
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.price = 35000;
		book1.page = 350;
		book1.currPage = 10;
		
		System.out.println(book1.price);
		System.out.println(book2.price);
		
		book1.nextPage();
		book2.nextPage();
		System.out.println(book1.currPage);
		System.out.println(book2.currPage);
		
		/*
 			연습 문제 : 현실에 존재하는 객체를 하나 참고하여 클래스를 하나 생성한 후
 			  		  인스턴스를 생성하고 해당 인스턴스의 상태를 출력해보세요
		 */
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.modelYear = 2020;
		car1.km = 20000;
		car1.price = 4000;
		
		car2.modelYear = 2016;
		car2.km = 86000;
		car2.price = 3000;
		
		System.out.println("=========================");
		
		System.out.println("자동차1 연식 : " + car1.modelYear);
		System.out.println("자동차1 키로수 : " + car1.km);
		System.out.println("자동차1 원가 : " + car1.price + "만원");
		car1.priceDownYear(); // 1년당 -100만원
		car1.priceDownKm();	  // 1000km당 -10만원
		System.out.println("자동차1 중고가 : " + car1.price + "만원");
		
		System.out.println("=========================");
		
		System.out.println("자동차2 연식 : " + car2.modelYear);
		System.out.println("자동차2 키로수 : " + car2.km);
		System.out.println("자동차2 원가 : " + car2.price + "만원");
		car2.priceDownYear();
		car2.priceDownKm();
		System.out.println("자동차2 중고가 : " + car2.price + "만원");
		
		System.out.println("=========================");
		
		Car2 truck = new Car2();
		
		truck.weight = 3000;
		truck.accSpeed = 5.2;
		
		truck.tackle("고라니");
		
		truck.acceleration();
		truck.acceleration();
		truck.acceleration();

		truck.tackle("고라니");
		
		System.out.println("=========================");
		
		Subway one = new Subway();
		Subway two = new Subway();
		
		one.line = 1;
		two.line = 2;
		
		// 배열의 메모리 할당이 되지 않아 사용할 수 없는 방식
		//one.stations = {"시청", "종각", "종로3가"};
		
		// 배열의 메모리 할당과 초기화를 동시에 진행하는 방식
		one.stations = new String[]{"시청", "종각", "종로3가", "종로5가"};
		two.stations = new String[] {"당산", "합정", "홍대입구", "신촌", "이대"};
		
		two.rotate = true;
		two.direction = true;
		
		for (int i = 0; i < 5; ++i) {
			one.infomation();
			one.next();
		}
		
		for (int i = 0; i < 5; ++i) {
			two.infomation();
			two.next();
		}
		
	}	
	
}


