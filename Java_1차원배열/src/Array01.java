
public class Array01 {
	public static void main(String[] args) {
		// 1차원 배열 선언
		// 배열을 가리키는 참조값을 저장할 배열 변수만 선언 된 것일 뿐.
		// 실제 배열 객체가 생성된 것은 아님.
		// 배열 변수에는 배열 객체의 주소값이 저장됨(참조형)
		// 자바에서는 배열의 주소가 첫번째 원소를 가리키는게 아님
		
		int[] score1; // 이 방법을 권장.
		int score2[];
		
		// 1차원 배열의 생성
		// 1. 자료형[] 변수명 new 자료형[길이];
		// 해당 자료형의 기본값으로 초기화가 되어 만들어진다.
		int[] score3 = new int[5];
		
		// 2. 자료형[] 변수명 = new 자료형[]{값1, 값2, 값3}
		int[] score4 = new int[] {1, 2, 3, 4};
//		int[] score4 = new int[5] {1, 2, 3, 4}; 길이와 초기값을 동시에 지정할 수 없다. 초기값이 들어가기때문

		
		// 3. 자료형[] 변수명 = {값1, 값2, 값3};
		// 제약사항이 있음
		// 선언과 동시에 할 때만 사용 가능
		// 선언만 하고 나중에 할당할 때는 사용불가능하다.
		int[] score5 = {5, 6, 7, 8};
		
		//후에 할당
		score1 = new int[10];
		score2 = new int[] {10, 20, 30};
		
//		score1 = {1, 2, 3, 4, 5};
		// 배열의 각 원소에 접근할 때는??
		// 배열 변수명 + index 조합해서 접근 가능하다.
		// 배열의 길이가 N이라면 index의 범위는??
		// 0 ~ N-1
		
		score1[0] = 10;
		score1[1] = 20;
	}
}
