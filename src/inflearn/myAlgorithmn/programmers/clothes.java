package inflearn.myAlgorithmn.programmers;

import java.util.*;

public class clothes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] clothes = new String[n][2];
        for (int i = 0; i < n; i++) {
            clothes[i][0] = sc.next();
            clothes[i][1] = sc.next();
        }
        System.out.println(solution(clothes));
    }

    private static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }

        Iterator<Integer> iter = hm.values().iterator();

        while (iter.hasNext()) {
            answer *= iter.next().intValue() + 1;
        }

        return answer - 1;
    }
}
