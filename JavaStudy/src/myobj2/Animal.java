package myobj2;

public class Animal {
	String species;
	int age;
	double weight;
	
	public Animal(String species, int age, double weight) {
		this.species = species;
		this.age = age;
		this.weight = weight;
	}
	
	public void info() {
		System.out.printf("종: %s / 나이: %d살 / 몸무게: %.1fkg\n", species, age, weight);
	}
}
