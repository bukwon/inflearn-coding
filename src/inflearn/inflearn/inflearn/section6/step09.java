package inflearn.inflearn.inflearn.section6;

import java.util.Arrays;
import java.util.Scanner;

public class step09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dvd = new int[n];
        for (int i = 0; i < n; i++) {
            dvd[i] = sc.nextInt();
        }
        System.out.println(solution(n,m,dvd));
    }

    private static int solution(int n, int m, int[] dvd) {
        int answer = 0;
        int lt = Arrays.stream(dvd).max().getAsInt();
        int rt = Arrays.stream(dvd).sum();
        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(dvd, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            }
            else lt = mid + 1;
        }
        return answer;
    }

    private static int count(int[] dvd, int mid) {
        int cnt = 1, sum = 0;
        for (int x: dvd) {
            if (sum + x > mid)  {
                cnt ++;
                sum = x;
            }
            else sum += x;
        }
        return cnt;
    }
}
