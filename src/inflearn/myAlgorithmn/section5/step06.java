package inflearn.myAlgorithmn.section5;

import java.util.*;

public class step06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n, k));
    }

    private static int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) queue.offer(i);
        int count = 0;
        while (queue.size() > 1) {
            count ++;
            if(count == k) {
                queue.remove();
                count = 0;
            }
            else {
                int tmp = queue.remove();
                queue.offer(tmp);
            }
        }
        answer = queue.element();
        return answer;
    }
}
