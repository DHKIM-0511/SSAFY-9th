package silver3;

import java.util.Scanner;

public class 파도반수열_9461 {
	
	public static long[] arr = new long[101];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 101; i++) {
			arr[i] = -1;
		}
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		
		int t = sc.nextInt();
	
		for(int tc = 1 ; tc <= t ; tc++) {
			int n = sc.nextInt();
			System.out.println(P(n)); 
		}
	}

	private static long P(int n) {
		if(arr[n] == -1) {	// 탐색하지 않은 인덱스일 경우 재귀호출
			arr[n] = P(n - 2) + P(n - 3);
		}
		return arr[n];
	}
}
