package quiz;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class E07_FileDecryptionSolve {
	public static void printSamples(File crypto) {
		try (
				FileReader fin = new FileReader(crypto);
				BufferedReader in = new BufferedReader(fin);
		) {
			StringBuilder sampleSrc = new StringBuilder();
			
			for (int i = 0; i < 10; ++i) {
				sampleSrc.append(in.readLine());	
				sampleSrc.append('\n');
			}
			
			D09_CaesarCipher cryptoTool = new D09_CaesarCipher(0);
			for (int key = 1; key <= 25; ++key) {
				cryptoTool.setKey(key);
				System.out.printf("### key %d ###\n\n", key);
				System.out.println(cryptoTool.decrypt(sampleSrc.toString()));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static File decryptFile(File f, int key) {
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
		
		return decryptedFile;
	}
	
	public static void main(String[] args) {
//		BufferedInputStream bin = new BufferedInputStream(System.in);

		// InputStream을 Reader로 업그레이드 하는 클래스
		// Scanner보다 빠름, 예외처리 필요
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		File target = new File("myFiles/frankenstein_encrypted.enc");
		
		printSamples(target);
		
		while (true) {
			try {
				System.out.print("원하는 key를 입력 >> ");
				String line = in.readLine();
				int key = Integer.parseInt(line.trim());
				
				decryptFile(target, key);
				
				break;
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("key는 숫자로 입력해주세요");
			}			
		}
		
		// main함수가 끝나면 프로그램이 종료되므로 굳이 안 닫아도되지만, 그래도 닫아주는게 좋다.
		try {
			if (in != null) in.close();
			if (isr != null) isr.close();			
		} catch (IOException e) {
			System.out.println("close 도중 에러 발생 (한번도 본적 없음)");
		}
		
		System.out.println("복호화 파일이 생성되었습니다.");
	}
}
