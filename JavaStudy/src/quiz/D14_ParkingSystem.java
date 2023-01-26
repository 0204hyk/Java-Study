package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class D14_ParkingSystem {
		
	public static int getCarNum() {
		Scanner sc = new Scanner(System.in);
		int carNum;
		
		while (true) {
			System.out.print("차량번호 >> ");
			carNum = sc.nextInt();
			
			if (carNum < 1000 || carNum > 9999) {
				System.out.println("차량번호를 다시 입력하세요");
				continue;
			}
			break;
		}
		return carNum;
	}
	
	public static List<LocalDate> getHoliday() {
		List<LocalDate> holiday = new ArrayList<>();
		
		holiday.add(LocalDate.of(0, 1, 1));
		holiday.add(LocalDate.of(0, 3, 1));
		holiday.add(LocalDate.of(0, 5, 5));
		holiday.add(LocalDate.of(0, 6, 6));
		holiday.add(LocalDate.of(0, 8, 15));
		holiday.add(LocalDate.of(0, 10, 3));
		holiday.add(LocalDate.of(0, 10, 9));
		holiday.add(LocalDate.of(0, 12, 25));
		
		return holiday;
	}
	
	public static void parkingPossible () {
		int carNum = getCarNum();
		List<LocalDate> holiday = getHoliday();
		LocalDate today = LocalDate.now();
		
		for (int i = 0; i < 365; ++i) {
			LocalDate daysLater = today.plusDays(i);
			DayOfWeek dayOfWeek = daysLater.getDayOfWeek();
			boolean weekendHoliday = false;
			
			for (int j = 0; j < holiday.size(); ++j) {
				if (holiday.get(j).getMonth() == daysLater.getMonth()
						&& holiday.get(j).getDayOfMonth() == daysLater.getDayOfMonth()) {
					System.out.printf(daysLater + " (%s)\n주차 가능 (※ 공휴일은 요일제 적용 제외)\n", 
							daysLater.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
					weekendHoliday = true;
				} 
			}
			
			if (dayOfWeek == DayOfWeek.MONDAY && (carNum % 10 == 1 || carNum % 10 == 6)) {
				System.out.println(daysLater + " (월요일) \n끝자리가 1, 6인 차량은 주차불가");
			} else if (dayOfWeek == DayOfWeek.TUESDAY && (carNum % 10 == 2 || carNum % 10 == 7)) {
				System.out.println(daysLater + " (화요일) \n끝자리가 2, 7인 차량은 주차불가");
			} else if (dayOfWeek == DayOfWeek.WEDNESDAY	&& (carNum % 10 == 3 || carNum % 10 == 8)) {
				System.out.println(daysLater + " (수요일) \n끝자리가 3, 8인 차량은 주차불가");
			} else if (dayOfWeek == DayOfWeek.THURSDAY && (carNum % 10 == 4 || carNum % 10 == 9)) {
				System.out.println(daysLater + " (목요일) \n끝자리가 4, 9인 차량은 주차불가");
			} else if (dayOfWeek == DayOfWeek.FRIDAY && (carNum % 10 == 5 || carNum % 10 == 0)) {
				System.out.println(daysLater + " (금요일) \n끝자리가 5, 0인 차량은 주차불가");
			} else if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY	
					&& !weekendHoliday) {
				System.out.printf(daysLater + "(%s)\n주차 가능 (※ 주말은 요일제 적용제외)\n",
						daysLater.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
			} else if (!weekendHoliday){
				System.out.printf(daysLater + "(%s)\n주차 가능\n",
						daysLater.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
			}
		}
	}
	
	public static void main(String[] args) {
		
		parkingPossible();
	
	}
}
