package inflearn.myAlgorithmn.section4;

import java.io.*;
import java.util.HashMap;

public class step02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s1 = bf.readLine();
        String s2 = bf.readLine();
        bw.write(solution(s1, s2) + " ");
        bw.flush(); bw.close(); bf.close();
    }

    private static String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char c: s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c: s2.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) -1);
        }
        for (char c: map1.keySet()) {
            if(map1.get(c) != 0) {
                answer = "NO";
                break;
            }
        }
        return answer;
    }
}