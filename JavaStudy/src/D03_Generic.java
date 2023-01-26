import myobj2.MyCollection;

public class D03_Generic {
	
	/*
	 	# 제네릭 (Generic)
	 	
	 	 - 클래스를 정의할 때 나중에 타입을 지정할 수 있도록 설계하는 것
	 	 - 클래스 이름 옆에 <>를 사용해 제네릭명을 지정해둘 수 있다.
	 	 - 인스턴스 생성시에 해당 타입을 지정해줄 수 있다.
	 	 - 제네릭에는 기본형 타입을 사용할 수 없다.
	 	   (Integer, Character, Double, Float, Boolean ...)
	 */
	public static void main(String[] args) {
		// 인스턴스를 생성하며 정의해 두었던 타입을 결정할 수 있다.
		MyCollection<String> myList = new MyCollection<>();
		MyCollection<Character> myList2 = new MyCollection<>();
		
		myList.add("airplane");
		myList.add("append");
		myList.add("add");
		
		myList2.add('A');
		
		System.out.println(myList.get(0));
		System.out.println(myList.get(1));
		System.out.println(myList.get(2));
		System.out.println(myList2.get(0));
	}
}
