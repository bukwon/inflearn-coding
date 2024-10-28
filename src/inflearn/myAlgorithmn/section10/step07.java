package inflearn.myAlgorithmn.section10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class step07 {
    static int[] parent;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        List<Node> list = new ArrayList<>();
        parent = new int[V + 1];

        for (int i = 1; i <= V; i++) parent[i] = i;
        for (int i = 0; i < E; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int cost = sc.nextInt();
            Node node = new Node(start, end, cost);
            list.add(node);
        }

        Collections.sort(list);

        int answer = 0;

        for(Node tmp :list) {
            int f1 = Find(tmp.start);
            int f2 = Find(tmp.end);

            if (f1 != f2) {
                Union(tmp.start, tmp.end);
                answer += tmp.cost;
            }
        }

        System.out.println(answer);
    }
    static void Union(int num1, int num2) {
        int FindA = Find(num1);
        int FindB = Find(num2);
        if (parent[FindA] > parent[FindB]) parent[FindA] = parent[FindB];
        else parent[FindB] = parent[FindA];
    }

    static int Find(int num) {
        if (parent[num] == num) return num;
        return parent[num] = Find(parent[num]);
    }
}

class Node implements Comparable<Node>{
    int start;
    int end;
    int cost;

    public Node(int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return this.cost - o.cost;
    }
}