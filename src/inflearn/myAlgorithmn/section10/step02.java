package inflearn.myAlgorithmn.section10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class step02 {
    static int[][] meetings;
    static int n, endTime = 0, startTime = Integer.MAX_VALUE, answer = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        meetings = new int[n][2];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = sc.nextInt();
            meetings[i][1] = sc.nextInt();
        }
        solution();

        System.out.println(answer);
    }

    private static void solution() {
        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]){
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });
        endTime = meetings[0][1];
        startTime = meetings[0][0];

        for (int i = 0; i < n; i++) {
            if (endTime <= meetings[i][0]) {
                answer++;
                endTime = meetings[i][1];
            }
        }
    }
}
