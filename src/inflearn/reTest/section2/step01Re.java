package inflearn.myAlgorithmn.section2;

import java.util.ArrayList;
import java.util.Scanner;

public class step01Re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i: bigInt(arr, n)) {
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> bigInt(int[] arr, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }
}
