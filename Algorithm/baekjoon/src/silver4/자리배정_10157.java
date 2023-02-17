package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 자리배정_10157 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int c = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(br.readLine());
		
		System.out.println(idx(c,r,k));
	}

	private static StringBuilder idx(int c, int r, int k) {
		StringBuilder sb = new StringBuilder();
		
		//처음 인덱스 : (r-1 , 0 )
		int x = 1;
		int y = 1;
		
		int cnt = 1;
		
		int cycle = 0;
		
		while(cnt!=k && cnt <= r*c) {
			while(cnt!=k && cnt <= r*c) {
				cnt++;
				y++;
				if(y==r-cycle) break;
			}
			while(cnt!=k && cnt <= r*c) {
				cnt++;
				x++;
				if(x == c-cycle) break;
			}
			while(cnt!=k && cnt <= r*c) {
				cnt++;
				y--;
				if(y == cycle+1) break;
			}
			cycle++;
			while(cnt!=k && cnt <= r*c) {
				cnt++;
				x--;
				if(x == cycle+1) break;
			}
		}
		if(cnt > r*c) {
			sb.append(0);
		}else
		sb.append(x).append(" ").append(y);
		
		return sb;
	}
}
