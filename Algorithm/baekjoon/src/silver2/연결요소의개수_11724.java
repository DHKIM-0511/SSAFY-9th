package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class 연결요소의개수_11724 {
	static int n;
	static int m;
	static int cnt = 0;;
	static boolean[] checked;
	//리스트를 원소로 받는 배열 , 인접노드 저장
	static LinkedList<Integer>[] adj ;
	static Stack<Integer> stack = new Stack<>();
	
	public static void addEdge(int from, int to) {
		adj[from].add(to);
		adj[to].add(from);
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
//		Queue<addEdge> q = new LinkedList<>();
		adj = new LinkedList[n+1];
		for(int i = 0 ; i < m ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			addEdge(a, b);
			 // 모든 엣지들 배열에 추가
		}
		
		findConnect(1);
		System.out.println(cnt);
	}

	private static void findConnect(int root) {
		boolean[] visited = new boolean[n+1];
		stack.push(root);
		cnt++;
		while (!stack.isEmpty()) {
            // 스택의 top에 있는 노드를 pop
            int node = stack.pop();

            if (!visited[node]) {
                // 현재 노드를 방문한 것으로 표시하고 출력합니다.
                visited[node] = true;

                // 현재 노드의 인접 노드를 스택에 push 합니다.
                Iterator<Integer> i = adj[node].listIterator(); //  해당 배열에 저장된 모든 값
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n])
                        stack.push(n);
                }
            }
        }
		int flag = 0;
		for(int i = 1 ; i < n+1 ; i++) {
			if(visited[i] == false) {
				flag = 1;
				root = i;
				break;
			}
		}
		if(flag == 1)
			findConnect(root);
		else
			return;
	}
}





//addEdge e1 = stack.pop();
//int a = e1.from;
//int b = e1.to;
//
//int n = q.size();
//for(int i = 0 ; i < n ; i++) {
//	addEdge e2 = q.poll();
//	int x = e2.from;
//	int y = e2.to;
//	
//	if(a == x || a== y || b == x || b == y) { // 연결되어있으면
//		
//	}else {
//		q.offer(e2);
//	}
//}
//
//if(!q.isEmpty()) {
//	cnt++;
//	findConnect(q);
//}else
//	return;
