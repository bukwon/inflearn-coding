package inflearn.myAlgorithmn.section3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class step01 {
    static int n1;
    static int n2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> answer = new ArrayList<>();
        n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            answer.add(sc.nextInt());
        }
        n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            answer.add(sc.nextInt());
        }
        Collections.sort(answer);
        for (int i: answer) {
            System.out.print(i + " ");
        }
    }
}
