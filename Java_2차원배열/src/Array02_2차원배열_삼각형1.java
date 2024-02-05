
public class Array02_2차원배열_삼각형1 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		// 1
		int cnt = 0;
		for(int r = 0; r < 4; r++) {
			for(int c = r; c< 4; c++) {
				arr[r][c] = ++cnt;
			}
		}
		
		for(int r = 0; r < 4 ; r++) {
			for(int c = 0; c < 4; c++) {
				if(arr[r][c] == 0) {
					System.out.print("   ");
				}
				else {
				System.out.printf("%3d", arr[r][c]); // %-3d 하면 글자 왼쪽으로 붙어서 나옴
				}
			}
			System.out.println();
		}
		
		//2
		cnt = 0;
		int[][] arr2 = new int[4][4];
		for(int r = 0; r < 4; r++) {
			for(int c = 3; c > r-1; c--) {
				arr2[r][c] = ++cnt;
				
			}
		}
		//출력
		for(int r = 0; r<4;r++) {
			for(int c = 0;c<4;c++) {
				if(arr2[r][c] == 0) {
					System.out.print("   ");
				}
				else {
					System.out.printf("%3d", arr2[r][c]);
				}
				
			}
			System.out.println();
			
		}
		
	}
}
