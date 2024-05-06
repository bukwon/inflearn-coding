package inflearn.myAlgorithmn.section4;

import java.util.*;

public class step01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = new char[n];
        for (int i = 0; i < n; i++) {
            c[i] = s.charAt(i);
        }
        System.out.println(solution(c, n));
    }

    private static char solution(char[] c, int n) {
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> arr = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (arr.containsKey(c[i])) arr.put(c[i], arr.get(c[i]) + 1);
            else arr.put(c[i], +1);
        }
        for (int i = 0; i < n; i++) {
            if(max < arr.get(c[i])) {
                answer = c[i];
                max = arr.get(c[i]);
            }
        }
        return answer;
    }
}