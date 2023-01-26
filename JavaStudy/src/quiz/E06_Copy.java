package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E06_Copy {
	/*
	 	images 폴더 내부의 모든 내용을
	 	원하는 경로의 밑으로 모두 복사해보세요 
	 */
	public static void copyFile(File srcFile, File dstFile) {
	// Reader, Writer를 이용해 문자단위로 읽으면 이미지파일은 복사 x, 바이트 단위로 읽어야함
//		FileReader in = null;
//		FileWriter out = null;
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream(srcFile);
			out = new FileOutputStream(dstFile);
			
			out.write(in.readAllBytes());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) in.close();
				if (out != null) out.close();
			} catch (IOException e) { e.printStackTrace(); } 
		}
		
	}
	
	public static void copyDirectory(File src, File dst) throws Exception{
		if (!src.isDirectory()) {
			throw new Exception ("디렉토리만전달해익셉션");
		} else if (!src.exists()) {
			throw new Exception("복사할파일경로틀림익셉션");
		} else if (!dst.exists()) {
			throw new Exception("목적지경로틀림익셉션");
		}
		
		// src : images
		// dst : myFiles
		// to_copy : myFiles/images/
		File to_copy = new File(dst, src.getName());
		
		// myFiles/images/
		to_copy.mkdir();
		
		// 원본 폴더인 images/ 내부의 파일들
		for (File f : src.listFiles()) {
			if (f.isDirectory()) {
				copyDirectory(f, to_copy);
			} else if (f.isFile()) {
				copyFile(f, new File(to_copy, f.getName()));
			}
		}
	}
	
	
	
//	public static void copy(File src, File dst) {
//		File to_copy = new File(dst, src.getName());
//		System.out.println("-----------------------------------------------");
//		System.out.println("원본의 위치: " + src);
//		System.out.println("복사해야 할 곳의 위치: " + to_copy);		
//		
//		if (src.isDirectory()) {
//			to_copy.mkdir();
//		} else if (src.isFile()) {
//			// 복사
//			copyFile(src, to_copy);
//		} else {
//			System.out.println("?? 복사 종료");
//		}
//	}
	
	public static void main(String[] args) {
		try {
			copyDirectory(new File("images"), new File("copy_practice"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		File origin = new File("images/foods/fruits/memo/");
//		String[] oriPaths = origin.list();
//		File copy = new File("images_copy/");
//		copy.mkdirs();
//		
//		try {
//			for (String path : oriPaths) {
//				FileReader in = new FileReader(new File(origin, path).getAbsolutePath());
//				FileWriter out = new FileWriter(String.format("images_copy/%s", path));
//				int ch;
//				while ((ch = in.read()) != -1) {
//					out.write(ch);
//				}
//				
//				in.close();
//				out.close();
//			}
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.printf("%s 디렉토리로 복사 완료.", copy);
	
	}
}
