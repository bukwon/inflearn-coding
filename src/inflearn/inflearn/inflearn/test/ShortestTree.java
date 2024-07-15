package inflearn.inflearn.inflearn.test;

public class ShortestTree {
    static Node root;
    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        System.out.println(DFS(0, root));
    }

    public static int DFS(int L, Node root) {
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }
}

class Node {
    int data;
    Node lt, rt;
    Node(int val) {
        data = val;
        lt = rt = null;
    }
}
