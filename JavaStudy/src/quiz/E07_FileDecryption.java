package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E07_FileDecryption {
	/*
	 	암호화된 파일의 맨 위부터 10줄을 모든 key값(1 ~ 25)으로 복호화한 샘플을 보여준 후
	 	사용자가 샘플을 보고 key값을 선택할 수 있도록 만들고
	 	선택하면 해당 key값으로 복호화한 frankenstein_decrypted.txt가 생성되도록 만들어보세요 
	 */
	public static void printSample(File f, int key) throws Exception {
		if (!f.isFile()) {
			throw new Exception("파일이 아닌 것은 복호화 할 수 없음");
		} else if (!f.getName().endsWith(".enc")) {
			throw new Exception(".enc 파일만 복호화 할 수 있음");
		}

		StringBuilder sb = new StringBuilder();
		
		try (FileReader fin = new FileReader(f);
				BufferedReader in = new BufferedReader(fin);) {
			
			D09_CaesarCipher cryptoTool = new D09_CaesarCipher(key);
			
			for (int j = 0; j <= 10; ++j) {
				sb.append(cryptoTool.decrypt(in.readLine()));
				sb.append('\n');
			}
			System.out.println(sb.toString());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static File decryptFile(File f) {
		Scanner sc = new Scanner(System.in);
		System.out.print("복호화할 키 값 입력 >> ");
		int key = sc.nextInt();
		
		File decryptedFile = new File(f.getParentFile(), 
				f.getName().replaceAll("_.+", "_decrypted.txt")); 
		
		D09_CaesarCipher cryptoTool = new D09_CaesarCipher(key);
		
		try (	
				FileReader fin = new FileReader(f);
				BufferedReader in = new BufferedReader(fin);
				FileWriter fout = new FileWriter(decryptedFile);
				BufferedWriter out = new BufferedWriter(fout);
		) {
			StringBuilder sb = new StringBuilder();
			
			String line;
			while((line = in.readLine()) != null) {
				sb.append(line);
				sb.append('\n');
			}
			out.write(cryptoTool.decrypt(sb.toString()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("복호화 완료.");
		return decryptedFile;
	}
	
	public static void main(String[] args) {
		
		int key;
		
		try {
			for (key = 1; key <= 25; ++key) {
				System.out.printf("키 값 %d\n", key);
				System.out.println("====================================================");
				printSample(new File("myFiles/frankenstein_encrypted.enc"), key);
				System.out.println("====================================================");
			}
			decryptFile(new File("myFiles/frankenstein_encrypted.enc"));
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}
}
