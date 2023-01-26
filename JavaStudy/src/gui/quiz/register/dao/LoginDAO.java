package gui.quiz.register.dao;

import gui.quiz.register.module.PasswordEncryption;

public class LoginDAO {
	
	public boolean login(String id, char[] password) {
		// DB에 저장된 암호화된 비밀번호와 로그인창에 입력한 비밀번호를 암호화한 결과가 같으면 로그인 성공
		String sql = "SELECT password FROM member WHERE mem_id = ?";
		
		PasswordEncryption.encrypt(password);
		
		return true;
	}
	
}
