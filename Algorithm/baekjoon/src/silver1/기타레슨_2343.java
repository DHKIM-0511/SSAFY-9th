package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 기타레슨_2343 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 강의 수
		int m = Integer.parseInt(st.nextToken()); // 블루레이 수
		
		int[] arr = new int[n]; // 각 강의 소요시간
		
		//이진탐색의 범위가 강의시간의 합을분석하는것이므로
		int left  = 0; // 강의 시간 중 최대값
        int right  = 0; // 최대 값 ( m = 1 ) 
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			right += arr[i];
			
			if(left < arr[i])
				left = arr[i];
		}
		
		while(left <= right) {
			//하나의 블루레이에 들어갈 강의 시간의 합 (가정)
            int mid = (left + right)/2; 
            //하나의 블루레이에 들어갈 강의 시간의 합
            int sum = 0;
            //가정일때 필요한 블루레이 개수
            int cnt = 0;
            
            for(int i=0; i<n; i++) {
                if(sum + arr[i] > mid) {
                    sum = 0;
                    cnt++;
                }
                sum += arr[i];
            }
            
            if(sum != 0) cnt++;
            if(cnt <= m) right = mid-1;
            else left = mid+1;
        }
		System.out.println(left);
	
	}
}
