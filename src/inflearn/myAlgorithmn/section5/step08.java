package inflearn.myAlgorithmn.section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class step08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dangerous = new int[n];
        for (int i = 0; i < n; i++) dangerous[i] = sc.nextInt();
        System.out.println(solution(n, m, dangerous));
    }

    private static int solution(int n, int m, int[] dangerous) {
        int answer = 0;
        Queue<person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(new person(i, dangerous[i]));
        }
        while(!Q.isEmpty()) {
            person tmp = Q.poll();
            for (person x: Q) {
                if (x.number > tmp.number) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer ++;
                if(tmp.id == m) return answer;
            }
        }
        return answer;
    }
}

class person {
    int id;
    int number;

    public person(int id, int number) {
        this.id = id;
        this.number = number;
    }
}