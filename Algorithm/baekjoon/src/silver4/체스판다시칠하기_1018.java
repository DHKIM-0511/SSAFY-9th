package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판다시칠하기_1018 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean[][] board = new boolean[n][m];
		int min = 64;
		
		for(int i = 0 ; i < n ; i++) {
			String temp = br.readLine();
			for(int j = 0 ; j < m ; j++) {
				if(temp.charAt(j) == 'W')
					board[i][j] = true;
				else
					board[i][j] = false;
			}
		}
		
		int nRow = n - 7;
		int mCol = m - 7;
		
		for(int i = 0 ; i < nRow ; i++) {
			for(int j = 0 ; j < mCol ; j++) {
				int endX = i + 8;
				int endY = j + 8;
				int cnt = 0;
				
				boolean TF = board[i][j];
				
				for (int k = i; i < endX; k++) {
					for (int l = j; j < endY; l++) {
						if(board[k][l] != TF) {
							cnt++;
						}
						
						TF=!(TF);
					}
					TF=!(TF);
				}
				
				
				cnt = Math.min(cnt, 64-cnt);
				min = Math.min(min, cnt);
			}
		}
		System.out.println(min);
	}
}
