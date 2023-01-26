package database.model;

public class Fruit {
	// DB에서 가져온 데이터에는 null이 포함될 수 있기 때문에
	// 기본형보다는 참조형 타입을 사용하는 것이 마음 편하다 (int -> Integer, double -> Double)
	private String name;
	private Double sweet;
	private Integer price;
	private String country_id;
	private String fruit_grade;
	
	// 기본 생성자가 존재하는 것이 좋다. (아무것도 안적혀 있더라도)
	public Fruit() {}
	
	public Fruit (String name, Double sweet, Integer price, String country_id, String fruit_grade) {
		this.name = name;
		this.sweet = sweet;
		this.price = price;
		this.country_id = country_id;
		this.fruit_grade = fruit_grade;
	}
	
	// 우클릭 -> Source -> Generate Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSweet() {
		return sweet;
	}

	public void setSweet(Double sweet) {
		this.sweet = sweet;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getFruit_grade() {
		return fruit_grade;
	}

	public void setFruit_grade(String fruit_grade) {
		this.fruit_grade = fruit_grade;
	}

	@Override
	public String toString() {
		return String.format("%s/%.2f", name, sweet);
	}
	

}
