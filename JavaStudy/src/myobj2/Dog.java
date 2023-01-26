package myobj2;

public class Dog extends Animal {
	String name;
	String dogBreed;
	
	public Dog(String name, String dogBreed, int age, double weight) {
		super("개", age, weight);
		this.name = name;
		this.dogBreed = dogBreed;
	}
	
	@Override
	public void info() {
		System.out.printf("종: %s / 견종: %s / 나이: %d살 / 몸무게: %.1fkg\n", species, dogBreed, age, weight);
	}
	
	public void dogName() {
		System.out.printf("강아지(%s)의 이름은 %s입니다.\n", dogBreed, name);
	}
	
	
}
