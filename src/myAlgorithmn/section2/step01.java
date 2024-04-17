package myAlgorithmn.section2;

import java.util.ArrayList;
import java.util.Scanner;

public class step01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i: bigInt(num, n)) {
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> bigInt(int[] num, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(num[0]);
        for (int i = 1; i < n; i++) {
            if(num[i] > num[i-1]) answer.add(num[i]);
        }
        return answer;
    }
}
