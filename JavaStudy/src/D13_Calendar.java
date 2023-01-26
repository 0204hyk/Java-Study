import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class D13_Calendar {
	/*
	 	# java.util.Calendar
	 	
	 	 - 달력을 구현한 클래스
	 	 - 날짜 및 시간을 손쉽게 계산할 수 있는 기능들이 있다.
	 	 - 생성자 대신 getInstance()라는 스태틱 메서드를 사용한다.
	 	 - 타임존을 설정해 다른 국가의 시간으로 설정할 수도 있다.
	 */
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		// get() : 생서된 Calendar 인스턴스에서 다양한 정보를 얻어낼 수 있다.
		System.out.println(now);
		System.out.println(now.get(Calendar.ERA));
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) + 1);	// ※ month는 0부터 시작함
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.HOUR));	// 12H
		System.out.println(now.get(Calendar.HOUR_OF_DAY));	// 24H
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		System.out.println(now.get(Calendar.MILLISECOND));
		System.out.println("----------------------------------------");
		System.out.println("일주일 중 몇 번째 날인가? (요일)");
		System.out.println("일요일: " + Calendar.SUNDAY);
		System.out.println("월요일: " + Calendar.MONDAY);
		System.out.println("화요일: " + Calendar.TUESDAY);
		System.out.println("수요일: " + Calendar.WEDNESDAY);
		System.out.println("목요일: " + Calendar.THURSDAY);
		System.out.println("금요일: " + Calendar.FRIDAY);
		System.out.println("토요일: " + Calendar.SATURDAY);
		System.out.println("day of week: " + now.get(Calendar.DAY_OF_WEEK));
		System.out.println();
		System.out.println("이번달의 몇 번째 해당 요일인가? (ex: 두 번째 목요일)");
		System.out.println("day of week in month: " + now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println();
		System.out.println("이번달의 몇 번째 날인가? (==DATE)");
		System.out.println("day of month: " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println();
		System.out.println("올해의 몇 번째 날인가?");
		System.out.println("day of year: " + now.get(Calendar.DAY_OF_YEAR));
		System.out.println();
		System.out.println("올해의 몇 번째 주인가?");
		System.out.println("week of year: " + now.get(Calendar.WEEK_OF_YEAR));
		System.out.println();
		System.out.println("이번 달의 몇 번째 주인가?");
		System.out.println("week of month: " + now.get(Calendar.WEEK_OF_MONTH));
		System.out.println();
		System.out.println("오전이냐 오후냐?");
		System.out.println("AM_PM: " + now.get(Calendar.AM_PM));
		System.out.println("get()에 사용하는 AM_PM의 실제 필드값: " + Calendar.AM_PM);
		System.out.println("오전: " + Calendar.AM);
		System.out.println("오후: " + Calendar.PM);
		
		// add(field_constant, value) : 원하는 필드에 원하는만큼 값을 더한다. (음수 입력시 감소)
		now.add(Calendar.MONTH, 5);
		now.add(Calendar.DATE, 3);
		now.add(Calendar.HOUR, 7);
		System.out.println(now.get(Calendar.MONTH));
		System.out.println("요일: " + now.get(Calendar.DAY_OF_WEEK));
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		
		// set(field_constant, value) : 해당 필드값을 수정
		now.set(Calendar.DATE, 57);
		
		// 어떤 필드가 수정되었을 때 다른 필드들도 함께 값을 조정한다
		System.out.printf("%d년 %s %d일 %s %d:%d:%d.%d %s \n",
				now.get(Calendar.YEAR),
				now.getDisplayName(Calendar.MONTH, Calendar.SHORT_FORMAT, Locale.CANADA),
				now.get(Calendar.DATE),
				now.get(Calendar.AM_PM) == 0? "AM" : "PM",
				now.get(Calendar.HOUR),
				now.get(Calendar.MINUTE),
				now.get(Calendar.SECOND),
				now.get(Calendar.MILLISECOND),
				now.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.KOREAN));
		
		// Calendar 인스턴스에 저장된 값 쉽게 출력하기
		// (필요한 날짜 형식 서식 문자는 구글링)
		SimpleDateFormat myDateFormat = new SimpleDateFormat("yy-MM-dd a hh:mm:ss.SSS EE");
		
		// Date타입으로 변환하여 전달
		Date date = now.getTime();
		String result = myDateFormat.format(date);

		System.out.println(result);

	}
}
