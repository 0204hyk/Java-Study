package myobj;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void sayHi() {
		System.out.printf("안녕! 내 이름은 %s야. 나이는 %d살이야.\n", name, age);
	}
}
