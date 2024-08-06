package inflearn.myAlgorithmn.baekjoon;

import java.util.*;

public class no1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String Pocket = sc.next();
            map1.put(Pocket, i + 1); // 키 값 문자
            map2.put(i + 1, Pocket); // 키 값 숫자
        }

        for (int i = 0; i < M; i++) {
            String tmp = sc.next();
            if ((int) tmp.charAt(0) - 48 < 10) {
                sb.append(map2.get(Integer.valueOf(tmp))).append("\n");
            } else {
                sb.append(map1.get(tmp)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
