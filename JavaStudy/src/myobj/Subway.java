package myobj;

public class Subway {
	
	public String[] stations;
	public int line;
	public int current_station;
	
	// 현재 방향을 나타내는 값
	public boolean direction = true;
	
	// 해당 열차가 순환선인지를 나타내는 값
	public boolean rotate;
	
	// 생성자 (클래스 이름과 같아야함, 리턴 타입 없음)
	public Subway() {
	}
	
	public Subway(int line, boolean direction, boolean rotate, String[] stations) {
		this.line = line;
		this.direction = direction;
		this.rotate = rotate;
		this.stations = stations;
	}
	
	// ※ 인스턴스 메서드를 만들 때는 static을 사용하지 않는다.
	
	// 열차의 현재 위치를 실제로 다음 역으로 변경하는 메서드
	public void next() {
		current_station = rotate ? nextRotateStation(): nextStation();
	}
	
	// 다음 역이 무엇인지 계산하여 반환하는 메서드
	public int nextStation() {
		if(current_station == stations.length - 1) {
			direction = false;
		} else if (current_station == 0) {
			direction = true;
		}		
		
		return current_station + (direction? 1 : -1);
	}
	
	public int nextRotateStation() {
		if (direction && current_station == stations.length - 1) {
			return 0;
		} else if (!direction && current_station == 0) {
			return stations.length - 1;
		}
		
		return current_station + (direction? 1 : -1);
	}
	
	public void infomation() {
		System.out.println("------------------------------------");
		System.out.printf("이 열차는 %d호선 열차입니다.\n", line);
		System.out.printf("현재 역은 %s역 입니다.\n", stations[current_station]);
		System.out.printf("다음 역은 %s역 입니다.\n", stations[rotate ? nextRotateStation(): nextStation()]);
		System.out.println("------------------------------------");
	}
	

}
