package inflearn.myAlgorithmn.section11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class step03 {
    static int[] arr;
    static int[] dy;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        dy = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(arr[i]);
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (list.get(count) > arr[j]) {
                    list.add(arr[j]);
                    count++;
                }
                else list.set(count, arr[j]);
            }
            if (list.size() > result) result = list.size();
        }
        return result;
    }
}
