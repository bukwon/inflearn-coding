package inflearn.inflearn.inflearn.test;

public class Recursion {
    public static void main(String[] args) {
        DFS(11);
    }

    private static void DFS(int i) {
        if (i == 0) return;
        else {
            DFS(i / 2);
            System.out.print(i % 2 + " ");
        }
    }
}
