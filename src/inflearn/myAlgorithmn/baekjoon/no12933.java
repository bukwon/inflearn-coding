package inflearn.myAlgorithmn.baekjoon;

import java.io.*;

public class no12933 {
    static char[] c;
    static int answer = 0;
    static int len;
    static char[] cry = {'q', 'u', 'a', 'c', 'k'};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        c = bf.readLine().toCharArray();
        len = c.length;
        implementation();
    }

    private static void implementation() {
        if (len % 5 != 0) {
            System.out.println(-1);
            return;
        }

        boolean[] used = new boolean[len];
        while (true) {
            int check = 0;  // 오리 울음소리 자리 체크
            boolean flag = false; // 한번도 안울었음을 방지하기 위함

            for (int i = 0; i < len; i++) {
                if (!used[i] && cry[check] == c[i]) {
                    check++;
                    used[i] = true;
                    if (check == 5) {
                        check = 0;
                        flag = true;
                    }
                }
            }

            if (check != 0) {
                System.out.println(-1);
                return;
            }

            if (!flag) {
                break;
            }

            answer++;
        }

        // 모든 문자를 사용했는지 확인
        for (boolean b : used) {
            if (!b) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(answer);
    }
}
