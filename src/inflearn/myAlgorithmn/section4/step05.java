package inflearn.myAlgorithmn.section4;

import java.util.Collections;
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
        System.out.println(Solution(arr, n, k));
    }

    private static int Solution(int[] arr, int n, int k) {
        int answer = Integer.MIN_VALUE;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            Tset.add(arr[i]);
        }
        int[] arrTmp = new int[Tset.size()];
        int tmp = 0;
        for (int i : Tset) {
            arrTmp[tmp++] = i;
        }
        int count = 0;
        for (int i = 0; i < Tset.size() - 2; i++) {
            for (int j = i + 1; j < Tset.size() - 1; j++) {
                for (int l = j + 1; l < Tset.size(); l++) {
                    answer = arrTmp[i] + arrTmp[j] + arrTmp[l];
                    count++;
                    if (count == k) return answer;
                }
            }
        }
        return -1;
    }
}
// 내껀 오답