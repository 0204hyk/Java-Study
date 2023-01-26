package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.model.Fruit;

public class J05_DataModelClass {
	
	public static void main(String[] args) {
		// DB에서 꺼내온 데이터는 해당 테이블의 데이터를 담을 수 있는
		// 데이터 모델 클래스에 보관하는 것이 좋다.
		
		/*
		  	# 데이터 모델 클래스
		  	
		  	 - 데이터를 담아놓은 용도인 클래스 (DTO, Data Transfer Object)
		  	 - 필드값에 그냥 접근하도록 허용하지 않고 getter와 setter를 이용해 접근하도록 한다.
		  	 - getter만 달아 놓으면 읽기 전용 데이터 클래스가 된다. (VO, Value Object)
		  	 - setter를 달아 놓으면 수정이 가능한 필드가 된다. 
		 */
		
		List<Fruit> fruits = new ArrayList<>();
		
		try (
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM fruits");
				ResultSet rs = pstmt.executeQuery();
		) {
			
			while (rs.next()) {
				Fruit f = new Fruit();
				
				f.setName(rs.getString("name"));
				f.setSweet(rs.getDouble("sweet"));
				f.setPrice(rs.getInt("price"));
				f.setCountry_id(rs.getString("country_id"));
				f.setFruit_grade(rs.getString("fruit_grade"));
				
				fruits.add(f);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB 연결 부분에서 활용하기 보다는 컬렉션에 담아놓은 후 활용하는 것이 좋다.
		System.out.println(fruits);
	}
}
