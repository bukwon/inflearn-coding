package inflearn.myAlgorithmn.section8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class step02Test {
    static int C;
    static int N;
    static Integer[] weight;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        N = sc.nextInt();
        weight = new Integer[N];
        for (int i = 0; i < N; i++) weight[i] = sc.nextInt();

        Arrays.sort(weight, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        int sum = 0;
        for (int i: weight) {
            sum += i;
            if (sum > C) {
                sum -= i;
                break;
            }
        }
        System.out.println(sum);
    }
}
