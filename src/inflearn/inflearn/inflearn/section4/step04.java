package inflearn.inflearn.inflearn.section4;

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
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        for (char x: t.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }
        int L = t.length()-1;
        for (int i = 0; i < L; i++) am.put(s.charAt(i), am.getOrDefault(s.charAt(i), 0) + 1);
        int lt = 0;
        for (int rt = L; rt < s.length(); rt++) {
            am.put(s.charAt(rt), am.getOrDefault(s.charAt(rt), 0) + 1);
            if (am.equals(bm)) answer ++;
            am.put(s.charAt(lt), am.get(s.charAt(lt)) - 1);
            if (am.get(s.charAt(lt)) == 0) am.remove(s.charAt(lt));
            lt++;
        }
        return answer;
    }
}
