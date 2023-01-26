import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E09_PrimitiveStream {
	/*
	 	# DataOutputStream, DataInputStream
	 	
	 	 - 기본형 데이터 타입을 스트림을 통해 전송하기 위한 클래스
	 	 - Java의 기본형 데이터 타입이기 때문에 Java 이외의 언어로 만들어진 
	 	   프로그램에서는 해당 파일을 사용할 수 없다.
	 	 - 데이터를 저장했던 순서대로 꺼내야한다.
	 */
	public static void main(String[] args) {
		File f = new File("myFiles/data_test");
		
		try (
				FileOutputStream fout = new FileOutputStream(f);
				DataOutputStream out = new DataOutputStream(fout);
		) {
			// 기본형 타입 데이터를 알아서 byte로 변환하여 파일에 쓰는 클래스
			out.writeBoolean(true);
			out.writeBoolean(false);
			out.writeBoolean(false);
			out.writeBoolean(false);
			out.writeBoolean(true);
			out.writeInt(33333);
			out.writeUTF("String");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (
				FileInputStream fin = new FileInputStream(f);
				DataInputStream in = new DataInputStream(fin);
		) {
			// 썼던 순서대로 읽어야한다.
			System.out.println(in.readBoolean());
			System.out.println(in.readBoolean());
			System.out.println(in.readBoolean());
			System.out.println(in.readBoolean());
			System.out.println(in.readBoolean());
			System.out.println(in.readInt());
			System.out.println(in.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
