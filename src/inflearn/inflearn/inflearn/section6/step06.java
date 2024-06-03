package inflearn.inflearn.inflearn.section6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class step06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] student = new int[n];
        for (int i = 0; i < n; i++) student[i] = sc.nextInt();
        for (int i: solution(n, student)) {
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> solution(int n, int[] student) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = student.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (student[i] != tmp[i]) answer.add(i + 1);
        }
        return answer;
    }
}
