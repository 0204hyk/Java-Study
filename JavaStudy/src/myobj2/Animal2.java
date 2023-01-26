package myobj2;

// abstract - 나중에 자식이 구현할 예정임 (인스턴스화 할 수 없음)
abstract public class Animal2 {

	String name;
	
	public String getName() {
		return name;
	}
	
	// 나중에 자식이 구현할 예정인 메서드
	abstract public void bite();
	
}
