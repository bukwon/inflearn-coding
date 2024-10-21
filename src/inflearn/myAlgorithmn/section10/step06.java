package inflearn.myAlgorithmn.section10;

import java.util.Arrays;
import java.util.Scanner;

public class step06 {
    static int[] parent;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        parent = new int[N + 1];
        MakeSet(N);

        for (int i = 0; i < M; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            Union(num1, num2);
        }

        int check1 = find(sc.nextInt());
        int check2 = find(sc.nextInt());
        String answer = "";
        if (parent[check1] == parent[check2]) answer = "YES";
        else answer = "NO";

        System.out.println(Arrays.toString(parent));
        System.out.println(answer);
    }

    static void MakeSet(int N) {
        for (int i = 0; i <= N; i++) {
            parent[i] = i;
        }
    }

    static void Union(int num1, int num2) {
        int findA = find(num1);
        int findB = find(num2);

        if (findA > findB) {
            parent[findA] = findB;
        } else {
            parent[findB] = findA;
        }
    }

    static int find(int check) {
        if (check == parent[check]) return check;
        else return parent[check] = find(parent[check]);
    }
}
