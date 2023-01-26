package myobj;

public class CoffeeBean {

	static String[] variousNames = {"아라비카", "로부스타", "리베리카"};
	static String[] countryNames = {"브라질", "베트남", "콜롬비아", "인도네시아", "에티오피아", "온두라스", "인도"};
	
	int various;
	int country;
	
	// static 영역에서 해당클래스의 인스턴스를 미리 만들어 놓을 수 있다.
	public static CoffeeBean BRAZILIAN_ARABICA = new CoffeeBean(0, 0);
	public static CoffeeBean COLOMBIAN_ROBISTA = new CoffeeBean(1, 2);
	
	public CoffeeBean(int various, int country) {
		this.various = various;
		this.country = country;
	}
	
	public void info() {
		System.out.printf("품종: %s, 생산국: %s\n", variousNames[various], countryNames[country]);
	}
}
