package inflearn.inflearn.inflearn.test;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println(solution(number));
    }

    public static int answer;
    public static boolean[] visited;

    public static int solution(int[] number) {
        answer = 0;
        visited = new boolean[number.length];
        backtracking(0, 0, 0, number);
        return answer;
    }

    public static void backtracking(int index, int depth, int sum, int[] number) {
        if (depth == 3) {
            if (sum == 0) {
                answer++;
            }
            return;
        }

        for (int i = index; i < number.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                backtracking(i + 1, depth + 1, sum + number[i], number);
                visited[i] = false;
            }
        }
    }
}