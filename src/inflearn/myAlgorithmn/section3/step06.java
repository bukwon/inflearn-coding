package inflearn.myAlgorithmn.section3;

import java.util.Scanner;

public class step06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }

    private static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int p1 = 0, p2 = 0, count = 0, length = 0;
        while (p2 < n) {
            if (arr[p2++] == 0) {
                count ++;
                if (count > k) {
                    length = p2 - p1 -1;
                    while(count > k) {
                        if (arr[p1++] == 1) continue;
                        count --;
                    }
                    if (answer < length) {
                        answer = length;
                    }
                }
            }
        }
        return answer;
    }
}
