package inflearn.myAlgorithmn.section3;

import java.io.*;

public class step05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        bw.write(solution(n) + "");
        bw.flush(); bw.close(); bf.close();
    }

    private static int solution(int n) {
        int p1 = 1, p2 = 1, sum = 1, answer = 0;
        while(p2 <= n / 2 + 1) {
            if (sum < n) {
                sum += ++p2;
            }
            else if (sum > n)  {
                sum -= p1++;
            }
            else {
                answer ++;
                sum += ++p2;
            }
        }
        return answer;
    }
}