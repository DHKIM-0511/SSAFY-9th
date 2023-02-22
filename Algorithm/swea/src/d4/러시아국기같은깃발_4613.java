package d4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 러시아국기같은깃발_4613 {
	static char[][] flag;
	static int n;
	static int m;
	static Queue<Integer> queue = new LinkedList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1 ; tc <= t ; tc++) {
			st = new StringTokenizer(br.readLine());
			 n = Integer.parseInt(st.nextToken());
			 m = Integer.parseInt(st.nextToken());
			
			flag = new char[n][m];
			
			for(int i = 0 ; i < n ; i++) {
				String tmp = br.readLine();
				for(int j = 0 ; j < m ; j++) {
					flag[i][j] = tmp.charAt(j);
				}
			}
			

				
			makeFlag('W', 0, 0);
			
			int minCnt = n * m + 1;
			
			int size = queue.size();
			
			for (int i = 0; i < size; i++) {
				
				int value = queue.poll();
				
				minCnt = (value < minCnt) ? value : minCnt;
			}
			
			System.out.println("#"+tc+" "+minCnt);
		}
		
	}
	public static void makeFlag(char color, int line, int sum) {
		
		int cnt = sum;
		
		for (int c = 0; c < m; c++) {
			if (flag[line][c] != color) cnt++; 			
		}
		
		if (line == n - 1) {
			queue.offer(cnt);
			return;
		}
		
		if (color == 'W' && line < n - 3) {
			makeFlag('W', line + 1, cnt);
			makeFlag('B', line + 1, cnt);
		} else if (color == 'W' && line == n - 3) {	
			makeFlag('B', line + 1, cnt);
		} else if (color == 'B' && line < n - 2) {
			makeFlag('B', line + 1, cnt);
			makeFlag('R', line + 1, cnt);
		} else if (color == 'B' && line == n - 2) {
			makeFlag('R', line + 1, cnt);
		} else {
			makeFlag('R', line + 1, cnt);
		}
	}
}

//Queue<String> flag = new LinkedList<>();
//
//for(int i = 0 ; i < n ; i++)
//	flag.offer(br.readLine());

//front 가 W면 W or B /B면 B or R / R이면 무조건 R 

//for(char a : flag.poll().toCharArray()) { // 첫번째행 무조건 W
//	if(a!='W')
//		change++;
//}

//	for(int i = 1 ; i< n ; i++) {
//		if(check == 0) { // 이전행이 W면
//			for(char a : flag.poll().toCharArray()) {
//				if(a=='W')
//					wCnt++;
//				else if(a=='B')
//					bCnt++;
//			}
//			if(wCnt > bCnt) {
//				change+=wCnt;
//				check=0;
//			}else {
//				change+=bCnt;
//				check=1;
//			}
//		}else if(check == 1) { // 이전행이 B면
//			for(char a : flag.poll().toCharArray()) { 
//				if(a=='B')
//					bCnt++;
//				else if(a=='R')
//					rCnt++;
//			}
//			if(bCnt > rCnt) {
//				change+=bCnt;
//				check=1;
//			}else {
//				change+=rCnt;
//				check=2;
//			}
//		}else if(check == 2) { // 이전행이 R이면
//			for(char a : flag.poll().toCharArray()) { 
//				if(a !='R')
//					change++;
//			}
//		}
//	}
