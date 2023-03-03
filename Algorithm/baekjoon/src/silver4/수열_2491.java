package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수열_2491 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		int upCnt = 0;
		int dwCnt = 0;
		int uptmp = 0;
		int dwtmp = 0;
		
		for(int i = 0 ; i < n ; i++)
			arr[i] = Integer.parseInt(st.nextToken());
			
		
		for(int i = 1 ; i < n ; i++) {
			if(arr[i] >= arr[i-1]) {//오름차순 검사
				uptmp++;
			}else {
				if(uptmp>upCnt)
					upCnt=uptmp;
				uptmp=0;
			}
			if(arr[i] <= arr[i-1]) {//내림차순 검사
				dwtmp++;
			}else {
				if(dwtmp>dwCnt)
					dwCnt=dwtmp;
				dwtmp=0;
			}
		}
		
		
		int ans = 0;
		
		if(upCnt > dwCnt)
			ans = upCnt;
		else
			ans = dwCnt;
		
		System.out.println(ans+1);
	}
}