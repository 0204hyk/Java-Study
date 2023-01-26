package myobj;

public class Car2 {
	public double weight;
	public double accSpeed;
	public double breakSpeed;
	public double speed;
	
	public void tackle(String victim) {
		System.out.printf("%s에게 %.2f만큼의 힘을 전달했습니다.\n", victim, weight * speed);
	}
	
	// 각 자동차의 엔진 성능만큼 속도를 증가시키는 메서드
	public void acceleration() {
		speed += accSpeed;
	}
	
	// 각 자동차의 브레이크 성능만큼 속도를 감소시키는 메서드
	public void deceleration() {
		speed -= breakSpeed;
	}

}
