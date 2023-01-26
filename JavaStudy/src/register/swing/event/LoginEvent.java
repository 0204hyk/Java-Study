package register.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import database.OjdbcConnection;
import register.db.DBConnection;
import register.swing.component.logincomponent.LoginTextFields;

public class LoginEvent implements ActionListener{
	
	JTextField mem_id;
	JPasswordField mem_pw;
	
	public LoginEvent(JTextField mem_id, JPasswordField mem_pw) {
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String Sql = "SELECT mem_id, mem_pw FROM members WHERE mem_id = ? AND mem_pw = ?";
		
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(Sql);
		) {
			pstmt.setString(1, mem_id.getText());
			pstmt.setString(2, new String(mem_pw.getPassword()));
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString("mem_id").equals(mem_id.getText()) 
					&& rs.getString("mem_pw").equals(new String(mem_pw.getPassword()))) {
					JOptionPane.showMessageDialog(null, "로그인 성공", "로그인", 1);
				}
			} else {
				JOptionPane.showMessageDialog(null, "로그인 실패", "로그인", 0);
			}
			rs.close();
		} catch (SQLException error) {
			error.printStackTrace();
		}
		mem_id.setText(null);
		mem_pw.setText(null);

	}
	
}
