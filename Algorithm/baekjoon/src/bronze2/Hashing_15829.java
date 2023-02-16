package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Hashing_15829 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l = Integer.parseInt(br.readLine());
		String str = br.readLine();
	
		long[] X = new long[l];
		long ans = 0;
		int p = 1234567891;
		
		for(int i = 0 ; i < l ; i++) {
			X[i] = (str.charAt(i)-'0')-48;
			X[i] = X[i] * (long)(Math.pow(31, i)%p);
			ans += X[i];
		}
		
		System.out.println(ans%p);
	}
}
