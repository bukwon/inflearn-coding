package inflearn.myAlgorithmn.section2;

import java.util.Scanner;

public class step04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i: fibonnachi(n)) {
            System.out.print(i + " ");
        }
    }

    private static int[] fibonnachi(int n) {
        int[] answer = new int[n];
        answer[0] = 1; answer[1] = 1;
        if(n > 2) {
            for (int i = 0; i < n - 2; i++) {
                answer[i + 2] = answer[i + 1] + answer[i];
            }
        }
        return answer;
    }
}