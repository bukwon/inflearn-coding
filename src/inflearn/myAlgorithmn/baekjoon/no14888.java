package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class no14888 {
    static int[] sequence;
    static int[] calculation;
    static int[] arr;
    static boolean[] visit;
    static long minNum = Integer.MAX_VALUE;
    static long maxNum = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        sequence = new int[n];
        for (int i = 0; i < n; i++) sequence[i] = Integer.parseInt(st.nextToken());

        int[] calcTmp = new int[4];
        visit = new boolean[n - 1];
        calculation = new int[n - 1];
        arr = new int[n - 1];
        st = new StringTokenizer(bf.readLine());
        int j = 0, z = 1;
        for (int i = 0; i < 4; i++) {
            calcTmp[i] = Integer.parseInt(st.nextToken());
            while (calcTmp[i] > 0) {
                calcTmp[i] --;
                calculation[j] = z;
                j++;
            }
            z++;    // 1 = '+' , 2 = '-' , 3 = '*' , 4 = '/'
        }
        backTracking(n,0);
        bw.write(maxNum + "\n" + minNum);
        bw.flush(); bw.close(); bf.close();
    }

    private static void backTracking(int n, int depth) {
        if (depth == n - 1) {
            int result = getResult();
            minNum = Math.min(result, minNum);
            maxNum = Math.max(result, maxNum);
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = calculation[i];
                backTracking(n, depth + 1);
                visit[i] = false;
            }
        }
    }

    private static int getResult() {
        int count = 0;
        int result = sequence[count];
        for (int i: arr) {
            switch (i) {
                case 1:
                    result += sequence[count + 1];
                    break;
                case 2:
                    result -= sequence[count + 1];
                    break;
                case 3:
                    result *= sequence[count + 1];
                    break;
                default:
                    result /= sequence[count + 1];
            }
            count ++;
        }
        return result;
    }
}
