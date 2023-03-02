package 탐색알고리즘;

import java.util.*;

public class BFS {
	 public static void main(String[] args) {
	        int V = 8;
	        LinkedList<Integer>[] adj = new LinkedList[V];

	        for (int i = 0; i < V; i++)
	            adj[i] = new LinkedList();

	        addEdge(adj, 0, 1);
	        addEdge(adj, 0, 2);
	        addEdge(adj, 1, 3);
	        addEdge(adj, 1, 4);
	        addEdge(adj, 2, 5);
	        addEdge(adj, 2, 6);
	        addEdge(adj, 6, 7);

	        boolean[] visited = new boolean[V];
	        int[] distance = new int[V];
	        Queue<Integer> queue = new LinkedList<>();
	        int start = 0;

	        // 시작 노드를 큐에 enqueue 합니다.
	        queue.add(start);
	        visited[start] = true;
	        distance[start] = 0;

	        while (!queue.isEmpty()) {
	            // 큐에서 노드를 dequeue 합니다.
	            int node = queue.poll();
	            System.out.print(node + " ");

	            // 현재 노드의 인접 노드를 큐에 enqueue 합니다.
	            Iterator<Integer> i = adj[node].listIterator();
	            while (i.hasNext()) {
	                int n = i.next();
	                if (!visited[n]) {
	                    visited[n] = true;
	                    distance[n] = distance[node] + 1;
	                    queue.add(n);
	                }
	            }
	        }

	        // 각 노드까지의 최단 거리를 출력합니다.
	        System.out.println();
	        for (int i = 0; i < V; i++) {
	            System.out.println("노드 " + i + "까지의 최단 거리: " + distance[i]);
	        }
	    }

	    static void addEdge(LinkedList<Integer>[] adj, int v, int w) {
	        adj[v].add(w);
	        adj[w].add(v);
	    }
}
