import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E03_JavaIO {
	/*
	 	# Java I/O (Input/Output)
	 	
	 	 - 자바는 스트림이라는 개념을 이용해 프로그램의 입/출력을 다룬다.
	 	 - 프로그램으로 들어오는 모든 데이터들을 입력(Input)이라고 부른다.
	 	 - 프로그램에서 계산되어 나가는 모든 데이터들을 출력(Output)이라고 부른다.
	 	 
		# Stream
		
		 - 데이터들이 오고가는 통로
		 - 데이터들이 프로그램으로 들어오는 통로를 InputStream이라고 한다.
		 - 데이터들이 프로그램에서 계산되어 나가는 통로를 OutputStream이라고 한다.
		 - 데이터가 Stream을 지나가기 위해서는 해당 데이터를 byte타입으로 변환시켜야 한다.
		   (byte타입이 0과 1로 변환하기 가장 쉽기 때문)
		
		# Stream에 대한 close를 반드시 해야하는 이유
		
		 - 사실 모든 참조형 변수는 close가 필요하다.
		 - 하지만 일반적으로 참조형 변수의 닫는 타이밍은 뻔하기 때문에 
		   자동으로 닫아주는 프로그램(GC, Garbage Collector)이 알아서 닫는다.
		 - 하지만 Stream 등 닫는 타이밍이 뻔하지 않은 클래스들은 자동으로 닫아주지 않는다.
		 - 만약 계속 닫지 않으면 결국 메모리가 가득 차서 프로그램이 운영체제에 의해 강제 종료된다.

	 */
	public static void main(String[] args) {
		try {
			// FileOutputStream의 두 번째 매개변수를 true로 하면 append모드가 된다. (false이면 덮어쓰기)
			FileOutputStream out = new FileOutputStream("myFiles/test.txt", true);
			
			out.write(65);	// 'A'
			out.write(66);	// 'B'
			out.write(67);	// 'C'
			out.write('\n');
			
			// String.getBytes() : 해당 문자열을 byte[]로 변환한 값을 리턴
			out.write("Hello, File!\n".getBytes());
			
			// 사용한 Stream은 반드시 닫아줘야한다.
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로를 못 찾음...");
			return;
		} catch (IOException e) {
			System.out.println("Write 도중 에러 발생...");
			return;
		}
		
		System.out.println("쓰기 완료.");
	}
}
