package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class B14_Sort {
	/*
	 	랜덤 int 30개가 들어있는 배열을 생성한 후
	 	
	 	 (1) 해당 배열의 내용을 작은 값부터 차례대로(오름차순) 저장한 새로운 배열을 생성하여 출력해보세요
	 	 
	 	 (2) 해당 배열의 내용을 큰 값부터 차례대로(내림차순) 저장한 새로운 배열을 생성하여 출력해보세요
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int[] nums = new int[30];
		int[] asc = new int[nums.length];
		int[] desc = new int[nums.length];

		// 랜덤값 생성
		for (int i = 0; i < nums.length; ++i) {
			nums[i] = ran.nextInt(100);
		}
	
		
		// 오름차순
		for (int i = 0; i < nums.length; ++i) {
			asc[i] = nums[i];
		
			for (int j = 0; j < i; ++j) {
				if (asc[i] < asc[j]) {
					int temp = asc[j];
					asc[j] = asc[i];
					asc[i] = temp;
				}
			}
			
		}
		
		
		// 내림차순
		for (int i = 0; i < nums.length; ++i) {
			desc[i] = nums[i];
			
			for (int j = 0; j < i; ++j) {
				if (desc[i] > desc[j]) {
					int temp = desc[j];
					desc[j] = desc[i];
					desc[i] = temp;
				}
			}
		}
		
		// 출력
		System.out.println("랜덤 int : " + Arrays.toString(nums));
		System.out.println("오름차순 : " + Arrays.toString(asc));
		System.out.println("내림차순 : " + Arrays.toString(desc));
		
	}
}
