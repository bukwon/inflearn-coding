package inflearn.myAlgorithmn.programmers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class rank {
    static boolean[] visited; //방문 배열
    static ArrayList<Integer> procedure = new ArrayList<>(); //탐색 순서 list

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] results = new int[n][2];
        for (int i = 0; i < n; i++) {
            results[i][0] = sc.nextInt();
            results[i][1] = sc.nextInt();
        }
        System.out.println(solution(n, results));
    }

    private static int solution(int n, int[][] results) {
        int answer = 0;
        int[][] graph = new int[n+1][n+1];

        for(int i = 0; i < results.length; i++)
            graph[results[i][0]][results[i][1]] = 1; //이김
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                for(int z = 0; z <= n; z++) {
                    if (graph[j][i] == 1 && graph[i][z] == 1)
                        graph[j][z] = 1;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            int game = 0;
            for (int j = 1; j <= n; j++) {
                if (graph[i][j] == 1 || graph[j][i] == 1)
                    game++;
            }
            if (game == n-1)
                answer++;
        }
        return answer;
    }
}
