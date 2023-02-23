package gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수_17298 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] NGE = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> tmp = new Stack<>();
		
		//비교 인덱스
		int start = 0;
		tmp.push(Integer.parseInt(st.nextToken())); // 5 7
		while(true) {
			int next;
			if(st.hasMoreTokens()) {
				 next = Integer.parseInt(st.nextToken()); // 5 2 7
			}else if(tmp.size()!=1)
				next = tmp.pop();
			
			if(next > tmp.peek()) { 
				NGE[start++] = next;  // 5 7
				tmp.pop();
				tmp.push(next);
				
			}else
				tmp.push(next);
		}
		//NGE(i+1) ~ NGE(N) 을 공백띄고 출력
		
		sb.append(-1);
		System.out.println(sb); // NGE(i) = i 번째 인덱스보다 오른쪽이면서 큰 수.
	}
}
