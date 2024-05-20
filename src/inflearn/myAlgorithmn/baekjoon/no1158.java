package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) queue.add(i);

        StringBuilder sb = new StringBuilder();
        int tmp = 0;
        sb.append("<");
        while(queue.size() != 1) {
            tmp++;
            if (tmp == k) {
                sb.append(String.valueOf(queue.poll())).append(", ");
                tmp = 0;
            }
            else queue.add(queue.poll());
        }
        sb.append(queue.poll()).append(">");
        bw.write(sb + "");
        bw.flush(); bw.close(); bf.close();
    }
}
