package inflearn.reTest.section2;

import java.util.Scanner;

public class step04re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int num: solution(n)) {
            System.out.print(num + " ");
        }
    }

    private static int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1; answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }
        return answer;
    }
}
