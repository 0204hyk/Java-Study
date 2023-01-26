import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class E05_CharacterStream {
	/*
	 	# InputStream/OutputStream
	 	
	 	 - byte 단위로 데이터를 입/출력하는 클래스
	 	 - byte로 분해되어 있는 데이터를 다른 타입으로 직접 변화시켜야 해서 불편하다.
	 	
	 	# Reader/Writer
	 	
	 	 - char 단위로 데이터를 입/출력하는 클래스
	 	 - byte를 char로 합치거나 char를 byte로 분해하는 기능이 구현되어 있다.
	 	 
	 	# Charset
	 	 
	 	 - ASCII코드까지는 모든 Charset이 동일하지만, 그 이후로는 각 회사마다 문자코드가 다르다.
	 	 - MS949 : windows에서 사용하는 마이크로소프트의 문자셋
	 	 - EUC-KR : 이클립스가 기본적으로 사용하는 문자셋 (유효한 한국어만 사용. 뙗,뺡 ... X)
	 	 - UTF-8 : 가장 표준이 되는 문자셋으로 모든 문자를 포함하고 있어 용량이 크다.
	 */
	public static void main(String[] args) {
		byte[] data1 = "Hello!!".getBytes();
		byte[] data2 = null;
		byte[] data3 = null;
		byte[] data4 = null;
				
		try {
			data2 = "안녕하세요!!".getBytes("MS949");
			data3 = "안녕하세요!!".getBytes("EUC-KR");
			data4 = "안녕하세요!!".getBytes("UTF-8");
			
			//ASCII 코드까지는 인코딩 타입(Charset)이 필요 없다.
			System.out.println(Arrays.toString(data1));
			
			// char를 byte로 분해할 때 사용하는 Charset에 따라 결과가 다를 수 있다.
			// ※ 인코딩(Encoding) : char를 byte로 분해하는 작업
			System.out.println("MS949" + Arrays.toString(data2));
			System.out.println("EUC-KR" + Arrays.toString(data3));
			System.out.println("UTF-8" + Arrays.toString(data4));
			
		} catch (UnsupportedEncodingException e) {
			System.out.println("잘못된 인코딩 타입: " + e.getMessage());
		}
		
		// byte[]을 다시 합칠때도 분해할 때 사용했던 타입을 사용해야 제대로 합칠 수 있다.
		try {
			System.out.println(new String(data1));
			System.out.println(new String(data2, "MS949"));
			System.out.println(new String(data3, "EUC-KR"));
			System.out.println(new String(data4, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			System.out.println("지원하지 않는 인코딩 타입: " + e.getMessage());
		}
		
		// FilesWriter - File에 char단위로 쓰기
		try {
			FileWriter out = new FileWriter("myFiles/writertest.txt", Charset.forName("UTF-8"), false);
			
//			out.write("그냥 문자열로 써버리면 알아서 byte타입으로 변환하여 출력\n");
//			out.write("읽을 때도 다시 합칠 걱정 없이 합쳐줌\n");
			out.write("가나다라마바사아자차카타파하");
			out.write("구누두루무부수우주추쿠투푸후");
			
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("쓰기 완료.");
		
		try {
			FileReader in = new FileReader("myFiles/writer1.txt", Charset.forName("UTF-8"));

			// read() : 한 글자씩 읽기. 더 읽을게 없으면 -1이 리턴됨.
//			int ch;
//			while((ch = in.read()) != -1) {
//				System.out.print((char)ch);	
//			}			
			
			// read(char[]) : 여러 글자씩 읽기. 정상적으로 읽은 경우 읽은 문자의 개수가 리턴, 다 읽으면 -1
			char[] buff = new char[5];
			
			int i = 0;
			int count;
			while((count = in.read(buff)) != -1) {
				System.out.printf("%d번째로 읽은 것 : %s (이번에 읽은 문자 %d개)\n", 
						i++, new String(buff, 0, count), count);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
