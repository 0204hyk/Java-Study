import myobj2.Animal2;
import myobj2.Lion;
import myobj2.Shark;

public class C14_AbstractClass {
	/*
	 	# 추상 클래스 (abstract class)
	 	
	 	 - 클래스의 형태만 만들어놓고 자세한 구현은 자식 클래스에게 미루는 클래스
	 	 - 추상 클래스를 상속받은 자식 클래스는 반드시 내부의 추상 메서드를 오버라이드해 구현을 마무리지어야 한다.
	 	 - 추상 클래스는 인스턴스화가 불가능하다. (아직 미완성이므로)
	 	 
	 	# 추상 메서드 (abstract method)
	 	
	 	 - 선언만 해놓고 구현 내용은 없는 메서드
	 	 - 자식 클래스에게 오버라이드를 강제 시킬 수 있다.
	 */
	public static void main(String[] args) {
		//Animal2 a1 = new Animal2(); <- 추상 클래스는 구현된 메서드가 없어 인스턴스화가 불가능하다.
		Animal2 a1 = new Shark();
		Animal2 a2 = new Lion();
		
		a1.bite();
		a2.bite();
	}
	
}
