package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 어디에단어가들어갈수있을까_1979 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t ; tc++) {
			int ans = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[n][n];
			
			for(int i = 0 ; i < n ; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0 ; j< n ; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					boolean check1 = true;
					boolean check2 = true;
					int cnt1 = 0 ;
					int cnt2 = 0 ;
					if(arr[i][j] == 1) {
						for(int l = 1 ; l < 4 ; l++) {
							
							int nr1 = i + l; // 하
							int nr2 = i - l; // 상
							if(nr1>=0 && nr1 < n && nr2>=0 && nr2 < n) {
								if(arr[nr1][j] == 1)
									cnt1++;
								if(arr[nr1][j] == 0)
									cnt1=0;
							}
							
							int nc1 = i + l; // 우
							int nc2 = i - l; // 좌
							if(nc1 >=0 && nc1 < n && nc2 >=0 && nc2 < n) {
								if(arr[i][nc1] == 1)
									cnt2++;
								if(arr[i][nc1] == 0)
									cnt2=0;
							}
						}
						if(cnt1==2)
							ans++;
						if(cnt2==2)
							ans++;
					}	
				}
			}
			System.out.println("#"+tc+" "+ans);
		}
	}
}
