package inflearn.myAlgorithmn.section5;

import java.util.Scanner;
import java.util.Stack;

public class step03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(solution(n, board, moves));
    }

    private static int solution(int n, int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i: moves) {
            for (int j = 1; j <= n; j++) {
                if (board[j][i] != 0) {
                    if (board[j][i] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    }
                    else stack.push(board[j][i]);
                    board[j][i] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}