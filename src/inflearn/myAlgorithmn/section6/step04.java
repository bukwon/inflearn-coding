package inflearn.myAlgorithmn.section6;

import java.util.Scanner;

public class step04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i: solution(s,n, arr)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(int s, int n, int[] arr) {
        int[] LRU = new int[s];

        for (int i = 0; i < n; i++) {
            boolean hit = false;
            int check = 0;
            for (int j = 0; j < s; j++) {
                if (LRU[j] == arr[i]) {
                    hit = true;
                    check = j;
                    break;
                } else if (LRU[j] == 0) break;
            }
            if (hit) {
                for (int j = check; j > 0; j--) {
                    int tmp = LRU[j];
                    LRU[j] = LRU[j - 1];
                    LRU[j - 1] = tmp;
                }
            } else {
                for (int j = s - 1; j > 0 ; j--) {
                    int tmp = LRU[j];
                    LRU[j] = LRU[j - 1];
                    LRU[j - 1] = tmp;
                }
                LRU[0] = arr[i];
            }
        }
        return LRU;
    }
}
