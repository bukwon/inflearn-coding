package inflearn.myAlgorithmn.baekjoon;

import java.util.Scanner;

public class no1976Result {
    static int n, m;
    static int[] parent;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) {
                    union(i,j);
                }
            }
        }
        int start = sc.nextInt();
        for (int i = 1; i < m; i++) {
            int next = sc.nextInt();
            if (parent[start] != parent[next]) {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
    private static void union(int num1, int num2) {
        int A = find(num1);
        int B = find(num2);
        if (parent[A] > parent[B]) parent[A] = parent[B];
        else parent[B] = parent[A];
    }

    private static int find(int num) {
        if (num == parent[num]) return num;
        return parent[num] = find(parent[num]);
    }
}
