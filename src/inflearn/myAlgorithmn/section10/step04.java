package inflearn.myAlgorithmn.section10;

import java.util.*;

public class step04 {
    static int answer = 0;
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        arr = new int[N + 1][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        int check = arr[0][1];

        int i = 0;
        while(check > 0) {
            if (i >= N || check > arr[i][1]) {
                answer += priorityQueue.poll();
                check --;
            } else {
                priorityQueue.add(arr[i][0]);
                i++;
            }
        }
        System.out.println(answer);
    }
}
