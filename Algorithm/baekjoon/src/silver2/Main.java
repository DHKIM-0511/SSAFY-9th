package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n , m;
	public static class Edge{
		int from;
		int to;
		public Edge(int from, int to) {
			super();
			this.from = from;
			this.to = to;
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 노드의 개수
		m = Integer.parseInt(st.nextToken()); // 간선의 개수
		
		Edge[] e = new Edge[m]; // 간선의 배열 생성
		for(int i = 0 ; i < m ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			Edge tmp = new Edge(a, b);
			e[i] = tmp;
		}
		
		System.out.println(check(e));
		
	}
	private static int check(Edge[] e) {
		boolean[] checked = new boolean[n+1];
		Queue<Edge> q = new LinkedList<>();
		q.offer(e[0]);
		int idx = 0;
		
		while(!q.isEmpty()) {
			Edge e1 = q.poll();
			
			
			
			
		}
		
		return 1;
	}
}
