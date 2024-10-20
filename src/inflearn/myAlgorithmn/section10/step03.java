package inflearn.myAlgorithmn.section10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class step03 {
    static int[][] schedule;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        schedule = new int[N][2];

        for (int i = 0; i < N; i++) {
            schedule[i][0] = sc.nextInt();
            schedule[i][1] = sc.nextInt();
        }

        Arrays.sort(schedule, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]){
                    return o2[0] - o1[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });

        int seq = 1, check = 1,answer = Integer.MIN_VALUE;
        int checkTime = schedule[0][1];
        while(seq < N - 1) {
            if (checkTime > schedule[seq][0] && checkTime < schedule[seq][1]) {
                check ++;
                seq++;
            }
            else {
                answer = Math.max(check, answer);
                checkTime = schedule[seq][1];
                check = 1;
                seq++;
            }
        }
        System.out.println(answer);
    }
}
