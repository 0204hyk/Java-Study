package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03_ReporterEmailListFile {
	// 기자들의 이메일들로만 이루어진 파일을 생성해보세요

	public static void main(String[] args) {
		Pattern emailPattern = Pattern.compile("\\S+@\\w+[.]\\w+[.]?\\w*");
		
		Matcher matcher = emailPattern.matcher(D10_ReportorEmailList.text);
		
		try {
			FileOutputStream out = new FileOutputStream("myFiles/email_list.txt");
			while(matcher.find()) {
				out.write((matcher.group() + "\n").getBytes());
			}
			out.close();
		} catch (Exception e) {
			System.out.println("파일을 찾을 수 없거나 쓰기 도중 에러 발생...");
		} 
		
		System.out.println("프로그램 종료");
		
		
	}
}
