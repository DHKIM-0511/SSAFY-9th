package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 요세푸스문제0_11866 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> ys = new LinkedList<>();
		int front = k-1;
		
		
		for(int i = 1 ; i <= n ; i++)
			ys.add(i);
		
		int[] ans = new int[n];
		int i = 0;
		
		while( i < n) {
			
			ans[i] = ys.get(front);
			
			if(ys.size()==0)
				break;
			front = (front+k) % n;
			i++;
		}
		System.out.println(Arrays.toString(ans));
		
//		StringBuilder sb = new StringBuilder();
//		sb.append("<");
//		for(int i = 0 ; i < n-1 ; i++)
//		sb.append(ans[i]).append(",").append(" ");
//		
//		sb.append(ans[n-1]).append(">");
//		
//		System.out.println(sb);
	}
}
