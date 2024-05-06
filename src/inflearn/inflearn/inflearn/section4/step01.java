package inflearn.inflearn.inflearn.section4;

import java.util.HashMap;
import java.util.Scanner;

public class step01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(Solution(n, s));
    }

    private static char Solution(int n, String s) {
        char answer = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x: s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                answer = key;
                max = map.get(key);
            }
        }
        return answer;
    }
}
