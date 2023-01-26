package myobj;

public class Banana {
	public int qty;
	public String color;
	
	// 다른 생성자가 하나라도 존재하는 경우, 아무것도 없는 기본 생성자를 자동으로 만들어주지 않는다.
	public Banana(int qty, String color) {
		this.qty = qty;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return String.format("나는 %d개 짜리 %s 바나나", qty, color);
	}
}
