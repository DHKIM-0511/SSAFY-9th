package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색_2178 {
	static int n;
	static int m;
	static int cnt = 1;
	static int[][] d = new int[n][m];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		boolean[][] maze = new boolean[n][m];
		
		for(int i = 0 ; i < n ; i ++) {
			String tmp = br.readLine();
			for(int j = 0 ; j < m ; j++) {
				if( tmp.charAt(j)-'0'==1)
					maze[i][j] = true;
			}
		}
		
		find(maze,0,0);
		System.out.println();
	}

	private static void find(boolean[][] maze,int x , int y) {
		Queue<Integer[]> q = new LinkedList<>();
		Integer[] start = {0,0};
		q.offer(start);
		
		if(x==n-1 && y==m-1 ) {
			
			return ;
		}
		
		int[] dr = {-1 , 1 , 0 , 0};
		int[] dc = { 0 , 0 ,-1 , 1};
		 
		for(int i = 0 ; i < 4 ; i++) {
			int nr = x + dr[i];
			int nc = y + dc[i];
		
			if(nr >= 0  && nr < n && nc >= 0 && nc < m) {
				if(maze[nr][nc]== true ) {
					System.out.printf("%d , %d\n",nr,nc);
					maze[x][y] = false;
					cnt++;
					find(maze,nr,nc);
				}
			}
		}
//		cnt = 0;
//		return ;
	}
}
