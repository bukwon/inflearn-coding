package inflearn.myAlgorithmn.baekjoon;

import java.util.Scanner;

public class no12738 {
    static int N, point;
    static int[] arr, list; // arr은 입력 값, list는 저장 값
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];
        list = new int[N + 1];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <= N; i++) {
            list[i] = Integer.MIN_VALUE;
        }
        
        point = 0;

        for (int i = 0; i < N; i++) {
            if (list[point] < arr[i]) {
                list[++point] = arr[i];
            }
            else {
                int dis = lowerBound(0, point, arr[i]);
                list[dis] = arr[i];
            }
        }
        System.out.println(point);
    }

    private static int lowerBound(int low, int high, int key) {
        while(low < high) {
            int mid = (low + high) / 2;
            if (list[mid] < key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return high;
    }
}
