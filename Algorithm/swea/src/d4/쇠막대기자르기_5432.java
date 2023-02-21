package d4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 쇠막대기자르기_5432 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		for(int tc = 1 ; tc <= t ;tc++) {
			String str = br.readLine();
			System.out.println("#"+tc+" "+cutting(str));
		}
	}

	private static int cutting(String str) {
		int sum = 0 ;
		
		Stack<Character> tmp = new Stack<>();
		int barCnt = 0;
		int ragCnt = 0;
		for(int i = 0 ; i < str.length() ; i++){
			if(str.charAt(i)=='(') {
				tmp.push(str.charAt(i));
				barCnt++;
			}else { // )인 경우
				if(tmp.peek()=='(') { //.레이저 인 경우
					ragCnt++;
					barCnt--;
					if(ragCnt==1)
						sum+=barCnt*2;
					else
						sum+=barCnt;
				}else {
					barCnt--;
				}
				tmp.push(str.charAt(i));
				
				
				if(barCnt == 0)
					ragCnt = 0;
				
			}
			
		}
		for(char a : tmp) {
			System.out.print(a);
		}
		
		return sum;
	}
}
