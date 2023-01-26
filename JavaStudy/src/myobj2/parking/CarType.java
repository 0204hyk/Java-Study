package myobj2.parking;

public class CarType {
	public static CarType NORMAL = new CarType(0);
	public static CarType DISABLED = new CarType(1);
	public static CarType KID = new CarType(2);
	public static CarType LIGHTCAR = new CarType(3);
	
	private static String[] displayNames = {"일반", "장애인", "유아동승", "경차"};
	
	int value;
	
	private CarType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getDisplayName() {
		return displayNames[value];
	}
}
