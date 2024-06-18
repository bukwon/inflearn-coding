package inflearn.myAlgorithmn.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class no2824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        int target = sc.nextInt();
        System.out.println(solution(nums, target));
    }

    private static int solution(List<Integer> nums, int target) {
        int answer = 0;
        Collections.sort(nums);
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) >= target) continue;
                answer ++;
            }
        }
        return answer;
    }
}
