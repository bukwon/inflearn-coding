package inflearn.myAlgorithmn.baekjoon;

import java.util.Scanner;

public class no14002 {
    static int N, point;
    static int[] arr, list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new int[N];
        list = new int[N + 1];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] > list[point]) {
                list[++point] = arr[i];
            } else {
                int dis = lowerBound(0, point, arr[i]);
                list[dis] = arr[i];
            }
        }

        System.out.println(point);
        for (int i : list) {
            if (i == 0) continue;
            System.out.print(i + " ");
        }
    }

    private static int lowerBound(int low, int high, int key) {
        while(low < high) {
            int mid = (low + high) / 2;
            if (list[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return high;
    }
}
