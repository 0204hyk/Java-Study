import java.util.Date;

public class D12_Date {
	/*
	 	# java.util.Date
	 	
	 	 - 시간 및 날짜 정보를 저장해놓을 수 있는 클래스
	 	 - 오래된 클래스이기 때문에 메서드는 잘 사용하지 않는다.
	 	 - 주로 시간 데이터를 담아놓는 DTO의 용도로 사용한다.
	 */
	public static void main(String[] args) {
		
		// 아무것도 안넣으면 지금 시간
		Date date = new Date();
		System.out.println(date);
		
		// long타입 값을 전달하면 Unix Time으로 생성
		Date date2 = new Date(2000L);
		System.out.println(date2);
		
		/*
		 	System.currentTimeMillis() : 시스템으로부터 유닉스 타임을 받아옴
		 	※ 유닉스 타임 - 1970년 1월 1일 9시 이후로 시간이 얼마나 흘렀는지를 1/1000초로 센 것
		 */
		Long unixTime = System.currentTimeMillis();
		Date now = new Date(unixTime);
		
		System.out.println("Unix Time: " + unixTime);
		System.out.println("Date: " + now);
		
		// Date 타입 간 시점 비교가 가능
		System.out.println("date2 after now?" + date2.after(now));
		System.out.println("date2 before now?" + date2.before(now));
		
		date2.setTime(1000L * 60 * 60 * 24 * 365 * 30);
		System.out.println(date2);
	}
}
