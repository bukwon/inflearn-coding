package inflearn.inflearn.inflearn.section10;

import java.util.ArrayList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class step08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Edges>> graph = new ArrayList<ArrayList<Edges>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edges>());
        }
        int[] ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edges(b,c));
            graph.get(b).add(new Edges(a, c));
        }
        int answer = 0;
        PriorityQueue<Edges> pq = new PriorityQueue<>();
        pq.offer(new Edges(1, 0));
        while (!pq.isEmpty()) {
            Edges tmp = pq.poll();
            int ev = tmp.vex;
            if(ch[ev] == 0) {
                ch[ev] = 1;
                answer += tmp.cost;
                for (Edges ob : graph.get(ev)) {
                    if (ch[ob.vex] == 0) pq.offer(new Edges(ob.vex, ob.cost));
                }
            }
        }
        System.out.println(answer);
    }
}

class Edges implements Comparable<Edges> {
    int vex;
    int cost;
    Edges(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edges o) {
        return this.cost - o.cost;
    }
}