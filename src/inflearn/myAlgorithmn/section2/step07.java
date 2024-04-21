package inflearn.myAlgorithmn.section2;

import java.util.Scanner;

public class step07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(scoreCalc(num));
    }

    private static int scoreCalc(int[] num) {
        int answer = 0;
        int score = 1;
        for (int i: num) {
            if(i == 1){
                answer += score;
                score ++;
            } else score = 1;
        }
        return answer;
    }
}
