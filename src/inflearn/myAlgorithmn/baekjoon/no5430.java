package inflearn.myAlgorithmn.baekjoon;

import java.util.*;

public class no5430 {
    static int T;
    static char[] p;
    static String s;
    static int n;
    static ArrayDeque<Integer> Q;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            s = sc.next();
            p = s.toCharArray();
            n = sc.nextInt();
            StringTokenizer str = new StringTokenizer(sc.next(), "[],");
            Q = new ArrayDeque<>();
            for (int j = 0; j < n; j++) {
                Q.add(Integer.parseInt(str.nextToken()));
            }
            solution();
        }
        System.out.print(sb);
    }

    private static void solution() {
        boolean flag = false;   // 방향전환용

        for (char c : p) {   // 10만보다 작음
            /*if (n == 0 && s.contains("D")) {
                sb.append("error");
                endPoint = true;
                return;
            }*/
            if (c == 'R') {
                flag = !flag; // true일 시, reverse형태로 변환, false일 시, 정방향
            } else {
                if (Q.isEmpty()) {
                    sb.append("error").append("\n");
                    return;
                }
                if (flag) Q.removeLast();
                else Q.removeFirst();
            }
        }

        sb.append("[");

        while (!Q.isEmpty()) {
            if (flag) sb.append(Q.removeLast());
            else sb.append(Q.removeFirst());
            if (Q.isEmpty()) continue;
            sb.append(",");
        }
        sb.append("]").append("\n");
    }
}
