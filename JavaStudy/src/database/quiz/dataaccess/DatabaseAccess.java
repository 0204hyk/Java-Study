package database.quiz.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import database.quiz.datamodel.GameUser;

public class DatabaseAccess {
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String id = "testuser";
	private static String password = "1234";
		
	// 아이템 데이터 모델을 만들어서 <Item>으로 받는게 더 좋은 방법
	private static List<Integer> boxItems = new ArrayList<>();

	// 드라이버 호출은 프로그램 실행 시 최초 1번이면 충분하다. (스태틱 초기화 블럭)
	/*
	 	- 스태틱 초기화 블럭은 클래스가 로딩될 때 호출되며 따라서 각 클래스당 최초 1회만 실행된다.
		- 스태틱 블럭은 객체가 생성되기 이전에 수행되므로 인스턴스 멤버에 접근할 수 없다.
		- 클래스가 로딩 될 때 복잡한 초기화 과정을 수행해야 할 때 사용할 수 있다.
	 */
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 최초의 DB Access 발생 시 아이템 뽑기 배열 생성
		try (
			Connection conn = DriverManager.getConnection(url, id, password);
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM item");
			ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				// 확률만큼 뽑기 배열에 추가하여 확률 생성
				int prob = Math.round(rs.getFloat("probability") * 100); 
				
				for (int i = 0; i < prob; ++i) {
					boxItems.add(rs.getInt("item_id"));
				}
				
			}
			// 아이템들이 순차적으로 들어간 배열 섞기
			Collections.shuffle(boxItems);
			
//			System.out.println(boxItems);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static GameUser login(String userId, String userPassword) {
		String sql = "SELECT * FROM gameuser WHERE user_id = ?";
		try (
			Connection conn = DriverManager.getConnection(url, id, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setString(1, userId);
			
			try (ResultSet rs = pstmt.executeQuery()) {
				// datamodel에서 만든 GameUser 생성
				GameUser user = null;
				if(rs.next()) {
					user = new GameUser(
							rs.getInt(1), 
							rs.getString(2), 
							rs.getString(3), 
							rs.getInt(4));
				}
				
				// userId의 사용자가 없어서 조회가 안된 경우
				if (user == null) {
					return null;
				} else {
					if (user.getUser_password().equals(userPassword)) {
						// 비밀번호 맞춰서 로그인에 성공하는 경우 정보를 리턴
						return user;
					} else {
						// 비밀번호 틀려서 로그인 실패하는 경우 null을 리턴
						return null;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void openBox(GameUser user) {
		int gold = user.getGold();
		
		if (gold < 1000) {
			System.out.println("소지금이 부족합니다...");
			return;
		}
		
		// 1. DB의 소지금을 감소하고
		// 2. 아이템 목록에 추가
		String reduceGold = "UPDATE gameuser SET gold = gold - 1000 WHERE user_num = ?";
		String addOwnItem = "INSERT INTO ownitem VALUES(ownitem_seq.nextval,?,?,sysdate)";
		String getItem = "SELECT * FROM item WHERE item_id = ?";
		try(
			Connection conn = DriverManager.getConnection(url, id, password);
			PreparedStatement pstmt1 = conn.prepareStatement(reduceGold);
			PreparedStatement pstmt2 = conn.prepareStatement(addOwnItem);
			PreparedStatement pstmt3 = conn.prepareStatement(getItem);
		){
			// 확률대로 뽑은 아이템의 번호
			int item_id = boxItems.get((int)(Math.random() * boxItems.size()));
			
			// ? 채우기
			pstmt1.setInt(1, user.getUser_num());
			pstmt2.setString(1, user.getUser_id());
			pstmt2.setInt(2, item_id);
			pstmt3.setInt(1, item_id);
			
			// 다 만든 쿼리문 실행하여 DB에 반영하기
			pstmt1.executeUpdate();
			pstmt2.executeUpdate();
			
			// 뽑은 아이템 정보 가져와서 출력해주기
			ResultSet rs = pstmt3.executeQuery();
			rs.next();
			System.out.printf("%s님이 %s를 뽑으셨습니다.\n", 
					user.getUser_id(), rs.getString("item_name"));
			
			user.setGold(gold - 1000);
			// auto close로 안 닫았을 시 수동으로 닫아줘야함
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// 뽑은 아이템 목록 출력 메서드 만들기
	public static void listPrint(GameUser user) {
		String list = "SELECT * FROM ownitem "
				+ "INNER JOIN gameuser  USING(user_id) "
				+ "INNER JOIN item USING (item_id)";
		
		try (
			Connection conn = DriverManager.getConnection(url, id, password);
			PreparedStatement pstmt = conn.prepareStatement(list);
		) {
			System.out.printf("-- \"%s\"님이 뽑은 아이템 목록 --\n", user.getUser_id());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.printf(" %s /  %6s  / %s\n", rs.getInt("own_id"), rs.getString("item_name"), rs.getDate("own_date"));
			}
			System.out.println("------------------------------");
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
