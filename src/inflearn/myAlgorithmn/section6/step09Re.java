package inflearn.myAlgorithmn.section6;

import java.util.Arrays;
import java.util.Scanner;

public class step09Re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(solution(m, array));
    }

    private static int solution(int m, int[] array) {
        int answer = 0;
        int min = Arrays.stream(array).max().getAsInt();
        int max = Arrays.stream(array).sum();
        while(min <= max) {
            int mid = (min + max) / 2;
            if (count(mid, array) <= m) {
                max = mid - 1;
                answer = mid;
            } else min = mid + 1;
        }
        return answer;
    }

    private static int count(int mid, int[] array) {
        int count = 1;
        int tmp = 0;
        for (int x: array) {
            if (tmp + x > mid) {
                count ++;
                tmp = x;
            } else tmp += x;
        }
        return count;
    }
}
// 어렵....