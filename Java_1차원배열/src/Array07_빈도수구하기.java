import java.util.Arrays;

public class Array07_빈도수구하기 {
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 4, 3, 3, 2, 1, 3, 5, 8};
		
		//카운팅 배열의 선언
		// 수의 범위를 알아야함
		// 제일 큰 수 : 9
		// 제일 큰 수 +1의 크기로 만든다.
		
		int[] cnt = new int[10];
		
		for(int i =0;i<arr.length;i++) {
			cnt[arr[i]] += 1;
		}
		System.out.println(Arrays.toString(cnt));
	}
}
