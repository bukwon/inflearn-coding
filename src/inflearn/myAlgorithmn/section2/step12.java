package inflearn.myAlgorithmn.section2;

import java.util.HashMap;
import java.util.Scanner;

public class step12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(mentoring(arr ,n ,m));
    }

    private static int mentoring(int[][] arr, int n, int m) {
        int[][] student = new int[n][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    for (int l = 0; l < n; l++) {
                        //4중 포문 포기.... 추후에 다른 방식으로 해결
                    }
                }
            }
        }
        
        return 0;
    }
}
