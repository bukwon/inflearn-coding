package inflearn.myAlgorithmn.section6;

import java.util.*;

public class step07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }
        System.out.println(solution(array, n));
    }

    private static String solution(int[][] array, int n) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    if (o1[1] > o2[1]) return o2[1] - o1[1];
                    else return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < n; i++) {
            sb.append(array[i][0]).append(" ").append(array[i][1]).append("\n");
        }
        return String.valueOf(sb);
    }
}
// 틀림