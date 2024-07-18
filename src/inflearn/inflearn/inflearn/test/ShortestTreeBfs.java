package inflearn.inflearn.inflearn.test;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestTreeBfs {
    static STFNode root;
    public static void main(String[] args) {
        root = new STFNode(1);
        root.lt = new STFNode(2);
        root.rt = new STFNode(3);
        root.lt.lt = new STFNode(4);
        root.lt.rt = new STFNode(5);
        System.out.println(BFS(root));
    }

    private static int BFS(STFNode root) {
        Queue<STFNode> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                STFNode cur = Q.poll();
                if (cur.lt == null && cur.rt == null) return L;
                if (cur.lt != null) Q.offer(cur.lt);
                if (cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }
}

class STFNode {
    int data;
    STFNode lt, rt;
    public STFNode(int val) {
        data = val;
        lt = rt = null;
    }
}
