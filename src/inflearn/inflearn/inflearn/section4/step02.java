package inflearn.inflearn.inflearn.section4;

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
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x: s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : s2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x) - 1);
        }
        return answer;
    }
}
