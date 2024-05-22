package inflearn.myAlgorithmn.section6;

import java.util.Scanner;

public class step01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i: solution(n, array)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(int n, int[] array) {
        int[] answer = new int[n];
        for (int i = 0; i < n - 1; i ++) {
            for (int j = i + 1; j < n; j ++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            answer[i] = array[i];
        }
        answer[n - 1] = array[n - 1];
        return answer;
    }
}
