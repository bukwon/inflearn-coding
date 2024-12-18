package inflearn.myAlgorithmn.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class no11053 {
    static int[] arr;
    static List<Integer> length;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        length = new ArrayList<>();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        length.add(arr[0]);
        int check = 0;
        for (int i = 1; i < n; i++) {
            if (length.get(check) < arr[i]) {
                length.add(arr[i]);
                check ++;
            }
            else {
                int check2 = check;
                for (int j = check; j >= 0; j--) {
                    if (length.get(j) < arr[i]) break;
                    check2 = j;
                }
                length.set(check2, arr[i]);
            }
        }

        System.out.println(length.size());
    }
}
