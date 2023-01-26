package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class D13_PizzaDay {
	/*
	 	오늘로부터 1년간의 이벤트 날짜를 모두 출력해주는 프로그램을 만들어보세요
	 	
	 	파파스데이 : 매월 18일
	 	파파프라이데이 : 홀수번째 금요일
	 	
	 	※ 겹치는 경우 둘 모두 적용됨을 알려줘야함
	 */
	public static boolean checkPapasDay(Calendar toCheck) {
		return toCheck.get(Calendar.DATE) == 18;
	}
	
	public static boolean checkPapaFriday(Calendar toCheck) {
		return toCheck.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY
				&& toCheck.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 1;
	}
	
	public static void printEventDays(Calendar start) {
//		Calendar event = start;		// 얕은 복사 (원본의 값도 바뀜)
		Calendar event = (Calendar)start.clone();	// 깊은 복사 (원본을 훼손시키지 않음)
		SimpleDateFormat eventDayFormat = new SimpleDateFormat("yy-MM-dd");
			
		for (int i = 0; i < 365; ++i) {
			event.add(Calendar.DATE, 1);
			System.out.print(eventDayFormat.format(event.getTime()) + " - ");
			
			boolean eventExist = false;
			boolean otherEventExist = false;
			
			if (checkPapasDay(event)) {
				System.out.print("파파스데이");
				eventExist = true;
				otherEventExist = true;
			} 
			
			if (checkPapaFriday(event)) {
				if (otherEventExist) {
					System.out.print(", 파파프라이데이 (※ 중복 적용 가능)");					
				} else {
					System.out.print("파파프라이데이");
				}
				eventExist = true;
			}
			
			if (!eventExist) {
				System.out.print("X");
			}
			
			System.out.println();
					
//			Date date = event.getTime();
//			
//			if (event.get(Calendar.DAY_OF_MONTH) == 18 
//					&& event.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 != 0 
//					&& event.get(Calendar.DAY_OF_WEEK) == 6) {
//				System.out.printf("%s 파파스데이, 파파프라이데이가 모두 적용됩니다!!!!\n",
//						eventDayFormat.format(date));
//			} else if (event.get(Calendar.DAY_OF_MONTH) == 18) {
//				System.out.printf("%s 파파스데이 입니다!\n", eventDayFormat.format(date));
//			} else if (event.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 != 0 
//					&& event.get(Calendar.DAY_OF_WEEK) == 6) {
//				System.out.printf("%s %d번째 금요일로, 파파프라이데이입니다!\n",
//						eventDayFormat.format(date), event.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//			}			
		}
	}
	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		printEventDays(today);
		
		// 메서드 내에서 깊은 복사를 했기때문에 원본의 연도가 변하지 않는다.
		System.out.println("메서드를 실행한 후의 today: " + today.get(Calendar.YEAR));
		
	}
}
