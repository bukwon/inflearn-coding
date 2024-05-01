package inflearn.inflearn.inflearn.section3;

import java.io.*;
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
        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(sum == m) answer ++;
            while(sum >= m) {
                sum -= arr[lt++];
                if(sum == m) answer ++;
            }
        }
        return answer;
    }
}
