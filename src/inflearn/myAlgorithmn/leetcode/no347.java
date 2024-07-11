package inflearn.myAlgorithmn.leetcode;

import java.util.*;

public class no347 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i: solution(nums, k)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(int[] nums, int k) {
        int[] answer = new int[k];
        int[] countNum = new int[10];

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i: nums) {
            countNum[i]++;
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(hashMap.keySet());

        list.sort((o1, o2) ->
                hashMap.get(o2).compareTo(hashMap.get(o1)));

        for (int i = 0; i < k; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
