package inflearn.inflearn.inflearn.test;

public class 플로이드워셜 {
    public static void print(int[][] graph) {
        for (int i = 1; i < graph.length; i++) {
            for (int j = 1; j < graph.length; j++) {
                if (graph[i][j] == 999_999_999)
                    System.out.print("INF ");
                else
                    System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void putEdge(int[][] graph, int x, int y, int edge) {
        graph[x][y] = edge;
        graph[y][x] = edge;
    }
    public static void main(String[] args) {
        int n = 5; //그래프 정점의 개수
        int[][] graph = new int[n+1][n+1]; //index를 1부터 맞추기 위해 n+1

        putEdge(graph, 1, 2, 9);
        putEdge(graph, 1, 3, 2);
        putEdge(graph, 1, 4, 4);
        putEdge(graph, 2, 3, 5);
        putEdge(graph, 2, 5, 7);
        putEdge(graph, 3, 4, 1);
        putEdge(graph, 4, 5, 8);

        System.out.println("주어진 그래프의 모양");
        print(graph); //주어진 그래프다.
        System.out.println();

        int[][] floyd = new int[n+1][n+1];
        for (int i = 1; i < floyd.length; i++) {
            for (int j = 1; j < floyd.length; j++) {
                if (i == j)
                    floyd[i][j] = 0; //노드를 0개 거쳐가는 경우는 자기 자신뿐이다.
                else //불가능한 경우는 매우 큰값을 넣는다. 모든 노드를 거쳐간 값보다도 클 수 있도록
                    floyd[i][j] = 999_999_999;
            }
        }
        // 주어진 가중치 값을 집어넣는다. 즉, 노드를 1개 거쳐가는 경우를 넣는다.
        putEdge(floyd, 1, 2, 9);
        putEdge(floyd, 1, 3, 2);
        putEdge(floyd, 1, 4, 4);
        putEdge(floyd, 2, 3, 5);
        putEdge(floyd, 2, 5, 7);
        putEdge(floyd, 3, 4, 1);
        putEdge(floyd, 4, 5, 8);

        // 플루이드-워셜 알고리즘 실행
        for (int i = 1; i < floyd.length; i++) {
            for (int j = 1; j < floyd.length; j++) {
                for (int k = 1; k < floyd.length; k++) {
                    // 기존 j -> k까지의 거리와, i번째 노드를 거쳐가는 거리를 비교해 최단거리 갱신
                    floyd[j][k] = Math.min(floyd[j][k], floyd[j][i] + floyd[i][k]);
                }
            }
        }
    }
}
