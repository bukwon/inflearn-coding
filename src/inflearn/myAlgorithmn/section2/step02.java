package inflearn.myAlgorithmn.section2;

import java.util.Scanner;

public class step02 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(height(n));
    }

    private static int height(int n) {
        int[] height = new int[n];
        int standard = 0;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        for (int i: height) {
            if(i > standard) {
                answer ++;
                standard = i;
            }
        }
        return answer;
    }
}
