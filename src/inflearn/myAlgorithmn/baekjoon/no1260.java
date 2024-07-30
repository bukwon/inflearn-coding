package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class no1260 {
    static int[][] treeArray;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();
        treeArray = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            treeArray[a][b] = 1;
            treeArray[b][a] = 1;
        }

        visited = new boolean[N + 1];
        dfs(V);

        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = true;

        while(!queue.isEmpty()) {
            v = queue.remove();
            System.out.print(v + " ");
            for (int i = 1; i < treeArray.length; i++) {
                if (treeArray[v][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    private static void dfs(int v) {
        if (v == treeArray.length) return;

        System.out.print(v + " ");
        visited[v] = true;
        for (int i = 1; i < treeArray.length; i++) {
            if (!visited[i] && treeArray[v][i] == 1) dfs(i);
        }
    }
}
