package inflearn.inflearn.inflearn.section6;

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
        Arrays.sort(array);
        int lt = 1;
        int rt = array[n-1];
        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(array, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }
        return answer;
    }

    private static int count(int[] array, int mid) {
        int cnt = 1;
        int ep = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] - ep >= mid) {
                cnt ++;
            }
        }
        return cnt;
    }
}
