package silver4;

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
		
		board = new boolean[n][m];
		
		
		for(int i = 0 ; i < n ; i++) {
			String temp = br.readLine();
			for(int j = 0 ; j < m ; j++) {
				if(temp.charAt(j) == 'W')
					board[i][j] = true;
				else
					board[i][j] = false;
			}
		}
		
		int sr = n - 7;
		int sc = m - 7;
		
		for (int i = 0; i < sr; i++) {
			for (int j = 0; j < sc; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
	}
	static int min = 64;
	static boolean[][] board;
	
	private static void find(int x, int y) {
		int endx = x + 8;
		int endy = y + 8;
		int count = 0;
 
		boolean TF = board[x][y];	// 첫 번째 칸의 색 
 
		for (int i = x; i < endx; i++) {
			for (int j = y; j < endy; j++) {
 
				// 올바른 색이 아닐경우 count 1 증가 
				if (board[i][j] != TF) {	
					count++;
				}
				
				/* 
				 * 다음 칸은 색이 바뀌므로
				 * true라면 false로, false 라면 true 로
				 * 값을 변경한다.
				 */
				TF = (!TF);
			}
			
			TF = !TF;
		}
		
		/*
		 *  첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
		 *  첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
		 *  색칠 할 개수(64 - count) 중 최솟값을 count 에 저장 
		 */
		count = Math.min(count, 64 - count);
		
		/*
		 * 이전까지의 경우 중 최솟값보다 현재 count 값이
		 * 더 작을 경우 최솟값을 갱신 
		 */
		min = Math.min(min, count);
	}
}
