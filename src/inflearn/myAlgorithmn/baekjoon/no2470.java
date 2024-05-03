package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no2470{
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        solution(arr, n);
    }

    private static void solution(int[] arr, int n) throws IOException {
        Arrays.sort(arr);
        int start = 0, end = n - 1, sum = 0;
        int num1 = 0, num2 = 0;
        int check = Integer.MAX_VALUE;
        while(start < end) {
            sum = arr[start] + arr[end];
            if (Math.abs(sum) < check) {
                check = Math.abs(sum);
                num1 = arr[start];
                num2 = arr[end];
            }
            if (sum > 0) end--;
            else start ++;
        }
        bw.write(num1 + " " + num2);
        bw.flush(); bw.close(); bf.close();
    }
}
