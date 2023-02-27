package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 연결요소의개수_11724 {
	static int n;
	static int m;
	static boolean[] checked;
	
	public static class addEdge{
		int from;
		int to;
		public addEdge(int from, int to) {
			super();
			this.from = from;
			this.to = to;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		Queue<addEdge> q = new LinkedList<>();
		
		for(int i = 0 ; i < m ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			addEdge e = new addEdge(a, b);
			q.offer(e);
		}
		
		System.out.println(findConnect(q));
		
	}

	private static int findConnect(Queue<addEdge> q) {
		int cnt = 1;
		
		addEdge e1 = q.poll();
		int a = e1.from;
		int b = e1.to;
		
		while(!q.isEmpty()) {
			
			addEdge e2 = q.poll();
			int x = e2.from;
			int y = e2.to;
			if(a == x || a== y || b == x || b == y) { // 연결되어있으면
				
			}else {
				q.offer(e2);
				cnt++;
				a=x;
				b=y;
			}
			
		}
		
		return cnt;
	}
	
}
