package phonebook;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookInfo {
	Scanner sc = new Scanner(System.in);
	
	String group;
	String phoneNumber;
	String name;
	
	public PhoneBookInfo(String group, String phoneNumber, String name) {
		this.group = group;
		this.phoneNumber = phoneNumber;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", name, phoneNumber, group);
	}
	
}

