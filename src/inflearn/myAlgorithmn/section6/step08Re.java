package inflearn.myAlgorithmn.section6;

import java.util.Arrays;
import java.util.Scanner;

public class step08Re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(solution(n,m,array));
    }

    private static int solution(int n, int m, int[] array) {
        Arrays.sort(array);
        int right = n - 1, left = 0;
        int mid = (right + left) / 2;
        while(array[mid] != m) {
            if (array[mid] > m) right = mid;
            else left = mid;
            mid = (right + left) / 2;
        }
        return mid + 1;
    }
}
