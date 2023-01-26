package quiz;

public class A04_Gildong {
	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 20;
		String tel = "010-1234-1234";
		double height = 178.5;
		double weight = 75; //몸무게는 보통 소수점까지 나오므로 실수 타입으로 저장
		String blood_type = "O"; //혈액형은 2글자인 경우도 있으므로 char이 아닌 String
		
		System.out.println("============ 출력결과 ============");
		System.out.println("");
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + "만 " + age + "세");
		System.out.println("Tel\t: " + tel);
		System.out.println("키\t: " + height +"cm");
		System.out.println("몸무게\t  : " + weight + "kg");
		System.out.println("혈액형\t  : " + blood_type + "형");
	}
	
}
