package myobj2;

public class AirFryer extends Electronics {

	public AirFryer() {
		super("에어프라이어", 45000);
	}
	
	@Override
	public void start() {
		System.out.println("음식을 뜨거운 바람으로 조리하기 시작했습니다.");
	}
}
