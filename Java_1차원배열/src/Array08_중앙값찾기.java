import java.util.Arrays;

public class Array08_중앙값찾기 {
	public static void main(String[] args) {
		// 주어진 숫자가 홀수 개인 경우
		int[] arr = {1, 3, 5, 7, 9, 4, 3, 3, 2, 1, 3, 5, 8};
		System.out.println(arr.length);
		
		int[] cnt = new int[10];
		for(int i=0;i<arr.length;i++) {
			cnt[arr[i]]++;
		}
		
		System.out.println(Arrays.toString(cnt));
		
		// 카운팅 배열로 중앙값 구하기
		// 앞에서부터 개수를 누적해 나가면서
		// 그 개수가 처음으로 중간을 넘어설 때, 그 수가 중간값.
		int sum = 0; // 개수의 합
		int median = 0;
		for(int i=1;i<=9;i++) {
			sum += cnt[i];
			System.out.println("현재 ("+i+")까지 개수의 합: " + sum);
			if(sum >= arr.length/2+1) {
				median = i;
				break;
			}
		}
	}
	
}
