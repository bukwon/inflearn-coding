package inflearn.myAlgorithmn.hanbat;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < 5; i++) {
            score = sc.nextInt();
            if (score < 40) {
                System.out.println("F");
                return;
            }
        }

        score /= 5;

        if (score >= 60) System.out.println("P");
        else System.out.println("F");
    }
}
