package inflearn.etc.baekjoon.retest;

import java.io.*;

public class no9342 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String str = bf.readLine();
            if(str.matches("^[B-F]?A+F+C+[A-F]?")) {
                sb.append("Infected!");
            } else {
                sb.append("Good");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.close(); bf.close();
    }
}
