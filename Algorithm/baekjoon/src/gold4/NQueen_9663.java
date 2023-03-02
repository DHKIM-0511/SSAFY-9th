package gold4;

import java.util.Scanner;
import java.util.Stack;

public class NQueen_9663 {
	static int n;
	static boolean[][] board;
	static boolean[][] checked;
	static int cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		board = new boolean[n][n];
		
		for(int i = 0 ; i < n ; i++)
			nQeen(i);
		
		System.out.println(cnt);
//		System.out.println(nQeen(n));
	}

	private static void nQeen(int start) {
		Stack<Integer> stack = new Stack<>();
		stack.push(start); // (0, start)위치를 스택에 푸시
		int left = start-1;
		int right = start+1;
		checked = new boolean[n][n];
		int queen =1;
		
		while(!stack.isEmpty()) {
			int y = stack.pop();
			
			if(left >=0 && right<n) {
				checked[queen+1][left] = true;
				checked[queen+1][y] = true;
				checked[queen+1][right] = true;
			}
			
			for(int i = 0 ; i < n ;i++) {
				if(!checked[queen+1][i]) {
					stack.push(i);
					queen++;
				}
			}
			
			left--;
			right++;
			int flag = 0 ;
			
			if(queen == n ) {
				cnt++;
			}
			
			for(int i = 0 ; i < n ; i++) {
				if(checked[queen+1][i]) {
					flag =1;
				}
			}
			if(flag == 1) {
				continue;
			}
		}
	}
}
//n * n 사이즈 판위에 n개의 퀸이 있다
//서로 공격할 수 없게 놓는 경우의 수
//하나의 행, 열에 하나의 퀸
//같은 대각선상에 하나의 퀸
// 1 1 1 1 1 1 1 1
// 0 0 1 1 1 0 0 0
// 0 1 0 1 0 1 0 0
// 1 0 0 1 0 0 1 0
// 0 0 0 1 0 0 0 1
// 0 0 0 1 0 0 0 0
// 0 0 0 1 0 0 0 0
// 0 0 0 1 0 0 0 0







