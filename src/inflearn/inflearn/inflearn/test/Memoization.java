package inflearn.inflearn.inflearn.test;

public class Memoization {
    static int[] fibo;
    public static void main(String[] args) {
        int n = 45;
        fibo = new int[n + 1];
        DFS(n);
        for (int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
    }

    private static int DFS(int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n - 2) + DFS (n - 1);
    }
}
