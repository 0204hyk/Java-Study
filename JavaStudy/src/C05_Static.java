import myobj.CoffeeBean;
import myobj.Grade;
import myobj.PlayCard;

public class C05_Static {
	/*
	 	# static (정적 영역, 클래스 영역 <=> 인스턴스 영역)
	 	
	 	 - 같은 클래스의 모든 인스턴스들이 함께 사용하는 공동 영역을 정적 영역(클래스 영역)이라고 한다.
	 	 - 앞에 static이 붙은 자원들은 모든 인스턴스가 함께 사용하는 공동 자원이 된다.
	 	 - static 영역의 자원은 아무리 많은 인스턴스가 있어도 클래스 당 하나이기 때문에 클래스 이름에 .을 찍고 사용할 수 있다.
	 	   (ex : Math.pow(), Math.random())
	 */
	public static void main(String[] args) {
		// 인스턴스가 하나도 없는 상황에도 static은 존재할 수 있다.
		System.out.println(PlayCard.width);
		System.out.println(PlayCard.height);

		PlayCard.changeCardSize(200, 300);
		
		PlayCard h1 = new PlayCard('♥', 1);
		PlayCard c5 = new PlayCard('♣', 5);
		PlayCard c7 = new PlayCard('♣', 7);
		PlayCard c10 = new PlayCard('♣', 10);
		
//		PlayCard.width = 500;
//		PlayCard.height = 1200;
		
		h1.info();
		c5.info();
		c7.info();
		c10.info();
		
		// 다양한 방식으로 인스턴스를 생성하여 활용할 수 있다.
		CoffeeBean.BRAZILIAN_ARABICA.info();
		CoffeeBean.COLOMBIAN_ROBISTA.info();
		CoffeeBean myBean = new CoffeeBean(2, 3);
		
		myBean.info();
		
		// 익명 방식 (이름이 없어서 다시 사용할 수 없다.)
		new CoffeeBean(2, 6).info();
		
		// 연습: static 자원을 포함한 클래스를 하나 설계해보세요
		
		Grade g1 = new Grade("홍길동", 890);
		Grade g2 = new Grade("고길동", 891);
		
		Grade.changeMaxMin(990, 100);
		
		g1.studentGrade();
		g2.studentGrade();
		
	}
}
