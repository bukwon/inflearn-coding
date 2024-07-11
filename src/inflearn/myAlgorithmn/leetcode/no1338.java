package inflearn.myAlgorithmn.leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class no1338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        final int[] counts = new int[100001];

        for(final int v : arr)
            counts[v]++;

        final Queue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

        for(int i = 0; i < 100001; ++i)
            if(counts[i] != 0)
                queue.offer(counts[i]);

        int size = (arr.length + 1) / 2, res = 0;

        while(size > 0) {
            size -= queue.poll();
            res++;
        }

        return res;
    }
}
