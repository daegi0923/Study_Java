import java.util.Arrays;

public class Array03_배열의순회 {
	public static void main(String[] args) {
		int[] nums = {13, 53, 1, 25, 63};
		
//		for(int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
		// for-each
		// for(자료형 변수명 : 배열(반복할 수 있는것)){ }
		// for-each는 read only (수정 불가)
		for(int num : nums) {
			num *= 2;
		}
		
		for(int num : nums) {
			System.out.println(num);
		}
		System.out.println(nums); // 참조값 출력
		System.out.println(Arrays.toString(nums)); // toString으로 출력해야함
	}
}
