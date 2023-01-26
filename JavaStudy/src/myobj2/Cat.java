package myobj2;

public class Cat extends Animal {
	String name;
	String catBreed;
	
	public Cat(String name, String catBreed, int age, double weight) {
		super("고양이", age, weight);
		this.name = name;
		this.catBreed = catBreed;
	}
	
	@Override
	public void info() {
		System.out.printf("종: %s / 묘종: %s / 나이: %d살 / 몸무게: %.1fkg\n", species, catBreed, age, weight);
	}
	
	public void catName() {
		System.out.printf("고양이(%s)의 이름은 %s입니다.\n", catBreed, name);
	}
	
	
}
