package inflearn.myAlgorithmn.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class no1282 {
    public static Scanner sc;
    public static List<Integer> arrRowItems;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] groupSizes = new int[n];
        for (int i = 0; i < n; i++) {
            groupSizes[i] = sc.nextInt();
        }
        for (List<Integer> list : solution(groupSizes)) {
            System.out.println(list);
        }
    }

    private static List<List<Integer>> solution(int[] groupSizes) {
        List<List<Integer>> answer = new ArrayList<>();
        int maxNum = Arrays.stream(groupSizes).max().getAsInt();

        for (int i = 0; i < maxNum; i++) {
            arrRowItems = new ArrayList<>();

            int j = 0;

            while (j < groupSizes.length) {
                if (groupSizes[j] == i + 1 && !answer.contains(j)) {
                    if (arrRowItems.size() >= i+1) {
                        answer.add(arrRowItems);
                        arrRowItems = new ArrayList<>();
                    }
                    arrRowItems.add(j);
                }
                j++;
            }
            if (!arrRowItems.isEmpty()) answer.add(arrRowItems);
        }

        return answer;
    }
}