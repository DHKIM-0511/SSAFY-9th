package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드2_10816 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] card = new int[n];
		st= new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++)
			card[i] = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		int[] key = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < m ; i++)
			key[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(card);
		int left = 0;
		int right = n-1;
		
		while(true) {
			int mid = (left + right)/2;
		}
	}
}
