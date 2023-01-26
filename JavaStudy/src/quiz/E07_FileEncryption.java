package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class E07_FileEncryption {
	/*
	 	frankenstein.txt를 시저암호 방식으로 암호화한 파일
	 	frankenstein_encrypeted.enc을 생성해보세요
	 */
	private static String allText = read();
	
	private final static String UPPER_CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final static String LOWER_CHARSET = "abcdefghijklmnopqrstuvwxyz";
//	private final static String NUM_CHARSET = "0123456789";
	
	public static String read() {
		File book = new File("myFiles/frankenstein.txt");
		StringBuilder sb = new StringBuilder();
		
		try (FileReader fin = new FileReader(book);
				BufferedReader in = new BufferedReader(fin);) {
				
				String line;
				while ((line = in.readLine()) != null) {
					sb.append(line);
					sb.append('\n');
				}
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb.toString();
	}
	
	public static String encrypt() {
		StringBuilder sb = new StringBuilder(allText);
		Scanner sc = new Scanner(System.in);
		System.out.print("옮길 칸수 입력 >> ");
		int key = sc.nextInt();
		
		for (int i = 0; i < allText.length(); ++i) {
			char ch = sb.charAt(i);
			int index, len;
			
			if (Character.isUpperCase(ch)) {
				
				len = UPPER_CHARSET.length();
				index = ch - 'A' + key % len;
				index = index >= len ? index - len : index;
				ch = UPPER_CHARSET.charAt(index);
				
			} else if (Character.isLowerCase(ch)) {
				
				len = LOWER_CHARSET.length();
				index = ch - 'a'  + key % len;
				index = index >= len ? index - len : index;
				ch = LOWER_CHARSET.charAt(index);
				
			}
			sb.setCharAt(i, ch);
		}	
		
		return sb.toString();
	}

	
	public static void encryptFile() {
		
		try (FileWriter fout = new FileWriter("myFiles/frankenstein_encrypted.enc");
				BufferedWriter out = new BufferedWriter(fout);) {
			
			out.write(encrypt());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("암호화 완료.");
	}
		
	public static void main(String[] args) {
		encryptFile();
	}
}
