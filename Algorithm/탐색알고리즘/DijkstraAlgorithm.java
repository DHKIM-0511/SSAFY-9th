package 탐색알고리즘;

import java.util.*;

public class DijkstraAlgorithm  {
    static final int INF = Integer.MAX_VALUE; // 무한대를 의미하는 값
    static int[][] graph = { // 그래프를 인접행렬로 표현합니다.
            {0, 2, 5, 1, INF, INF},
            {2, 0, 3, 2, INF, INF},
            {5, 3, 0, 3, 1, 5},
            {1, 2, 3, 0, 1, INF},
            {INF, INF, 1, 1, 0, 2},
            {INF, INF, 5, INF, 2, 0}
    };
    static boolean[] visited = new boolean[6]; // 방문 여부를 저장할 배열
    static int[] distance = new int[6]; // 시작점으로부터의 거리를 저장할 배열

    public static void main(String[] args) {
        int start = 0; // 시작점을 0으로 설정합니다.

        // distance 배열을 무한대로 초기화합니다.
        for (int i = 0; i < 6; i++) {
            distance[i] = INF;
        }

        distance[start] = 0; // 시작점의 거리는 0입니다.

        // 우선순위 큐를 이용하여 다익스트라 알고리즘을 구현합니다.
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll(); // 현재 노드를 꺼냅니다.

            if (!visited[node.vertex]) {
                visited[node.vertex] = true;

                for (int i = 0; i < 6; i++) {
                    if (graph[node.vertex][i] != INF) { // 인접한 노드 중에서
                        int newDistance = distance[node.vertex] + graph[node.vertex][i]; // 새로운 거리를 계산합니다.

                        if (newDistance < distance[i]) { // 더 짧은 거리라면
                            distance[i] = newDistance; // 거리를 갱신합니다.
                            pq.offer(new Node(i, newDistance)); // 우선순위 큐에 새로운 노드를 넣습니다.
                        }
                    }
                }
            }
        }

        // 결과를 출력합니다.
        for (int i = 0; i < 6; i++) {
            System.out.println(start + "부터 " + i + "까지의 최단 거리는 " + distance[i]);
        }
    }

    static class Node implements Comparable<Node> {
        int vertex; // 노드 번호
        int distance; // 시작점으로부터의 거리

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node o) {
            return this.distance - o.distance; // 거리를 기준으로 오름차순으로 정렬합니다.
        }
    }
}

