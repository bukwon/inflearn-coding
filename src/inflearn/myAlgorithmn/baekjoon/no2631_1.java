package inflearn.myAlgorithmn.baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class no2631_1 {
    static List<Integer> dp = new ArrayList<>(); // dp 저장
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(getLISByBinarySearch(arr));
        System.out.println(dp);
    }
    static int getLISByBinarySearch(int[] arr) { // 이진 탐색


        for (int num : arr) {
            if (dp.isEmpty() || num > dp.get(dp.size() - 1)) dp.add(num); // 처음이거나 마지막 숫자보다 크면 업데이트
            else {
                int left = 0, right = dp.size() - 1;
                while (left < right) { // 이진 탐색
                    int mid = left + (right - left) / 2;
                    if (dp.get(mid) < num) left = mid + 1;
                    else right = mid;
                }
                dp.set(right, num); // 위치에 값 업데이트
            }
        }

        return dp.size();
    }
}
