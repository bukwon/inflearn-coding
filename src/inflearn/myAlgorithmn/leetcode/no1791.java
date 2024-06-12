package inflearn.myAlgorithmn.leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class no1791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] edge = new int[n][2];
        for (int i = 0; i < n; i++) {
            edge[i][0] = sc.nextInt();
            edge[i][1] = sc.nextInt();
        }
        System.out.println(solution(edge));
    }

    private static int solution(int[][] edge) {
        int answer = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int[] ints : edge) {
            hashMap.put(ints[0], hashMap.getOrDefault(ints[0], 0) + 1);
            hashMap.put(ints[1], hashMap.getOrDefault(ints[1], 0) + 1);
        }

        for (int i: hashMap.keySet()) {
            if (answer < hashMap.get(i)) answer = i;
        }
        return answer;
    }
}
