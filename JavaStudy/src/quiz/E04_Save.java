package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E04_Save {
	/*
	 	(1) 컴퓨터와 진행하는 간단한 가위바위보 게임을 하나 만든 후
	 	
	 	(2) 프로그램 종료 시 전적을 파일에 저장하고
	 	
	 	(3) 프로그램 실행 시에는 파일에 저장된 전적 데이터를 읽어
	 	    예전 전적이 그대로 이어지도록 만들어보세요
	 */
	
	/**
	 * @return 0 플레이어 승리, 1 무승부, 2 플레이어 패배
	 */
	
	
	public static int game() {
		return (int)(Math.random() * 3);
	}
	
	public static void main(String[] args) {
		int[] record = new int [3];
		
		// 전적을 불러와야한다. (Load)
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("myFiles/save.game");
			
			record[0] = in.read();
			record[1] = in.read();
			record[2] = in.read();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) in.close();				
			} catch (IOException e) {
				
			}
		}
		
		System.out.println("불러온 전적: " + Arrays.toString(record));
		System.out.println("게임 시작!");
		
		// FileOutputStream, FileInputStream은 데이터를 바이트 단위로 저장하기 때문에
		// 저장할 수 있는 범위가 매우 한정적이다.
		for (int i = 0; i < 1000; ++i) {
			int result = game();
			System.out.println("결과: " + result);
			
			record[result] += 1;
		}
		
		System.out.println("전적: " + Arrays.toString(record));
		
		// 전적을 저장하고 마무리 해야한다. (Save)
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("myFiles/save.game");
			out.write(record[0]);
			out.write(record[1]);
			out.write(record[2]);
			
		} catch (Exception e) {
			System.out.println("스트림 생성 또는 쓰기 도중 에러 발생");
		} finally {
			try {
				if (out != null) out.close();
			} catch (IOException e) {
				System.out.println("닫기 도중 에러 발생");
			}
		}
	}
}
