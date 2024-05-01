package inflearn.myAlgorithmn.section3;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class step04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        int[] arr = new int[n + 1];
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        bw.write(solution(n, m, arr) + "");
        bw.flush(); bw.close(); bf.close();
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int p1 = 0, p2 = 1, sum = arr[p1];
        while(p2 <= n) {
            if(sum == m) {
                answer++;
                sum -= arr[p1++];
            } else if(sum > m) sum -= arr[p1++];
            else sum += arr[p2++];
        }
        return answer;
    }
}
