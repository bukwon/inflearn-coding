package inflearn.myAlgorithmn.baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class no2631 {
    static int point = 0, N;
    static int[] arr;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        list.add(0);
        for (int i = 0; i < N; i++) {
            if (list.get(point) < arr[i]) {
                point++;
                list.add(arr[i]);
            } else {
                int idx = lowerBound(0, point, arr[i]);
                list.set(idx, arr[i]);
            }
        }
        System.out.println(arr.length - (list.size() - 1));
    }

    private static int lowerBound(int low, int high, int key) {
        while(low < high) {
            int mid = (low + high) / 2;

            if(list.get(mid) < key) { //mid값보다 현재 key값이 크다면 오른쪽에서 탐색
                low = mid + 1;
            }
            else { //작을경우 왼쪾에서 탐색
                high = mid;
            }
        }
        return high;
    }
}
