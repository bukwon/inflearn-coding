package inflearn.inflearn.inflearn.test;

public class dfs {
    NodeDFS root;
    public static void main(String[] args) {
        dfs tree = new dfs();
        tree.root = new NodeDFS(1);
        tree.root.lt = new NodeDFS(2);
        tree.root.rt = new NodeDFS(3);
        tree.root.lt.lt = new NodeDFS(4);
        tree.root.lt.rt = new NodeDFS(5);
        tree.root.rt.lt = new NodeDFS(6);
        tree.root.rt.rt = new NodeDFS(7);
        tree.DFS(tree.root);
    }

    public void DFS(NodeDFS root) {
        if (root == null) return;
        else {
            System.out.print(root.data + " ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }
}

class NodeDFS{
    int data;
    NodeDFS lt, rt;
    public NodeDFS(int val) {
        data = val;
        lt=rt=null;
    }
}
