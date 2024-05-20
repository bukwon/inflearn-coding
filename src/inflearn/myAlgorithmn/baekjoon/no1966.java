package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(bf.readLine());

        for (int i = 0; i < tc; i++) {
            Queue<Integer> queue1 = new LinkedList<>(); // 문서
            Queue<Integer> queue2 = new LinkedList<>(); // 중요도
            StringTokenizer st1 = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st1.nextToken());
            int m = Integer.parseInt(st1.nextToken());
            int[] imp = new int[n + 1];
            int max = Integer.MIN_VALUE;
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            for (int j = 0; j < n; j++) {
                queue1.add(j);
                imp[j + 1] = Integer.parseInt(st2.nextToken());
                if (max < imp[j + 1]) max = imp[j + 1];
                queue2.add(imp[j + 1]);
            }
            Arrays.sort(imp);
            int answer = 101;
            int count =  0;
            int tmp = n;
            while (answer != m) {
                if (queue2.element() == max) {
                    count ++;
                    queue2.remove();
                    answer = queue1.remove();
                    max = imp[--tmp];
                } else {
                    queue2.offer(queue2.poll());
                    queue1.offer(queue1.poll());
                }
            }
            sb.append(count).append('\n');
        }
        bw.write(sb + "");
        bw.flush(); bw.close(); bf.close();
    }
}