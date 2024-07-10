package inflearn.inflearn.inflearn.test;

public class Factorial {
    static int result = 1;
    public static void main(String[] args) {
        factorial(5);
        System.out.println(result);
    }

    private static void factorial(int i) {
        if (i == 1) return;

        factorial(i - 1);
        result *= i;
    }
}
