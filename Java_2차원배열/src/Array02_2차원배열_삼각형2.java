
public class Array02_2차원배열_삼각형2 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int cnt = 0;
		for(int r = 0; r<4;r++) {
			for(int c=0; c<4-r;c++) {
				arr[r][c] = ++cnt;
			}
		}
		// 출력
//		  1  2  3  4
//		  5  6  7   
//		  8  9      
//		 10        
		for(int r =0;r<4;r++) {
			for(int c=0;c<4;c++) {
				if(arr[r][c]==0) {
					System.out.print("   ");
				}
				else {
					System.out.printf("%3d", arr[r][c]);
				}
			}
			System.out.println();
		}
		int[][] arr2 = new int[4][4];
		int cnt2 = 0;
		for(int r = 0; r<4;r++) {
			for(int c=3-r; c > -1;c--) {
				arr2[r][c] = ++cnt2;
			}
		}
		// 출력
//		  4  3  2  1
//		  7  6  5   
//		  9  8      
//		 10             
		for(int r =0;r<4;r++) {
			for(int c=0;c<4;c++) {
				if(arr2[r][c]==0) {
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
