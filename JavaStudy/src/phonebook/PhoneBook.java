package phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
 	HashMap<String, HashMap<String, PhoneBookInfo>> phonebook = new HashMap<>();
 	Scanner sc = new Scanner(System.in);
	
	public PhoneBook() {
		
	}
	
	public boolean addGroup(String groupName) {
		if (!phonebook.containsKey(groupName)) {
			phonebook.put(groupName, new HashMap<>());
			System.out.printf("그룹 [%s]을 성공적으로 생성했습니다.\n", groupName);
			return true;
		}
		System.out.println("이미 존재하는 그룹입니다.");
		return false;
	}
	
	public boolean personAlreadyExistOtherGroup(PhoneBookInfo info) {
		boolean exist = false;
		
		for(String groupName : phonebook.keySet()) {
			if (groupName.equals(info.group)) {
				continue;
			}
			HashMap<String, PhoneBookInfo> groupMap = phonebook.get(groupName);		

			exist = exist || groupMap.containsKey(info.phoneNumber);	// ex > false || true 는 true
		}
		return exist;
	}

	public boolean addPerson(PhoneBookInfo info) {
		if (personAlreadyExistOtherGroup(info)) {
			System.out.println("다른 그룹에 이미 등록된 전화번호입니다.");
			return false;
		}
		
		if (phonebook.containsKey(info.group)) {
			HashMap<String, PhoneBookInfo> groupMap =
					phonebook.get(info.group);
			
			if (groupMap.containsKey(info.phoneNumber)) {
				System.out.printf("'%s'님의 정보를 수정했습니다.\n", info.name);
			} else {
				System.out.println("새로운 정보를 등록했습니다.");
			}
			groupMap.put(info.phoneNumber, info);
			return true;
		} else {
			System.out.println("해당 그룹이 존재하지 않아 추가 실패");
			return false;			
		}
	}
	
	public void searchByName(String nameFrag) {
		for (HashMap<String, PhoneBookInfo> group : phonebook.values()) {
			for (PhoneBookInfo info : group.values()) {
				if (info.name.contains(nameFrag)) {
					System.out.println(info);					
				}
			}
		}
	}
	
	public void searchByPhoneNumber(String phoneNumberFrag) {
		for (HashMap<String, PhoneBookInfo> group : phonebook.values()) {
			for (PhoneBookInfo info : group.values()) {
				if (info.phoneNumber.contains(phoneNumberFrag)) {
					System.out.println(info);
				}
			}
		}
	}
	
	public void printAll() {
		List<PhoneBookInfo> allInfo = new ArrayList<>();
		
		for (HashMap<String, PhoneBookInfo> group : phonebook.values()) {
			for (PhoneBookInfo info : group.values()) {
				allInfo.add(info);
			}
		}
		
		Collections.sort(allInfo, new Comparator<PhoneBookInfo>() {
			public int compare(PhoneBookInfo i1, PhoneBookInfo i2) {
				int r1 = i1.group.compareTo(i2.group);
				
				if (r1 == 0) {
					return i1.name.compareTo(i2.name);
				} else {
					return r1;
				}
			};
		});
		
		System.out.println("### Print All Info ###");
		for (PhoneBookInfo info : allInfo) {
			System.out.println(info);
		}
		
	}
	
}	
