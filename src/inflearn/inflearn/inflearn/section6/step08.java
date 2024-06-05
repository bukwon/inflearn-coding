package inflearn.inflearn.inflearn.section6;

import java.util.Arrays;
import java.util.Scanner;

public class step08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextInt();
        System.out.println(solution(n, m, array));
    }

    private static int solution(int n, int m, int[] array) {
        int answer = 0, lt = 0, rt = n - 1;
        boolean flag = true;
        Arrays.sort(array);
        while(flag) {
            int mid = (lt + rt) / 2;
            if (array[mid] == m)  {
                answer += mid + 1;
                flag = false;
            }
            else {
                if (array[mid] > m) rt = mid;
                else lt = mid;
            }
        }
        return answer;
    }
}