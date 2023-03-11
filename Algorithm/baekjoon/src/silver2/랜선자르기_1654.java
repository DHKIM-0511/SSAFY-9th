package silver2;

import java.util.Scanner;

public class 랜선자르기_1654 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); // 최초 랜선 수
		int n = sc.nextInt(); // 이후 랜선 수
		
		int[] line = new int[k]; // 각 랜선의 길이
		int left = 0;
		int right = 0;
		
		for(int i = 0 ; i < k ; i++) {
			line[i] = sc.nextInt();
			
			if(right < line[i]) {
				right = line[i];
			}
		}
		right++;
		
		while(left <= right) {
			int mid = (left+right) /2;
			//자를 길이
			int sum = 0;
			//잘랐을 때 갯수
			int cnt = 0;
			
			for(int i = 0 ; i < k ; i++) {
				 cnt+=(line[i]/mid);
				 if(cnt < n) {
						right = mid;
					}
					else {
						left = mid + 1;
					}
			}
			
		}
		System.out.println(left-1);
	}
}
