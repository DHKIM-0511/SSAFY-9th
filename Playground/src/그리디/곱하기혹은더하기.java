package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 곱하기혹은더하기 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int ans = str.charAt(0)-'0';
		
		for(int i = 1 ; i < str.length() ; i++) {
			
			int num = str.charAt(i) - '0';
			if(num <= 1 || ans <=1) {
				ans += num;
			}else {
				ans *= num;
			}
		}
		System.out.println(ans);
	}
}
