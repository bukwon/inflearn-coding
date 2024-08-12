package inflearn.myAlgorithmn.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class no11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> sentences = new ArrayList<>();
        String s = "";
        StringBuilder sb = new StringBuilder();
        while(true) {
            s = bf.readLine();
            if (s.equals("END")) break;
            sb.append(s);
        }
        for (String tmp: sentences) {
            for (int i = tmp.length() - 1; i >= 0 ; i--) {
                sb.append(tmp.charAt(i));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
