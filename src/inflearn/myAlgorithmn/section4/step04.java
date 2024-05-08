package inflearn.myAlgorithmn.section4;

import java.util.HashMap;
import java.util.Scanner;

public class step04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(solution(s, t));
    }

    private static int solution(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int answer = 0, p1 = 0, p2 = t.length() - 1;
        char[] c = s.toCharArray();
        char[] tmp = t.toCharArray();
        for (int i = 0; i < t.length(); i++) {
            map1.put(c[i], map1.getOrDefault(c[i], 0) + 1);
            map2.put(tmp[i], map2.getOrDefault(tmp[i], 0) + 1);
        }

        if (map1.equals(map2)) answer ++;
        p2++;

        while(p2 < s.length()) {
            map1.put(c[p1], map1.get(c[p1]) - 1);
            if(map1.get(c[p1]) == 0) map1.remove(c[p1]);
            map1.put(c[p2], map1.getOrDefault(c[p2], 0) + 1);
            if (map1.equals(map2)) {
                answer++;
            }
            p1++; p2++;
        }
        return answer;
    }
}
