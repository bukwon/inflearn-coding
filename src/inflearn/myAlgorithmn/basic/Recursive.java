package inflearn.myAlgorithmn.basic;

public class Recursive {
    public static void main(String[] args) {
        DFS(3);
    }

    private static void DFS(int i) {
        if (i == 0) return;
        else {
            DFS(i - 1);
            System.out.println(i);
        }
    }
}
