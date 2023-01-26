package quiz;

import phonebook.PhoneBook;
import phonebook.PhoneBookInfo;

public class D08_PhoneBook {
	/*
	 	# HashMap을 이용해 전화번호부를 구현해보세요
	 	
	 	 1. [그룹명/전화번호/개인정보]를 저장해야 한다.
	 	 2. 전화번호부 해쉬맵에 그룹명을 키값으로 넣으면 해당 그룹의 해쉬맵을 꺼낼 수 있다.
	 	 3. 꺼낸 그룹맵에 전화번호를 키값으로 넣으면 그 사람의 개인정보 DTO를 꺼낼 수 있다.
	 	 
	 	# 구현해야 할 메서드
	 	
	 	 1. 새로운 그룹을 추가하는 메서드
	 	 2. 그룹에 전화번호 및 개인정보를 추가하는 메서드
	 	 3. 이름의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
	 	 4. 전화번호의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
	 	 5. 등록된 모든 정보를 그룹명 순으로 출력, 같은 그룹 내에서는 이름 기준 오름차순으로 출력하는 메서드
	 	 
	 	// HashMap<String, HashMap<String, PhoneBookInfo>> phonebook; 의 형식
	 */
	
	
	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		
		// boolean으로 메서드를 생성하면 추후에 이런 식의 기능을 사용할 수 있다.
//		if (pb.addGroup("가족")) {
//			System.out.println("그룹 추가 성공");
//		} else {
//			System.out.println("그룹 추가 실패");
//		}
		
		// 그룹 추가
		pb.addGroup("가족");
		pb.addGroup("가족");
		
		pb.addGroup("친구");
		
		// 개인정보 추가
		pb.addPerson(new PhoneBookInfo("가족", "010-1234-1234", "할머니"));
		pb.addPerson(new PhoneBookInfo("가족", "010-1234-1235", "할아버지"));
		pb.addPerson(new PhoneBookInfo("가족", "010-1234-1236", "외삼촌"));
		pb.addPerson(new PhoneBookInfo("가족", "010-1234-1237", "고모"));
		pb.addPerson(new PhoneBookInfo("가족", "010-1234-1238", "숙모"));
		pb.addPerson(new PhoneBookInfo("친구", "010-1234-1239", "김이슬"));
		pb.addPerson(new PhoneBookInfo("친구", "010-1234-1240", "최이슬"));
		pb.addPerson(new PhoneBookInfo("친구", "010-1234-1241", "박이슬"));
		pb.addPerson(new PhoneBookInfo("친구", "010-1234-1242", "권이슬"));
		pb.addPerson(new PhoneBookInfo("친구", "010-1234-1243", "김성모"));
		pb.addPerson(new PhoneBookInfo("친구", "010-1234-1244", "김성근"));
		
		// 이름 검색
		pb.searchByName("김");
		pb.searchByName("이슬");
		pb.searchByName("모");
		pb.searchByName("할");
		
		// 번호 검색
		pb.searchByPhoneNumber("124");
		
		// 전부 출력 (그룹명 기준 오름차순, 같을 경우 이름명 기준 오름차순)
		pb.printAll();

	}
}
