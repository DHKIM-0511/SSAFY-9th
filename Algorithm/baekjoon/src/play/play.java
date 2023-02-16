package play;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class play {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1 ; tc <= t ; tc++) {
			
			int n = Integer.parseInt(br.readLine());
			char[][] arr = new char[n][n];
			
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ;j++) {
					arr[i][j] = br.readLine().charAt(j);
				}
			}
			
			for(char[] a : arr) {
				for(char b : a) {
					System.out.print(b);
				}
				System.out.println();
			}
			
		}
	}
}
