package inflearn.myAlgorithmn.baekjoon;

import java.util.Scanner;

public class no1717 {
    static int[] parent;
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        parent = new int[n + 1];

        for (int i = 1; i <= n; i++) parent[i] = i;

        for (int i = 0; i < m; i++) {
            int check = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (check == 0) Union(a, b);
            else {
                int checkA = Find(a);
                int checkB = Find(b);
                if (checkA == checkB) sb.append("YES").append("\n");
                else sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }

    private static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (parent[fa] > parent[fb]) parent[fa] = parent[fb];
        else parent[fb] = parent[fa];
    }

    private static int Find(int num) {
        if (parent[num] == num) return num;
        return parent[num] = Find(parent[num]);
    }
}
