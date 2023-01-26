package myobj2;

public class Electronics {
	String name;
	String manual;
	int price;
	
	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void info() {
		System.out.printf("제품명: %s, 가격: %d\n", name, price);
	}
	
	public void printManual() {
		if (manual != null) {
			System.out.println(manual);
		} else {
			System.out.println("메뉴얼이 없는 제품입니다.");
		}
	}
	
	public void start() {
		System.out.println("전자제품이 작동하기 시작했습니다.");
	}
}
