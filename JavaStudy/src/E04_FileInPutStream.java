import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04_FileInPutStream {
	public static void main(String[] args) {
		
		try {
			FileInputStream in = new FileInputStream("myFiles/test2.txt");
			
			// read() : 데이터를 한 바이트 씩 읽는다. 더 이상 읽을 것이 없는 경우 -1을 리턴. (EOF)
			//          한 바이트씩 읽기 때문에 한글 등의 2바이트 문자를 읽기가 힘들다.
//			int result = 0;
//			while (result != -1) {
//				result = in.read();
//				if (result == -1) {
//					break;
//				}
//				System.out.print((char)result);				
//			}
			
			// 파일의 모든 내용을 한번에 byte[]로 읽기
			byte[] allData = in.readAllBytes();
			
			// byte[]을 요구하는 문자열 생성자로 재구성하기
			// new String에서 byte[]을 합쳐주기 때문에 한글도 제대로 출력된다.
			System.out.println(new String(allData, "UTF-8"));
			
			// 더 이상 안쓸거라면 close
			in.close();
		} catch (Exception e) {
			System.out.println("뭔가 문제 생김");
		}
		
		System.out.println();
		System.out.println("프로그램 끝");
	}
}
