package inflearn.inflearn.inflearn.section6;

import java.util.Scanner;

public class step03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) array[i] = sc.nextInt();
        for (int i: solution(n, array)) System.out.print(i + " ");
    }

    private static int[] solution(int n, int[] array) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[idx]) idx = j;
            }
            int tmp = array[i];
            array[i] = array[idx];
            array[idx] = tmp;
        }
        return array;
    }
}
