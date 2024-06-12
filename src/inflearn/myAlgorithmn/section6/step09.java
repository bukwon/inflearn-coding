package inflearn.myAlgorithmn.section6;

import java.util.ArrayList;
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
        Arrays.sort(dvd);
        int right = 0, left = dvd[0];
        for (int i = 0; i < n; i++) {
            right += dvd[i];
        }
        int mid = (left + right) / 2;
        int i = 0;
        ArrayList<Integer> tmp = new ArrayList<>();
        boolean flag = true;
        while(flag) {
            int check = 0;
            while(tmp.size() < m) {
                check += dvd[i];
                if (check > mid) {
                    check -= dvd[i];
                    tmp.add(check);
                    check = 0;
                } else {
                    if (i == n - 1) {
                        tmp.add(check);
                        break;
                    }
                    i ++;
                }
            }
            if (tmp.size() == m) flag = false;
            else {
                tmp = new ArrayList<>();
                right = mid;
                mid = (left + right) / 2;
                i = 0;
            }
        }
        int answer = 0;
        for (int z: tmp) {
            answer = Math.max(answer, z);
        }
        return answer;
    }
}
