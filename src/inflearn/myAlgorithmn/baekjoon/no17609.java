package inflearn.myAlgorithmn.baekjoon;

import java.util.Scanner;

public class no17609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        solution(n, arr);
    }

    private static void solution(int n, String[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            char[] c = arr[i].toCharArray();
            StringBuilder sb = new StringBuilder(arr[i]).reverse();
            if (arr[i].equals(String.valueOf(sb))) answer[i] = 0;
            else {
                int p1 = 0, p2 = arr[i].length() - 1;
                while (p1 < p2) {
                    if (c[p1] != c[p2]) {
                        StringBuilder sb1 = new StringBuilder(arr[i]).deleteCharAt(p1);
                        StringBuilder sb2 = new StringBuilder(arr[i]).deleteCharAt(p2);
                        if (sb1.toString().equals(sb1.reverse().toString()) || sb2.toString().equals(sb2.reverse().toString())) {
                            answer[i] = 1;
                        } else answer[i] = 2;
                        break;
                    } else {
                        p1++;
                        p2--;
                    }
                }
            }
        }
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
