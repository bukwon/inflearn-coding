package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.*;

public class no6443 {
    static char[] arr;
    static int[] visit;
    static StringBuilder sb;
    static Stack<Character> s;
    static Set<String> set;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            set = new TreeSet<>();
            arr = bf.readLine().toCharArray();
            visit = new int[26];
            for (char c : arr) {
                visit[c - 'a']++;
            }
            s = new Stack<>();
            backTracking(arr.length);
            set.stream().forEach(s -> result.append(s).append("\n"));
        }
        bw.write(result.toString() + "");
        bw.flush();
        bw.close();
        bf.close();
    }

    private static void backTracking(int depth) {
        if (depth == s.size()) {
            StringBuilder sb = new StringBuilder();
            for (char c: s) {
                sb.append(c);
            }
            set.add(sb.toString());
        }

        for (int i = 0; i < 26; i++) {
            if (visit[i] > 0) {
                visit[i]--;
                s.push((char)(i + 'a'));
                backTracking(depth);
                s.pop();
                visit[i]++;
            }
        }
    }
}