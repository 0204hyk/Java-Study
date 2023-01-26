package register;

import register.swing.LoginFrame;
import register.swing.RegisterFrame;

public class J10_Register {
	/*
 	회원가입을 받을 수 있는 창을 만들고 회원의 다양한 정보를 입력받아 정보를 DB에 저장해보세요
 	
 	(1) ID, 이름, 나이, 주민등록번호 맨 앞자리까지, 관심분야, SNS 수신 동의 여부, 이메일, 핸드폰 번호
 	
 	(2) 입력한 내용에 대한 유효성 검사를 구현할 것
 	
 	(3) 비밀번호는 암호화 하여 DB에 저장할 것 (암호화는 구글링 가능)
 	
 	(4) 로그인 기능을 구현하여 ID, PASSWORD가 일치하면 로그인 성공이라고 메시지를 띄워줄 것
 	
	*/
	public static void main(String[] args) {
		new LoginFrame();
	}
}
