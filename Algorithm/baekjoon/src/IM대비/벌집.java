package IM대비;

import java.util.Scanner;

public class 벌집 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1~1 / 2~ 7(6) / 8 ~ 19 (12) /20 ~ 37 (18)
		int n = sc.nextInt();
		
		int start = 1;
		int end = 1;
		int ans = 1;

		
		for(;;) {
			if(n >= start && n <=end) {
				break;
			}
			start = end+1;
			end = (ans*6)+1;
			ans++;
		}
			
			
		System.out.println(ans);
	}
}
