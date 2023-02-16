package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 진기의최고급붕어빵_1860 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
	
		for(int tc = 1 ; tc <= t ; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()); // 손님 수
			int m = Integer.parseInt(st.nextToken()); // 붕어빵을 만드는데 걸리는 시간(초)
			int k = Integer.parseInt(st.nextToken()); // m초 동안 만들 수 있는 붕어빵 개수
			String ans = null;
			
			st = new StringTokenizer(br.readLine());
			
			int[] arr = new int[n];
			for(int i = 0 ; i < n ; i++) {
				arr[i]= Integer.parseInt(st.nextToken());
			}
			
			if(arr[0] >= m && k >= n) {
				
				ans = "Possible";
			}else if(arr[0] >= m && k < n){
				if()
				
			}
			else {
				ans = "Impossible";
			}
				
				
			
				
			System.out.println("#"+tc+" "+ans);
		}
	
	
	}
}
