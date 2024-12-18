package inflearn.myAlgorithmn.baekjoon;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class no2352 {
    static int[] arr;
    static List<Integer> dy;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n + 1];
        dy = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        dy.add(arr[1]);

        int count = 1;
        for (int i = 2; i <= n; i++) {
            if (dy.get(count) > arr[i] && arr[i] > arr[i - 1]) {
                count ++;
                dy.add(arr[i]);
            }
        }

        System.out.println(count);
    }
}
