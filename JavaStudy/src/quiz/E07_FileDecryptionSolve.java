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

		// InputStream??? Reader??? ??????????????? ?????? ?????????
		// Scanner?????? ??????, ???????????? ??????
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		File target = new File("myFiles/frankenstein_encrypted.enc");
		
		printSamples(target);
		
		while (true) {
			try {
				System.out.print("????????? key??? ?????? >> ");
				String line = in.readLine();
				int key = Integer.parseInt(line.trim());
				
				decryptFile(target, key);
				
				break;
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("key??? ????????? ??????????????????");
			}			
		}
		
		// main????????? ????????? ??????????????? ??????????????? ?????? ??? ??????????????????, ????????? ??????????????? ??????.
		try {
			if (in != null) in.close();
			if (isr != null) isr.close();			
		} catch (IOException e) {
			System.out.println("close ?????? ?????? ?????? (????????? ?????? ??????)");
		}
		
		System.out.println("????????? ????????? ?????????????????????.");
	}
}
