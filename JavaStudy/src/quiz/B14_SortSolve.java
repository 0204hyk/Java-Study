package quiz;

import java.util.Arrays;

public class B14_SortSolve {
	/*
 	랜덤 int 30개가 들어있는 배열을 생성한 후
 	
 	 (1) 해당 배열의 내용을 작은 값부터 차례대로(오름차순) 저장한 새로운 배열을 생성하여 출력해보세요
 	 
 	 (2) 해당 배열의 내용을 큰 값부터 차례대로(내림차순) 저장한 새로운 배열을 생성하여 출력해보세요
	 */
	public static void main(String[] args) {
		
		int[] nums = new int[30];
		
		// Arrays.fill(arr, value) : 해당 배열을 원하는 값으로 가득 채울 때 사용
		// ex > Arrays.fill(nums, 100);
		
		// 랜덤배열 nums[] 생성
		for (int i = 0; i < nums.length; ++i) {
			nums[i] = (int)(Math.random() * 100);
		}
		
		int[] ascending = new int[30];
		
		// 배열의 시작 주소전달 -> 두 배열 변수가 같은 배열을 가리키게 된다. (ascending를 수정하면 nums도 수정된다.)
		//ascending = nums;
		
		// 배열 내부의 값 복사
		for (int i = 0; i < nums.length; ++i) {
			ascending[i] = nums[i];
		}
		
		// 가장 큰 값을 맨 오른쪽으로 옮긴다.
		// i : 내가 제일 큰 값을 찾아서 넣어야 하는 위치
		for (int i = 29; i >= 0; --i) {
			int max_index = 0;
			
			// 제일 큰 값의 위치를 찾는 곳
			// max_index가 0부터 시작하므로 j는 1~ 29까지 비교
			for (int j = 1; j <= i; ++j) {
				if (ascending[max_index] < ascending[j]) {
					max_index = j;
				}
			}
			
			// 찾은 가장 큰 값과 마지막 위치의 값을 교환
			int temp = ascending[i];
			ascending[i] = ascending[max_index];
			ascending[max_index] = temp;
		}
		
		int[] descending = new int[30];
		for (int i = 0; i < nums.length; ++i) {
			descending[i] = nums[i];
		}
		
		for (int i = 29; i >= 0; --i) {
			int min_index = 0;
			
			for (int j = 1; j <= i; ++j) {
				if (descending[min_index] > descending[j]) {
					min_index = j;
				}
			}
			
			int temp = descending[i];
			descending[i] = descending[min_index];
			descending[min_index] = temp;
			
		}
	
		System.out.println("정렬 전 배열: " + Arrays.toString(nums));
		System.out.println("오름차순: " + Arrays.toString(ascending));
		System.out.println("내림차순: " + Arrays.toString(descending));
		
	}

}
