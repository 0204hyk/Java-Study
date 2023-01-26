import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E06_File {
	/*
	 	# java.io.File
	 	
	 	 - 파일에 대한 정보를 담을 수 있는 클래스
	 	 - 해당 인스턴스에 담긴 정보를 통해 파일 시스템을 직접 제어할 수 있다.
	 	 
	 	# 파일 시스템
	 	 
	 	 - 하드디스크의 파일을 손쉽게 관리할 수 있도록 설정한 일부 구역
	 	 - 파일 시스템의 내용을 디렉토리 구조로 볼 수 있도록 하는 것이 탐색기
	 */
	/*
 		※매우 중요※
 	
 		절대 경로 - 위치와 상관없이 해당 파일을 무조건 찾을 수 있는 경로
 	
			C:\Program Files\java\jdk\javac.exe
 	
 		상대 경로 - 현재 위치부터 해당 파일을 찾아가는 방식의 경로
 			
 			/   : 현재 속해있는 드라이브의 최상위부터 시작
 			./  : 현재 위치부터 시작 (생략 가능)
 			../ : 상위 폴더
 			
 			/JavaFullStack/java-workspace/  - 현재 드라이브의 최상위부터 시작
 			JavaFullStack/java-workspace/   - 현재 위치부터 시작
 			./../../java/jdk/javac.exe      - 현재 위치부터 시작
 */
		
	public static void main(String[] args) {
		
		// 경로를 입력해 File 인스턴스를 생성할 수 있다.
		// ./ 생략 가능
		File f1 = new File("./myFiles");
		File f2 = new File("./myFiles/record2.sav");
		File f3 = new File("./myFiles/abc.repository");
		
		// isDirectory : 디렉토리 여부 검사
		System.out.println("f1은 디렉토리인가요? " + f1.isDirectory());
		System.out.println("f2는 디렉토리인가요? " + f2.isDirectory());
		System.out.println("f3는 디렉토리인가요? " + f3.isDirectory());
		
		// isFile() : 파일인지 검사
		System.out.println("f1 is File? " + f1.isFile());
		System.out.println("f2 is File? " + f2.isFile());
		System.out.println("f3 is File? " + f3.isFile());
		
		// exists() : 존재 여부 검사
		System.out.println("f1 exists? " + f1.exists());
		System.out.println("f2 exists? " + f2.exists());
		System.out.println("f3 exists? " + f3.exists());
		
		// canRead(), canWrite(), canExecute() : 파일 권한 검사
		System.out.println(f2.canExecute());  // 실행 권한이 있는지
		System.out.println(f2.canRead());     // 읽기 권한이 있는지
		System.out.println(f2.canWrite());    // 쓰기 권한이 있는지
		
		// isAbsolute() : 절대 경로 여부 검사
		System.out.println("절대경로인가요? " + f2.isAbsolute());
		
		// getAbsolutePath() : 절대 경로 가져오기
		if (!f2.isAbsolute()) {
			System.out.println("절대경로는 " + f2.getAbsolutePath());
		}
		
		// mkdir() : 디렉토리를 생성
//		File dir = new File("images/");
//		System.out.println("디렉토리 잘 만들었니? " + dir.mkdir());
		
		// mkdirs() : 해당 경로의 모든 디렉토리를 생성 (아직 존재하지 않는 부모 디렉토리까지 한번에 생성)
		File dir2 = new File("images/foods/fruits/");
		
		System.out.println("디렉토리 잘 만들었니2? " + dir2.mkdirs());
		
		// 스트림에 파일 인스턴스를 전달하는 것이 가능
		try {
			new FileOutputStream(f2, true);
			new FileWriter(f3);
			new FileInputStream(f1);
			new FileReader(dir2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 디렉토리 == 폴더
		
		// list() : 해당 디렉토리에 들어있는 모든 파일 및 디렉토리를 경로 문자열로 꺼내온다.
		String[] paths = dir2.list();
		
		for (String path : paths) {
			// 부모 디렉토리의 경로와 함께 파일을 생성할 수 있는 생성자
			System.out.println(new File(dir2, path).getAbsolutePath());
			System.out.println(path);
		}
		
		// listFiles() : 해당 디렉토리의 모든 파일 및 디렉토리를 파일 인스턴스로 꺼내온다.
		File[] files = dir2.listFiles();
		
		for (File f : files) {
			System.out.println(f.getAbsolutePath());
		}
	}
}
