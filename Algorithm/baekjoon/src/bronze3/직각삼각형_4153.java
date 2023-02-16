package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 직각삼각형_4153 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0 && c==0)
				break;
			else if (a % 3 == 0) {
				if((b % 4 ==0 && c % 5 ==0) || (b % 5 ==0 && c % 4 ==0)) {
					System.out.println("right");
				}
			}else if (a % 4 == 0) {
				if((b % 3 ==0 && c % 5 ==0) || (b % 5 ==0 && c % 3 ==0)) {
					System.out.println("right");
				}
			}else if (a % 5 == 0) {
				if((b % 4 ==0 && c % 3 ==0) || (b % 3 ==0 && c % 4 ==0)) {
					System.out.println("right");
				}
			}
			else
				System.out.println("wrong");
		}

	}
}
