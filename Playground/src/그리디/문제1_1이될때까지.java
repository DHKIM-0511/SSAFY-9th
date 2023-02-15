package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문제1_1이될때까지 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int cnt = 0 ;
		
//		while(n!=1) {
//			if(n % k == 0) {
//				n = n/k;
//			}else {
//				n-=1;
//			}
//			cnt++;
//		}
		
		while(true) {
			int temp = (n/k)*k;//템프 = n에 가장 가까운 k로 나누어 떨어지는 수
			cnt += (n-temp); // cnt값을 바로 넣어줌
			n=temp;
			
			if(n<k)
				break;
			
			cnt++;
			n/=k;
		}
		cnt+=(n-1);
		
		
		System.out.println(cnt);
	
	}
}
