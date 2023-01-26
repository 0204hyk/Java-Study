package myobj;
	/*
		연습 문제 : 현실에 존재하는 객체를 하나 참고하여 클래스를 하나 생성한 후
			  인스턴스를 생성하고 해당 인스턴스의 상태를 출력해보세요
	 */
public class Car {
	public int modelYear;
	public int km;
	public int price;
	
	public Car() {
		
	}
	
	public Car(int modelYear, int km, int price) {
		this.modelYear = modelYear;
		this.km = km;
		this.price = price;
	}
	
	public void priceDownYear() {
		for (int i = modelYear; i < 2022; ++i ) {
			price -= 100;
		}
	}
	
	public void priceDownKm() {
		for (int i = 0; i < km; i += 1000) {
			price -= 10;
		}
	}
	
}
