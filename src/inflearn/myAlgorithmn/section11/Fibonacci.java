package inflearn.myAlgorithmn.section11;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibo(5));
    }

    private static int Fibo(int count) {
        int[] arr = new int[count];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < count; i++) arr[i] = arr[i - 1] + arr[i - 2];

        return arr[count - 1];
    }
}
