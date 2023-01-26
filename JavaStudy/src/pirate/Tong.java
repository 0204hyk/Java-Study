package pirate;

import java.util.Arrays;
import java.util.Scanner;

public class Tong {
	Scanner sc = new Scanner(System.in);
	
	boolean[] stabbed;
	boolean[] knifeHole;
	
	public Tong(int size, int lose) {
		stabbed = new boolean[size];
		knifeHole = new boolean[size];
		
		for (int i = 0; i < lose; ++i) {
			knifeHole[i] = true;
		}
		
		// shuffle 1000 times
		for (int i = 0; i < 1000; ++i) {
			int randex = (int)(Math.random() * knifeHole.length);
			
			boolean temp = knifeHole[0];
			knifeHole[0] = knifeHole[randex];
			knifeHole[randex] = temp;
		}
	}
	
	/** 
	 	true가 리턴되면 아저씨가 발사됨, false는 발사하지 않음 
	 
	 	@param num - 칼을 꽂고 싶은 번호를 전달
	 */
	public boolean stab(int num) {
		while (stabbed[num]) {
			System.out.println("이미 찔렀던 곳 입니다. 다시 입력해주세요!");
			System.out.print("> ");
			num = sc.nextInt();
		}
		
		stabbed[num] = true;
		return knifeHole[num];
	}
	
	public void view() {
		for (int i = 0; i < stabbed.length; ++i) {
			if (!stabbed[i]) {
				System.out.printf("%02d ", i);				
			} else {
				System.out.printf("%s ", "XX");
			}
			
			if (i % 10 == 9) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size, lose;
		
		System.out.print("구멍은 모두 몇개입니까? ");
		size = sc.nextInt();
		System.out.print("꽝은 몇개입니까? ");
		lose = sc.nextInt();
		
		for (int i = 0; i < 3; ++i) {
			System.out.println(Arrays.toString(new Tong(size, lose).knifeHole));
						
		}
		
		
	}
	
}
