package inflearn.myAlgorithmn.baekjoon;

import java.util.Scanner;

public class no1976 {
    static int[] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        parent = new int[N + 1];
        int[][] cities = new int[N][N + 2];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= N; j++) {
                cities[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i < N; i++) {
            for (int j = i; j >= 0; j--) {
                if (cities[i][j - 1] == 1) Union(i, j - 1);
                else break;
            }
            for (int j = i; j < N; j++) {
                if (cities[i][j + 1] == 1) Union(i, j + 1);
                else break;
            }
        }

        int[] check = new int[N];
        for (int i = 0; i < N; i++) {
            check[i] = sc.nextInt();
        }
        String answer = "YES";
        int result1 = find(check[0]);
        for (int i = 1; i < M; i++) {
            int result2 = find(check[i]);
            if (result1 != result2) {
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
    }

    static void Union(int num1, int num2) {
        int A = find(num1);
        int B = find(num2);
        if (parent[A] > parent[B]) parent[A] = parent[B];
        else parent[B] = parent[A];
    }

    static int find(int num) {
        if (num == parent[num]) return num;
        return parent[num] = find(parent[num]);
    }
}
