package inflearn.myAlgorithmn.section6;

import java.util.Arrays;
import java.util.Scanner;

public class step10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(solution(n, c, array));
    }

    private static int solution(int n, int c, int[] array) {
        int answer = 0;
        int lt = Arrays.stream(array).min().getAsInt();
        int rt = Arrays.stream(array).max().getAsInt();
        int mid = (lt + rt) / 2;
        Arrays.sort(array);
        while(mid > 1) {
            int count = 1;
            int tmp = Integer.MAX_VALUE;
            int check1 = 0, check2 = 1;
            while(count < c && check2 < n) {
                if (array[check2] - array[check1] > mid) {
                    tmp = Math.min(tmp, array[check2] - array[check1]);
                    count ++;
                    check1 = check2; check2 = check1 + 1;
                } else check2 ++;
            }
            if (count == c) answer = tmp;
            mid /= 2;
        }
        return answer;
    }
}