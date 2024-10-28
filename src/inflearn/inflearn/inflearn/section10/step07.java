package inflearn.inflearn.inflearn.section10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class step07 {
    static int[] unf;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n+1];
        ArrayList<NodeTmp> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) unf[i] = i;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new NodeTmp(a,b,c));
        }
        int answer = 0;
        Collections.sort(arr);

        for(NodeTmp tmp : arr) {
            int fv1 = Find(tmp.start);
            int fv2 = Find(tmp.end);
            if(fv1 != fv2) {
                answer += tmp.cost;
                Union(fv1, fv2);
            }
        }

        System.out.println(answer);
    }
    public static void Union(int num1, int num2) {
        int fa = Find(num1);
        int fb = Find(num2);
        if (fa != fb) unf[fa] = fb;
    }

    private static int Find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }
}

class NodeTmp implements Comparable<NodeTmp>{
    int start;
    int end;
    int cost;

    public NodeTmp(int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo(NodeTmp o) {
        return cost - o.cost;
    }
}
