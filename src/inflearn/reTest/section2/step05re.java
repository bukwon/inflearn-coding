package inflearn.reTest.section2;

import java.util.Scanner;

public class step05re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        int[] count = new int[n];
        count[0] = 1;
        for (int i = 1; i < n; i++) {
            if(count[i] == 0) answer ++;
            for (int j = i+1; j <= n; j += i + 1) {
                count[j - 1] = 1;
            }
        }
        return answer;
    }
}