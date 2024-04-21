package inflearn.inflearn.section7;

public class step05 {
    Node node;
    public void DFS(Node root) {
        if(root == null) return;
        else {
            DFS(root.lt);
            System.out.print(root.data+" ");
            DFS(root.rt);
        }
    }
    public static void main(String[] args) {
        step05 tree = new step05();
        tree.node = new Node(1);
        tree.node.lt = new Node(2);
        tree.node.rt = new Node(3);
        tree.node.lt.lt = new Node(4);
        tree.node.lt.rt = new Node(5);
        tree.node.rt.lt = new Node(6);
        tree.node.rt.rt = new Node(7);
        tree.DFS(tree.node);
    }
}

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data=val;
        lt=rt=null;
    }
}
