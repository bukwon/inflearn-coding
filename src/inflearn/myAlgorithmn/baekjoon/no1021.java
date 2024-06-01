package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class no1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] num = new int[m];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < m; i++) num[i] = Integer.parseInt(st.nextToken());
        bw.write(solution(n, m, num) + " ");
        bw.flush(); bw.close(); bf.close();
    }

    private static String solution(int n, int m, int[] num) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) list.add(i);

        for (int i = 0; i < m; i++) {
            int count = 0;
            if (check(num[i], list)) {
                for (int j = 0; j <= list.size() / 2; j++) {
                    int tmp = list.pollFirst();
                    if (tmp == num[i]) break;
                    count ++;
                    list.offerLast(tmp);
                }
            } else {
                for (int j = list.size() / 2 + 1; j < list.size(); j++) {
                    int tmp = list.pollLast();
                    count ++;
                    if (tmp == num[i]) break;
                    list.offerFirst(tmp);
                }
            }
            answer += count;
        }

        return String.valueOf(sb.append(answer));
    }

    private static boolean check(int i, LinkedList<Integer> list) {
        int size = list.size();

        for (int j = 0; j <= size / 2; j++) {
            if (list.get(j) == i) return true;
        }
        return false;
    }
}
