package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import myobj2.parking.Car;
import myobj2.parking.CarType;

public class D14_ParkingSystemSolve {
	
	public static String checkRestricted(Car car, LocalDate date) {
		// CarType은 생성자로 생성할 수 없고 
		// 공공자원인 static 인스턴스 4개를 계속 재활용하므로 equals로 비교하지 않아도 같은 위치를 가리킨다.
		if (car.getType() == CarType.DISABLED) {
			return String.format("[%s] 장애인 차량은 차량5부제 제외차량입니다.", car);
		} else if (car.getType() == CarType.KID) {
			return String.format("[%s] 유아동승 차량은 차량5부제 제외차량입니다.", car);
		} else if (car.getType() == CarType.LIGHTCAR) {
			return String.format("[%s] 경차는 차량5부제 제외차량입니다.", car);
		}
		
		char lastNum = car.getNumber().charAt(car.getNumber().length() - 1);
		
		// ※ &&는 ||보다 먼저 연산되므로 주의해야한다.
		if ((lastNum == '1' || lastNum == '6') && date.getDayOfWeek() == DayOfWeek.MONDAY) {
			
		} else if ((lastNum == '2' || lastNum == '7') && date.getDayOfWeek() == DayOfWeek.TUESDAY) {
			
		} else if ((lastNum == '3' || lastNum == '8') && date.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
			
		} else if ((lastNum == '4' || lastNum == '9') && date.getDayOfWeek() == DayOfWeek.THURSDAY) {
			
		} else if ((lastNum == '5' || lastNum == '0') && date.getDayOfWeek() == DayOfWeek.FRIDAY) {
			
		} else {
			return String.format("[%s]는 %s에 주차 가능합니다.", 
					car, date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		}
		
		return String.format("[%s]는 %s에 주차금지 입니다.", 
				car, date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
	}
	
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>(10);
		
		for (int i = 0; i < 10; ++i) {
			cars.add(new Car());
		}
		
		LocalDate checkDay = LocalDate.now();
		final int A_WEEK = 7;
		
		for (int i = 0; i < A_WEEK; ++i) {
			System.out.println(checkDay.getDayOfWeek() + " TEST: ");

			for (Car car : cars) {
				//test
				String result = checkRestricted(car, checkDay);
				System.out.println("\t" + result);
			}
			checkDay = checkDay.plusDays(1);
		}
		
	}

}
