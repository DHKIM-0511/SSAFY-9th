package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 롤케이크_3985 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l = Integer.parseInt(br.readLine());
		int[] cake = new int[l+1];
		int n = Integer.parseInt(br.readLine());
		int[][] p = new int[n][2];
		int greed = -1;//많이받길 원한 사람
		int pres = 1;
		int cnt = 0;
		
		for(int i = 0 ; i < n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			p[i][0] = Integer.parseInt(st.nextToken());
			p[i][1] = Integer.parseInt(st.nextToken());
			int a = -1;
			if(p[i][1]-p[i][0] > a) {
				a=p[i][1]-p[i][0];
				greed = i+1;
			}
			int tmp = 0;
			for(int j = 0 ; j < l+1 ;j++) {
				if(j <= p[i][1] && j >= p[i][0]) {
					if(cake[j] != 0) {
						cake[j]=i+1;
						tmp++;
					}
				}
				if(cnt < tmp) {
					cnt=tmp;
					pres = i+1;
				}
					
			}
		}

		System.out.println(greed);
		System.out.println(pres);
		
		
	}
}
