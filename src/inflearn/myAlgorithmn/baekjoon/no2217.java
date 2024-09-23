package inflearn.myAlgorithmn.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class no2217 {
    static int n, answer = Integer.MIN_VALUE;
    static Integer[] weight;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        weight = new Integer[n];
        for (int i = 0; i < n; i++) {
            weight[i] = Integer.parseInt(bf.readLine());
        }
        solution();
        System.out.println(answer);
    }

    private static void solution() {
        Arrays.sort(weight, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, weight[i] * (i + 1));
        }
    }
}
