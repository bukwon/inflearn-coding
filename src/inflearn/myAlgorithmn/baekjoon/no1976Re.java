package inflearn.myAlgorithmn.baekjoon;

import java.util.Scanner;

public class no1976Re {
    static int[] parent;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        parent = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) Union(i, j);
            }
        }

        int result = find(parent[sc.nextInt()]);
        String answer = "YES";
        for (int i = 1; i < M; i++) {
            int tmp = find(parent[sc.nextInt()]);
            if (result != tmp) {
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
    }

    private static void Union(int num1, int num2) {
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
