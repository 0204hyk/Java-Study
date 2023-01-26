package myobj;

public class PlayCard {
	
	// 각 인스턴스가 자기만의 공간을 가지고 사용한다. (인스턴스 영역)
	public char suit;
	public int num;
	
	// 같은 클래스로 만들어진 모든 인스턴스가 함께 사용하는 공간이다. (스태틱 영역)
	public static int width = 100;
	public static int height = 200;
	
	public PlayCard(char suit, int num) {
		this.suit = suit;
		this.num = num;
	}
	
	// static 메서드에서는 인스턴스 영역의 자원을 사용할 수 없다.
	// -> static 메서드는 static 자원만 활용할 수 있는 메서드를 의미한다.
	// -> this는 현재 인스턴스를 뜻하기 때문에 static 메서드에서는 사용할 수 없다. (static은 this가 없으므로 사용할 수 없다.)
	public static void changeCardSize(int width, int height) {
		PlayCard.width = width;
		PlayCard.height = height;
	}
	
	// h1.info(), c10.info()를 타고 왔을 때 this는 h1, c10을 의미한다.
	public void info() {
		System.out.printf("[%c%d] w:%d, h:%d\n", this.suit, this.num, width, height);
	}
}
