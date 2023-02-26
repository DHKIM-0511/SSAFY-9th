package 탐색알고리즘;

import java.util.*;

public class DFS {
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
        Stack<Integer> stack = new Stack<>();
        int start = 0;

        // 시작 노드를 스택에 push 합니다.
        stack.push(start);
        visited[start] = true;

        int maxDist = 0;
        int farthestNode = start;

        while (!stack.isEmpty()) {
            // 스택의 top에 있는 노드를 pop 합니다.
            int node = stack.pop();

            // 현재 노드와 시작 노드와의 거리를 계산합니다.
            int dist = node - start;
            if (dist > maxDist) {
                maxDist = dist;
                farthestNode = node;
            }

            // 현재 노드의 인접 노드를 스택에 push 합니다.
            Iterator<Integer> i = adj[node].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    stack.push(n);
                }
            }
        }

        System.out.println("가장 멀리 떨어진 노드: " + farthestNode);
        System.out.println("거리: " + maxDist);
    }

    static void addEdge(LinkedList<Integer>[] adj, int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }
}

