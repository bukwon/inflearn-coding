package inflearn.myAlgorithmn.section4;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class step05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }

    private static int solution(int n, int k, int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        return 0;
    }
}