package 탐색알고리즘;

import java.util.*;

public class AStarAlgorithm {
    static class Node implements Comparable<Node> {
        int index;
        int f, g, h; // f = g + h
        List<Edge> edges;

        public Node(int index) {
            this.index = index;
            edges = new ArrayList<>();
        }

        public void addEdge(Edge e) {
            edges.add(e);
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(f, o.f);
        }
    }

    static class Edge {
        Node to;
        int weight;

        public Edge(Node to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        int V = 8;
        Node[] nodes = new Node[V];
        for (int i = 0; i < V; i++) {
            nodes[i] = new Node(i);
        }

        nodes[0].addEdge(new Edge(nodes[1], 5));
        nodes[0].addEdge(new Edge(nodes[2], 2));
        nodes[1].addEdge(new Edge(nodes[3], 4));
        nodes[1].addEdge(new Edge(nodes[4], 2));
        nodes[2].addEdge(new Edge(nodes[5], 1));
        nodes[2].addEdge(new Edge(nodes[6], 4));
        nodes[6].addEdge(new Edge(nodes[7], 3));

        int start = 0, end = 7;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(nodes[start]);
        nodes[start].g = 0;
        nodes[start].h = heuristic(nodes[start], nodes[end]);

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            if (current.index == end) {
                System.out.println("최단 경로: " + current.f);
                break;
            }
            for (Edge e : current.edges) {
                Node next = e.to;
                int newG = current.g + e.weight;
                if (next.g == 0 || newG < next.g) {
                    next.g = newG;
                    next.h = heuristic(next, nodes[end]);
                    next.f = next.g + next.h;
                    pq.offer(next);
                }
            }
        }
    }

    static int heuristic(Node n1, Node n2) {
        return Math.abs(n1.index - n2.index);
    }
}
